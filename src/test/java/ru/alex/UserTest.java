package ru.alex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.alex.service.Impl.UserServiceImpl;
import ru.alex.service.UserService;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class UserTest {

    private static final List<String> SURNAMES_FOR_TEST = List.of("Иванов", "Сидоров", "Петров", "Наличный");
    private static UserService userService;

    @BeforeAll
    public static void initService() {
        userService = new UserServiceImpl();
    }


    @Test
    void testGetAllUsersSurnames_ReturnCorrectValues() {
        Assertions.assertEquals(SURNAMES_FOR_TEST, userService.getAllUserSurnames());
    }

}
