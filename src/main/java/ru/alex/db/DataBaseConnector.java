package ru.alex.db;

import ru.alex.exception.FileNotFoundException;
import ru.alex.exception.SqlException;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataBaseConnector {
    private static final Connection connection;

    private DataBaseConnector() {
    }

    static {
        Properties property = new Properties();

        try (var propertyFile = new FileInputStream("src/main/resources/application.properties")){
            property.load(propertyFile);
        } catch (IOException e) {
            throw new FileNotFoundException("properties file not found", e);
        }

        try {
            connection = DriverManager.getConnection(property.getProperty("spring.datasource.url"),
                    property.getProperty("spring.datasource.username"),
                    property.getProperty("spring.datasource.password"));
        } catch (SQLException e) {
            throw new SqlException("exception when get connection with db", e);
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
