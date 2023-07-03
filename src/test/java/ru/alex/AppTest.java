package ru.alex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.alex.thQuest.bean.UserBean;
import ru.alex.thQuest.config.AppConfiguration;

class AppTest {

    private final String USER_NAME = "sasha";

    @Test
    void testCreateBean_WithInjectedName() {
        var applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);

        var userBean = applicationContext.getBean(UserBean.class);

        Assertions.assertEquals(USER_NAME, userBean.getName());

    }
}
