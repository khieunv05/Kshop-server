package com.vti.kshop.Map;

import com.vti.kshop.Form.CarCreateForm;
import com.vti.kshop.Dto.CarDto;
import com.vti.kshop.Form.CarUpdateForm;
import com.vti.kshop.Entity.Car;

public class CarMapper {
    public static CarDto map(Car car){
        var dto = new CarDto();
        dto.setLicensePlate(car.getPk().getLicensePlate());
        dto.setRepairDate(car.getPk().getRepairDate());
        dto.setCarMaker(car.getCarMaker());
        dto.setCustomerName(car.getCustomerName());
        dto.setCatalogs(car.getCatalogs());
        return dto;
    }

    public static Car map(CarCreateForm form){
        var car = new Car();
        var pk = new Car.CarPK();
        pk.setLicensePlate(form.getLicensePlate());
        pk.setRepairDate(form.getRepairDate());
        car.setPk(pk);
        car.setCarMaker(form.getCarMaker());
        car.setCatalogs(form.getCatalogs());
        car.setCustomerName(form.getCustomerName());
        return car;
    }

    public static void map(CarUpdateForm form,Car car){
        car.setCarMaker(form.getCarMaker());
        car.setCatalogs(form.getCatalogs());
        car.setCustomerName(form.getCustomerName());
    }
}
