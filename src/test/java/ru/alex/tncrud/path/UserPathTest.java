package ru.alex.tncrud.path;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UserPathTest {

    BASE_USER_PATH(BasePath.BASE_PATH + "user"),
    ;

    private final String path;
}
