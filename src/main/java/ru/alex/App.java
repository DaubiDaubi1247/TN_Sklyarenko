package ru.alex;

import ru.alex.utils.person.Person;
import ru.alex.utils.person.PersonCreator;
import ru.alex.utils.person.PersonHandler;

import java.util.ArrayList;
import java.util.List;


public class App 
{
        public static void main(String[] args) {
            List<Person> persons = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                persons.add(PersonCreator.createPerson(10));
            }

            PersonHandler.getAddressListWhereAgeGreaterThan(persons, 14)
                    .forEach(System.out::println);
        }
}

