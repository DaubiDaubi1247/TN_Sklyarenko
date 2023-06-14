package ru.alex.repository;

import lombok.AllArgsConstructor;
import ru.alex.entity.User;
import ru.alex.utils.HibernateSessionFactory;

import java.util.List;

@AllArgsConstructor
public class UserRepository {

    private static final String GET_ALL_USERS_SQL = "SELECT * " + "FROM person ";

    public static List<User> getAllUsers() {

        List<User> userList;

        try ( var session = HibernateSessionFactory.getSessionFactory().openSession()) {
            session.beginTransaction();

            userList = session.createNativeQuery(GET_ALL_USERS_SQL, User.class).getResultList();

            session.getTransaction().commit();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return userList;
    }
}
