package ru.alex.thQuest.bean;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class UserBean {

    @Value("${userBean.name}")
    private String name;

    @Value("${user.password}")
    private String password;
}
