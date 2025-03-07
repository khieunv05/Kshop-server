package com.vti.kshop.Dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter

public class CarDto {
    private String licensePlate;
    private LocalDate repairDate;
    private String customerName;
    private String catalogs;
    private String carMaker;
}
