package ru.alex.utils.person;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersonHandler {

    public static List<String> getAddressListWhereAgeGreaterThan(List<Person> personList, int minAge) {
        return personList.stream()
                .filter(Objects::nonNull)
                .filter(person -> person.getAge() > minAge)
                .map(Person::getAddress)
                .filter(Objects::nonNull)
                .toList();
    }

    public static List<Person> getPersonListWithRandomAgeAndAddress() {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            personList.add(PersonCreator.createPerson(10));
        }

        return personList;
    }
}
