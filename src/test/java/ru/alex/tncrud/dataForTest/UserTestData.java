package ru.alex.tncrud.dataForTest;

import ru.alex.tncrud.dto.UserDto;
import ru.alex.tncrud.dto.UserWithPasswordDto;
import ru.alex.tncrud.entity.User;

public class UserTestData {

    public static final int USER_ID_FOR_TEST = 1;
    public static final String NAME_AFTER_UPDATE = "Саша123";

    public static UserDto userTestData() {
        return UserDto.builder()
                .firstName("Саша")
                .lastName("Скляренко")
                .email("sasha@gmail.com")
                .build();
    }

    public static UserDto userTestDataAfterSave() {
        UserDto baseUser = userTestData();
        baseUser.setId(USER_ID_FOR_TEST);

        return baseUser;
    }

    public static UserWithPasswordDto userWithPasswordTestData() {
        return UserWithPasswordDto.builder()
                .firstName("Саша")
                .lastName("Скляренко")
                .email("sasha@gmail.com")
                .password("123")
                .build();
    }

    public static User userForUpdateTestData() {
        return User.builder()
                .firstName("Саша123")
                .lastName("Скляренко")
                .email("sasha@gmail.com")
                .id(USER_ID_FOR_TEST)
                .build();
    }

    public static User userEntityTestData() {
        return User.builder()
                .firstName("Саша")
                .lastName("Скляренко")
                .email("sasha@gmail.com")
                .password("123")
                .id(USER_ID_FOR_TEST)
                .build();
    }
}
