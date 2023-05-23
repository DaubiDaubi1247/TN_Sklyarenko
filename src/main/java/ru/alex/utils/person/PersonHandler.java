package ru.alex.utils.person;

import java.util.List;
import java.util.Objects;

public class PersonHandler {

    public static List<String> getAddressListWhereAgeGreaterThan(List<Person> personList, int age) {
        return personList.stream()
                .filter(Objects::nonNull)
                .filter(person -> person.getAge() > age)
                .map(Person::getAddress)
                .filter(Objects::nonNull)
                .toList();
    }
}
