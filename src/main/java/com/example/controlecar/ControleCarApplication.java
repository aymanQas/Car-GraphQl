package com.example.controlecar;

import com.example.controlecar.dao.entities.Car;
import com.example.controlecar.dao.repositories.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ControleCarApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleCarApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CarRepository carRepository) {
        return args -> {
            List<Car> cars = List.of(
                    Car.builder().model("Model1").color("Red").matricul("ABC123").price(2500.0).build(),
                    Car.builder().model("Model2").color("Black").matricul("XYZ789").price(3000.0).build(),
                    Car.builder().model("Model1").color("Blue").matricul("LMN456").price(2700.0).build()
            );

            carRepository.saveAll(cars);
        };
    }


}
