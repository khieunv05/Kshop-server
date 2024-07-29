package com.vti.kshop.Service;

import com.vti.kshop.Entity.Car;
import com.vti.kshop.Form.CarCreateForm;
import com.vti.kshop.Dto.CarDto;
import com.vti.kshop.Form.CarUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CarService {
    Page<CarDto> findAll(Pageable pageable);

    CarDto create(CarCreateForm form);

    CarDto update(CarUpdateForm form);

    void delete(Car.CarPK pk);
}
