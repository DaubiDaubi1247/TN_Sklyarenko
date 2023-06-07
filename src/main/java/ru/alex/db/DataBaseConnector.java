package ru.alex.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataBaseConnector {
    private static Connection connection;

    static {
        FileInputStream propertyFile;
        Properties property = new Properties();

        try {
            propertyFile = new FileInputStream("src/main/resources/dbConfig.properties");
            property.load(propertyFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            connection = DriverManager.getConnection(property.getProperty("db.url"), property.getProperty("db.user"),
                    property.getProperty("db.password"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
