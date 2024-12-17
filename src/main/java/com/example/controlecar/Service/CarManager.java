package com.example.controlecar.Service;

import com.example.controlecar.dao.entities.Car;
import com.example.controlecar.dao.repositories.CarRepository;
import com.example.controlecar.dto.CarDto;
import com.example.controlecar.mapper.CarMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class CarManager implements CarService {

    private CarRepository carRepository;
    private CarMapper carMapper;

    @Override
    public CarDto saveCar(CarDto carDto) {
        Car car = carMapper.fromCarDtoToCar(carDto);
        car = carRepository.save(car);
        return carMapper.fromCarToCarDto(car);
    }

    @Override
    public List<CarDto> getCarByModel(String model) {
        List<Car> cars = carRepository.findByModel(model);
        List<CarDto> carDtos = new ArrayList<>();

        for (Car car : cars) {
            carDtos.add(carMapper.fromCarToCarDto(car));
        }

        return carDtos;
    }




}
