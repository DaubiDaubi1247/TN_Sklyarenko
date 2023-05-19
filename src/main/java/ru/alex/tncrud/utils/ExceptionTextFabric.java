package ru.alex.tncrud.utils;

public class ExceptionTextFabric {

    public static String emailAlreadyExist(String email) {
        return "user with email = " + email + " already exist";
    }

    public static String entityNotFoundById(Integer id) {
        return "user with id = " + id + " not found";
    }
}
