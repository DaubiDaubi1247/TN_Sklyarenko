package ru.alex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.alex.dataFabric.BookFabric;
import ru.alex.dataFabric.UserFabric;
import ru.alex.thQuest.annotation.service.BookService;
import ru.alex.thQuest.javaConfig.AppConfiguration;
import ru.alex.thQuest.javaConfig.service.UserService;


public class AppTest {

    @Test
    void testCreateBean_XmlConfig() {
        var applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        var userService = applicationContext.getBean(UserService.class);

        var userDto = UserFabric.getUserDto();
        Assertions.assertEquals(userDto, userService.createUser(userDto));
    }

    @Test
    void testCreateBean_AnnotationConfig() {
        var applicationContext = new AnnotationConfigApplicationContext("ru.alex.thQuest.annotation");

        var bookService = applicationContext.getBean(BookService.class);

        var bookDto = BookFabric.getBookDto();
        Assertions.assertEquals(bookDto, bookService.addBook(bookDto));
    }

    @Test
    void testCreateBean_JavaConfig() {
        var applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);

        var userService = applicationContext.getBean(UserService.class);

        var userDto = UserFabric.getUserDto();
        Assertions.assertEquals(userDto, userService.createUser(userDto));
    }
}
