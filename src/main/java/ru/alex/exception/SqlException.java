package ru.alex.exception;

public class SqlException extends RuntimeException{
    public SqlException(String message, Throwable cause) {
        super(message, cause);
    }
}
