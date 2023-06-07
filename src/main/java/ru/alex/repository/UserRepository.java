package ru.alex.repository;

import ru.alex.db.DataBaseConnector;
import ru.alex.entity.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private static final String GET_ALL_USERS_SQL = "SELECT * " +
                                                    "FROM person ";

    public static List<User> getAllUsers() {

        List<User> userList = new ArrayList<>();

        try (PreparedStatement preparedStatement = DataBaseConnector.getConnection().prepareStatement(GET_ALL_USERS_SQL)) {
            ResultSet resultSetUser = preparedStatement.executeQuery();

            while (resultSetUser.next()) {
                User user = new User();
                user.setId(resultSetUser.getInt("id"));
                user.setFullName(resultSetUser.getString("full_name"));

                userList.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return userList;
    }
}
