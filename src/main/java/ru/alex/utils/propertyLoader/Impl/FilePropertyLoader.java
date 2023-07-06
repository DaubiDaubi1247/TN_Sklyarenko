package ru.alex.utils.propertyLoader.Impl;

import ru.alex.exception.FileNotFoundException;
import ru.alex.utils.propertyLoader.PropertyLoader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FilePropertyLoader implements PropertyLoader {

    private final Properties property;

    public FilePropertyLoader(String path) {

        property = new Properties();

        try (var propertyFile = new FileInputStream(path)){
            property.load(propertyFile);
        } catch (IOException e) {
            throw new FileNotFoundException("properties file not found", e);
        }
    }

    @Override
    public String getProperty(String key) {
        return property.getProperty(key);
    }
}
