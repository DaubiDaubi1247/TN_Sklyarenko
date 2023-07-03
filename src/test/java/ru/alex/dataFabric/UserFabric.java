package ru.alex.dataFabric;

import ru.alex.thQuest.bean.UserBean;

public class UserFabric {


    public static final String USER_NAME = "sasha";
    public static final String USER_PASSWORD = "123";

    public static UserBean getUserDto() {
       return new UserBean(USER_NAME, USER_PASSWORD);
    }
}
