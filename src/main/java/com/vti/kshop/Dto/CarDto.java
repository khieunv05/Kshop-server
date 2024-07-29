package com.vti.kshop.Dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter

public class CarDto {
    private String licensePlate;
    private LocalTime repairDate;
    private String customerName;
    private String catalogs;
    private String carMaker;
}
