package ru.alex.tncrud.dataForTest;

import ru.alex.tncrud.dto.UserDto;
import ru.alex.tncrud.dto.UserWithPasswordDto;
import ru.alex.tncrud.entity.User;

public class UserTestData {
    public static UserDto userTestData() {
        return UserDto.builder()
                .firstName("Саша")
                .lastName("Скляренко")
                .email("sasha@gmail.com")
                .build();
    }

    public static UserDto userTestDataAfterSave() {
        UserDto baseUser = userTestData();
        baseUser.setId(1);

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

    public static User userEntityTestData() {
        return User.builder()
                .firstName("Саша")
                .lastName("Скляренко")
                .email("sasha@gmail.com")
                .password("123")
                .id(1)
                .build();
    }
}
