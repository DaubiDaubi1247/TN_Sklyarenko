package ru.alex.tncrud.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.alex.tncrud.excetpion.AlreadyExistException;

import javax.validation.ConstraintViolationException;

@RestControllerAdvice
public class ControllerExceptionHandler {
    private ResponseEntity<ErrorMessage> getErrorMessageWithStatus(HttpStatus status, String message) {
        return ResponseEntity.status(status)
                .body(new ErrorMessage(message, status));
    }

    @ExceptionHandler({AlreadyExistException.class})
    public ResponseEntity<ErrorMessage> conflictHandler(RuntimeException exception) {
        return getErrorMessageWithStatus(HttpStatus.CONFLICT, exception.getMessage());
    }

    @ExceptionHandler({ConstraintViolationException.class})
    public ResponseEntity<ErrorMessage> badRequestHandler(RuntimeException exception) {
        return getErrorMessageWithStatus(HttpStatus.BAD_REQUEST, exception.getMessage());
    }
}
