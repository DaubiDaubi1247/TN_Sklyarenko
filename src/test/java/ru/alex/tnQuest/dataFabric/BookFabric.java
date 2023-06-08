package ru.alex.tnQuest.dataFabric;


import ru.alex.tnQuest.dto.BookDto;

public class BookFabric {

    private static final String AUTHOR = "sasha";

    public static BookDto getBookDto() {
        return new BookDto(AUTHOR);
    }
}
