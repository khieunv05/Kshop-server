package com.vti.kshop.Repository;

import com.vti.kshop.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Car.CarPK> {
}
