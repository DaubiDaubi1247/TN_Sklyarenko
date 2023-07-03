package ru.alex.dataFabric;

public class CarFabric {
    private static final String CAR_NUMBER = "123";

    public static CarDto getCarDto() {
        return new CarDto(CAR_NUMBER);
    }
}
