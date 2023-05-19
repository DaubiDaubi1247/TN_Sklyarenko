package ru.alex.tncrud.path;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UserPathTest {

    BASE_USER_PATH(BasePath.BASE_PATH + "user"),
    USER_PATH_WITH_ID(BASE_USER_PATH.getPath() + "/1"),
    ;

    private final String path;
}
