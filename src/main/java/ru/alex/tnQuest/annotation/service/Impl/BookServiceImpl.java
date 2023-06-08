package ru.alex.tnQuest.annotation.service.Impl;

import org.springframework.stereotype.Component;
import ru.alex.tnQuest.dto.BookDto;
import ru.alex.tnQuest.annotation.service.BookService;

@Component
public class BookServiceImpl implements BookService {

    @Override
    public BookDto addBook(BookDto bookDto) {
        return new BookDto(bookDto.getAuthor());
    }
}