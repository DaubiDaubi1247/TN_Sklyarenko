package ru.alex.dataFabric;

public class BookFabric {

    private static final String AUTHOR = "sasha";

    public static BookDto getBookDto() {
        return new BookDto(AUTHOR);
    }
}
