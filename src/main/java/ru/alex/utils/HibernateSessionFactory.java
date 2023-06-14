package ru.alex.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.alex.entity.Bank;
import ru.alex.entity.User;

public class HibernateSessionFactory {

    private static final SessionFactory sessionFactory;

    static {
        try {
            Configuration configuration = new Configuration().configure();
            configuration.addAnnotatedClass(User.class);
            configuration.addAnnotatedClass(Bank.class);
            sessionFactory = configuration.buildSessionFactory();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
