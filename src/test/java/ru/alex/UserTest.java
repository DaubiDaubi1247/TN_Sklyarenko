package ru.alex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.alex.repository.UserRepository;
import ru.alex.service.Impl.UserServiceImpl;

import static ru.alex.testData.UserTestData.SURNAMES_FOR_TEST;
import static ru.alex.testData.UserTestData.getAllUsers;

@ExtendWith(MockitoExtension.class)
public class UserTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userService;


    @Test
    public void testGetAllUsersSurnames_ReturnCorrectValues() {

        Mockito.when(userRepository.findAll()).thenReturn(getAllUsers());

        Assertions.assertEquals(SURNAMES_FOR_TEST, userService.getAllUserSurnames());
    }

}
