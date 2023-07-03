package ru.alex.dataFabric;

import ru.alex.thQuest.dto.CarDto;

public class CarFabric {
    private static final String CAR_NUMBER = "123";

    public static CarDto getCarDto() {
        return new CarDto(CAR_NUMBER);
    }
}
