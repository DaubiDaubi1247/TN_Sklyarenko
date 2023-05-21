package ru.alex.tncrud.dataForTest;

import org.mapstruct.factory.Mappers;
import ru.alex.tncrud.dto.UserDto;
import ru.alex.tncrud.dto.UserWithPasswordDto;
import ru.alex.tncrud.entity.User;
import ru.alex.tncrud.mapper.UserMapper;

public class UserTestData {

    private static final UserMapper userMapper = Mappers.getMapper(UserMapper.class);

    public static final int USER_ID_FOR_TEST = 1;
    public static final String NAME_FOR_TEST = "Саша";
    public static final String LAST_NAME_FOR_TEST = "Скляренко";
    public static final String EMAIL_FOR_TEST = "sasha@gmail.com";
    public static final String PASSWORD_FOR_TEST = "123";
    public static final String NAME_AFTER_UPDATE = "Саша123";

    public static UserDto userTestData() {
        return UserDto.builder()
                .firstName(NAME_FOR_TEST)
                .lastName(LAST_NAME_FOR_TEST)
                .email(EMAIL_FOR_TEST)
                .build();
    }

    public static UserDto userTestDataAfterSave() {
         return userMapper.toDto(userEntityTestData());
    }

    public static UserWithPasswordDto userWithPasswordTestData() {
        return UserWithPasswordDto.builder()
                .firstName(NAME_FOR_TEST)
                .lastName(LAST_NAME_FOR_TEST)
                .email(EMAIL_FOR_TEST)
                .password(PASSWORD_FOR_TEST)
                .build();
    }

    public static User userForUpdateTestData() {
        return User.builder()
                .firstName(NAME_AFTER_UPDATE)
                .lastName(LAST_NAME_FOR_TEST)
                .email(EMAIL_FOR_TEST)
                .id(USER_ID_FOR_TEST)
                .build();
    }

    public static User userEntityTestData() {
        return User.builder()
                .firstName(NAME_FOR_TEST)
                .lastName(LAST_NAME_FOR_TEST)
                .email(EMAIL_FOR_TEST)
                .password(PASSWORD_FOR_TEST)
                .id(USER_ID_FOR_TEST)
                .build();
    }
}
