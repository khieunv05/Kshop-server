package com.vti.kshop.Controller;

import com.vti.kshop.Entity.Car;
import com.vti.kshop.Form.CarCreateForm;
import com.vti.kshop.Dto.CarDto;
import com.vti.kshop.Form.CarUpdateForm;
import com.vti.kshop.Service.CarService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@Validated
@CrossOrigin("http://127.0.0.1:5500/")
//@CrossOrigin("https://khieunv05.github.io/")
public class CarController {
    private final CarService carService;

    @GetMapping("/api/v1/cars")
    public Page<CarDto> findAll(Pageable pageable){
        return carService.findAll(pageable);
    }

    @PostMapping("/api/v1/cars")
    public CarDto create(@RequestBody @Valid CarCreateForm form){
        return carService.create(form);
    }

    @DeleteMapping("/api/v1/cars")
    public void delete(@RequestBody Car.CarPK id){
        carService.delete(id);
    }

    @PutMapping("/api/v1/cars")
    public CarDto update(@RequestBody @Valid CarUpdateForm form){
        return carService.update(form);
    }
}
