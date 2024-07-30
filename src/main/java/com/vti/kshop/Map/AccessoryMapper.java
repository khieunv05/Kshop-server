package com.vti.kshop.Map;

import com.vti.kshop.Dto.AccessoryDto;
import com.vti.kshop.Entity.Accessory;
import com.vti.kshop.Entity.Car;
import com.vti.kshop.Form.AccessoryCreateForm;
import com.vti.kshop.Form.AccessoryUpdateForm;

public class AccessoryMapper {
    public static Accessory map(AccessoryCreateForm form){
        var accessory = new Accessory();
        accessory.setName(form.getName());
        accessory.setPrice(form.getPrice());
        accessory.setRepairStatus(form.getRepairStatus());
        accessory.setStatusDamaged(form.getStatusDamaged());
        return accessory;
    }
    public static AccessoryDto map(Accessory accessory){
        var dto = new AccessoryDto();
        dto.setName(accessory.getName());
        dto.setPrice(accessory.getPrice());
        dto.setStatusDamaged(accessory.getStatusDamaged());
        dto.setRepairStatus(accessory.getRepairStatus());
        dto.setRepairDate(accessory.getCar().getPk().getRepairDate());
        dto.setLicensePlate(accessory.getCar().getPk().getLicensePlate());
        return dto;
    }
    public static void map(AccessoryUpdateForm form,Accessory accessory){
        accessory.setName(form.getName());
        accessory.setPrice(form.getPrice());
        accessory.setRepairStatus(form.getRepairStatus());
        accessory.setStatusDamaged(form.getStatusDamaged());
    }
}
