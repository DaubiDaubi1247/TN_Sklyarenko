package ru.alex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.alex.thQuest.App;
import ru.alex.thQuest.bean.DataBaseBean;
import ru.alex.thQuest.bean.UserBean;

@SpringBootTest(classes = App.class)
class AppTest {

    private final String USER_NAME = "sasha";
    private final String DB_PASSWORD = "1234";

    @Autowired
    private UserBean userBean;

    @Autowired
    private DataBaseBean dbDean;

    @Test
    void testCreateBean_WithInjectedName() {

        Assertions.assertEquals(USER_NAME, userBean.getName());
    }

    @Test
    void testCreateBean_WithInjectedDbFromYml() {

        Assertions.assertEquals(DB_PASSWORD, dbDean.getPassword());
    }
}
