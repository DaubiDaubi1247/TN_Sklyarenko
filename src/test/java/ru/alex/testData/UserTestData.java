package ru.alex.testData;

import ru.alex.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserTestData {

    public static final List<String> SURNAMES_FOR_TEST = List.of("Иванов", "Сидоров", "Петров", "Наличный");

    private static final List<String> USER_LIST_FOR_TEST = List.of("Иванов Сидор Петрович", "Сидоров Петр Иванович", "Петров Иван Сидорович", "Наличный Артем Андреевич");

    public static List<User> getAllUsers() {

        List<User> userList = new ArrayList<>();

        for (String userFullName : USER_LIST_FOR_TEST) {
            userList.add(User.builder().fullName(userFullName).build());
        }

        return userList;
    }
}
