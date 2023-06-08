package ru.alex.tnQuest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import ru.alex.tnQuest.annotation.service.Impl.BookServiceImpl;
import ru.alex.tnQuest.dataFabric.BookFabric;
import ru.alex.tnQuest.dataFabric.UserFabric;
import ru.alex.tnQuest.dto.BookDto;
import ru.alex.tnQuest.dto.UserDto;
import ru.alex.tnQuest.javaConfig.service.Impl.UserServiceImpl;


import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
@ImportResource("classpath:applicationContext.xml")
public class AppTest {

    @Mock
    private UserServiceImpl userServiceXml;

    @Mock
    private BookServiceImpl userServiceAnnotation;

    @Mock
    private UserServiceImpl userServiceJavaConfig;

    @Test
    void testCreateBean_XmlConfig() {

        UserDto userDto = UserFabric.getUserDto();
        when(userServiceXml.createUser(any(UserDto.class))).thenReturn(new UserDto(userDto.getName(), userDto.getPassword()));

        Assertions.assertEquals(userDto, userServiceXml.createUser(userDto));
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
