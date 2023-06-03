package ru.alex.dataFabric;

import ru.alex.thQuest.dto.UserDto;

public class UserFabric {


    public static final String USER_NAME = "sasha";
    public static final String USER_PASSWORD = "123";

    public static UserDto getUserDto() {
       return new UserDto(USER_NAME, USER_PASSWORD);
    }
}
