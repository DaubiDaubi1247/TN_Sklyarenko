package ru.alex.tncrud.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import ru.alex.tncrud.service.UserService;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(UserController.class)
class UserControllerTest {

    @MockBean
    private UserService hotelService;

    @Test
    void createUser() {

    }

    @Test
    void getUserById() {
    }

    @Test
    void updateUserInfo() {
    }

    @Test
    void deleteUser() {
    }
}