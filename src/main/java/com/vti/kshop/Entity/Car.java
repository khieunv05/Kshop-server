package com.vti.kshop.Entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "car")
public class Car {
    @EmbeddedId
    private CarPK pk;

    @Column(name = "customer_name",nullable = false)
    private String customerName;

    @Column(name = "catalogs",nullable = false)
    private String catalogs;

    @Column(name = "car_maker",nullable = false)
    private String carMaker;

    @Getter
    @Setter
    @EqualsAndHashCode
    @Embeddable
    public static class CarPK{
        @Column(name = "license_plate",nullable = false,length = 10)
        private String licensePlate;

        @Column(name = "repair_date",nullable = false)
        private LocalTime repairDate;
    }
}
