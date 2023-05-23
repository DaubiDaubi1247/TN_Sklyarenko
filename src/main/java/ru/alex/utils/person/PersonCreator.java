package ru.alex.utils.person;

public class PersonCreator {

    public static Person createPerson(int minDesiredAge) {
        int random = Double.valueOf(Math.random() * 10).intValue();
        if (random > 5) {
            return new Person(minDesiredAge);
        }
        return null;
    }
}
