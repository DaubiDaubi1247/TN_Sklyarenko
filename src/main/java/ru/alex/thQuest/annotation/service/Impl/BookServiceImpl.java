package ru.alex.thQuest.annotation.service.Impl;

import org.springframework.stereotype.Component;
import ru.alex.thQuest.dto.BookDto;
import ru.alex.thQuest.annotation.service.BookService;

@Component
public class BookServiceImpl implements BookService {

    @Override
    public BookDto addBook(BookDto bookDto) {
        return new BookDto(bookDto.getAuthor());
    }
}
