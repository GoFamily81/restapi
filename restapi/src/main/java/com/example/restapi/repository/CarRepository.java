package com.example.restapi.repository;

import com.example.restapi.user.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

    Car getById(Integer carId);
}
