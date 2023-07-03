package ru.alex.thQuest.xmlConfig.Impl;

import ru.alex.thQuest.dto.CarDto;
import ru.alex.thQuest.xmlConfig.CarService;

public class CarServiceImpl implements CarService {
    @Override
    public CarDto createCar(CarDto carDto) {
        return new CarDto(carDto.getNumber());
    }
}
