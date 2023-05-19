package ru.alex.tncrud.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import ru.alex.tncrud.dto.UserDto;
import ru.alex.tncrud.dto.UserWithPasswordDto;
import ru.alex.tncrud.path.UserPathTest;
import ru.alex.tncrud.service.UserService;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static ru.alex.tncrud.dataForTest.UserTestData.userTestData;
import static ru.alex.tncrud.dataForTest.UserTestData.userTestDataAfterSave;

@WebMvcTest(UserController.class)
@AutoConfigureMockMvc(addFilters = false)
class UserControllerTest {

    protected final ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    protected MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    void createUser() throws Exception {

        UserDto userTestDataAfterSave = userTestDataAfterSave();

        when(userService.createUser(any(UserWithPasswordDto.class))).thenReturn(userTestDataAfterSave());

        mockMvc.perform(post(UserPathTest.BASE_USER_PATH.getPath())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(userTestData())))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(userTestDataAfterSave.getId()))
                .andExpect(jsonPath("$.firstName").value(userTestDataAfterSave.getFirstName()))
                .andExpect(jsonPath("$.lastName").value(userTestDataAfterSave.getLastName()))
                .andExpect(jsonPath("$.email").value(userTestDataAfterSave.getEmail()));
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