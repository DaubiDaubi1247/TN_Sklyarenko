package ru.alex.db;

import ru.alex.exception.SqlException;
import ru.alex.utils.propertyLoader.Impl.FilePropertyLoader;
import ru.alex.utils.propertyLoader.PropertyLoader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnector {
    private static final Connection connection;

    private DataBaseConnector() {
    }

    static {
        PropertyLoader propertyLoader = new FilePropertyLoader("src/main/resources/application.properties");

        try {
            connection = DriverManager.getConnection(propertyLoader.getProperty("spring.datasource.url"),
                    propertyLoader.getProperty("spring.datasource.username"),
                    propertyLoader.getProperty("spring.datasource.password"));
        } catch (SQLException e) {
            throw new SqlException("exception when get connection with db", e);
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
