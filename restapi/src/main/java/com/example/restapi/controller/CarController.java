package com.example.restapi.controller;

import com.example.restapi.service.CarService;
import com.example.restapi.user.Car;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/car")
@SecurityRequirement(name = "techgeeknext-api")
public class CarController {

    //Создаем экземпляр бина UserService c помощью аннотации @Autowired
    @Autowired
    CarService carService;

    @PostMapping("/add")
    public Car addCar(Car car) {
        return carService.addCar(car);
    }

    @GetMapping("/get/{carId}")
    public Car getCarById(@PathVariable Integer carId) {
        return carService.getCarById(carId);
    }

    @PutMapping("/put/{carId}")
    public Car putCarById(@PathVariable Integer carId, @RequestBody Car car) {
        return carService.putCarById(carId, car);
    }

    @DeleteMapping("/delete/{carId}")
    public String deleteCarById(@PathVariable Integer carId) {
        return carService.deleteCarById(carId);
    }
}
