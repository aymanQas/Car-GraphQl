package com.example.controlecar.mapper;

import com.example.controlecar.dao.entities.Car;
import com.example.controlecar.dto.CarDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    private final ModelMapper mapper = new ModelMapper();

    public Car fromCarDtoToCar(CarDto carDto) {
        return mapper.map(carDto, Car.class);
    }

    public CarDto fromCarToCarDto(Car car) {
        return mapper.map(car, CarDto.class);
    }
}


