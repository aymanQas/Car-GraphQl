package com.example.controlecar.Service;

import com.example.controlecar.dto.CarDto;

import java.util.List;

public interface CarService {
    CarDto saveCar(CarDto carDto);
    List<CarDto> getCarByModel(String model);

}

