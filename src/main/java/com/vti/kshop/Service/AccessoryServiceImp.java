package com.vti.kshop.Service;

import com.vti.kshop.Dto.AccessoryDto;
import com.vti.kshop.Entity.Car;
import com.vti.kshop.Form.AccessoryCreateForm;
import com.vti.kshop.Form.AccessoryUpdateForm;
import com.vti.kshop.Map.AccessoryMapper;
import com.vti.kshop.Repository.AccessoryRepository;
import com.vti.kshop.Repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AccessoryServiceImp implements AccessoryService{
    private final AccessoryRepository accessoryRepository;
    private final CarRepository carRepository;
    @Override
    public AccessoryDto create(AccessoryCreateForm form) {
        var accessory = AccessoryMapper.map(form);
        var pk = new Car.CarPK();
        pk.setRepairDate(form.getRepairDate());
        pk.setLicensePlate(form.getLicensePlate());
        var car = carRepository.findById(pk).get();
        accessory.setCar(car);
        var savedAccessory = accessoryRepository.save(accessory);
        return AccessoryMapper.map(savedAccessory);
    }

    @Override
    public Page<AccessoryDto> findAll(Pageable pageable) {
        return accessoryRepository.findAll(pageable).map(AccessoryMapper::map);
    }

    @Override
    public AccessoryDto update(AccessoryUpdateForm form,Long id) {
        var accessory = accessoryRepository.findById(id).get();
        AccessoryMapper.map(form,accessory);
        var savedAccessory = accessoryRepository.save(accessory);
        return AccessoryMapper.map(savedAccessory);
    }

    @Override
    public void delete(Long id) {
        accessoryRepository.deleteById(id);
    }
}
