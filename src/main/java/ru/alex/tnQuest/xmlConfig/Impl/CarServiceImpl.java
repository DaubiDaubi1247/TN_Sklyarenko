package ru.alex.tnQuest.xmlConfig.Impl;

import ru.alex.tnQuest.dto.CarDto;
import ru.alex.tnQuest.xmlConfig.CarService;

public class CarServiceImpl implements CarService {
    @Override
    public CarDto createCar(CarDto carDto) {
        return new CarDto(carDto.getNumber());
    }
}
