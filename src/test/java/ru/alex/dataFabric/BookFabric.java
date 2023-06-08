package ru.alex.dataFabric;

import ru.alex.thQuest.dto.BookDto;

public class BookFabric {

    private static final String AUTHOR = "sasha";

    public static BookDto getBookDto() {
        return new BookDto(AUTHOR);
    }
}
