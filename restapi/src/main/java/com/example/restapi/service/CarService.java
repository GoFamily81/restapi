package com.example.restapi.service;

import com.example.restapi.user.Car;

import java.util.List;


public interface CarService {

    Car addCar(Car car);

    Car getCarById(Integer carId);

    String deleteCarById(Integer carId);

    Car putCarById(Integer carId, Car car);

    List<Car> getAllCars();
}
