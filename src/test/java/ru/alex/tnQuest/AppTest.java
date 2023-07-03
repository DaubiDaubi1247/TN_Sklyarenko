package ru.alex.tnQuest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import ru.alex.tnQuest.annotation.service.Impl.BookServiceImpl;
import ru.alex.tnQuest.dataFabric.BookFabric;
import ru.alex.tnQuest.dataFabric.CarFabric;
import ru.alex.tnQuest.dataFabric.UserFabric;
import ru.alex.tnQuest.dto.BookDto;
import ru.alex.tnQuest.dto.CarDto;
import ru.alex.tnQuest.dto.UserDto;
import ru.alex.tnQuest.javaConfig.service.Impl.UserServiceImpl;
import ru.alex.tnQuest.xmlConfig.Impl.CarServiceImpl;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
class AppTest {

    @MockBean
    private CarServiceImpl userServiceXml;

    @MockBean
    private BookServiceImpl userServiceAnnotation;

    @MockBean
    private UserServiceImpl userServiceJavaConfig;

    @Test
    void testCreateBean_XmlConfig() {

        CarDto carDto = CarFabric.getCarDto();
        when(userServiceXml.createCar(any(CarDto.class))).thenReturn(new CarDto(carDto.getNumber()));

        Assertions.assertEquals(carDto, userServiceXml.createCar(carDto));
    }

    @Test
    void testCreateBean_AnnotationConfig() {

        var bookDto = BookFabric.getBookDto();
        when(userServiceAnnotation.addBook(any(BookDto.class))).thenReturn(new BookDto(bookDto.getAuthor()));

        Assertions.assertEquals(bookDto, userServiceAnnotation.addBook(bookDto));
    }

    @Test
    void testCreateBean_JavaConfig() {

        UserDto userDto = UserFabric.getUserDto();
        when(userServiceJavaConfig.createUser(any(UserDto.class))).thenReturn(new UserDto(userDto.getName(), userDto.getPassword()));

        Assertions.assertEquals(userDto, userServiceJavaConfig.createUser(userDto));
    }
}
