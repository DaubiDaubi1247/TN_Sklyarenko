package ru.alex.tncrud.dataForTest;

import ru.alex.tncrud.dto.UserDto;

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
}
