package ru.alex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.alex.dataFabric.BookFabric;
import ru.alex.dataFabric.CarFabric;
import ru.alex.dataFabric.UserFabric;
import ru.alex.thQuest.annotation.service.BookService;
import ru.alex.thQuest.config.AppConfiguration;
import ru.alex.thQuest.javaConfig.service.UserService;
import ru.alex.thQuest.xmlConfig.CarService;

class AppTest {

    @Test
    void testCreateBean_XmlConfig() {
        var applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);

        var carService = applicationContext.getBean(CarService.class);

        var carDto = CarFabric.getCarDto();
        Assertions.assertEquals(carDto, carService.createCar(carDto));
    }

    @Test
    void testCreateBean_AnnotationConfig() {
        var applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);

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
