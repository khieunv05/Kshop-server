package com.vti.kshop.Service;

import com.vti.kshop.Entity.Car;
import com.vti.kshop.Form.CarCreateForm;
import com.vti.kshop.Dto.CarDto;
import com.vti.kshop.Form.CarUpdateForm;
import com.vti.kshop.Map.CarMapper;
import com.vti.kshop.Repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarServiceImp implements CarService{
    private final CarRepository carRepository;
    @Override
    public Page<CarDto> findAll(Pageable pageable) {
        return carRepository.findAll(pageable).map(CarMapper::map);
    }

    @Override
    public CarDto create(CarCreateForm form) {
        var car = CarMapper.map(form);
        var savedCar = carRepository.save(car);
        return CarMapper.map(savedCar);
    }

    @Override
    public CarDto update(CarUpdateForm form) {
        var pk = new Car.CarPK();
        pk.setRepairDate(form.getRepairDate());
        pk.setLicensePlate(form.getLicensePlate());
        var car = carRepository.findById(pk).get();
        CarMapper.map(form,car);
        var savedCar = carRepository.save(car);
        return CarMapper.map(savedCar);
    }

    @Override
    public void delete(Car.CarPK id) {
        carRepository.deleteById(id);
    }


}
