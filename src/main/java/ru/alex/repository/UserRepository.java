package ru.alex.repository;

import ru.alex.entity.User;
import ru.alex.utils.HibernateSessionFactory;

import java.util.List;

public class UserRepository {

    private UserRepository() {
    }

    private static final String GET_ALL_USERS_SQL = "FROM User ";

    public static List<User> getAllUsers() {

        List<User> userList;

        try ( var session = HibernateSessionFactory.getSessionFactory().openSession()) {
            session.beginTransaction();

            userList = session.createQuery(GET_ALL_USERS_SQL, User.class).getResultList();

            session.getTransaction().commit();
        }

        return userList;
    }
}
