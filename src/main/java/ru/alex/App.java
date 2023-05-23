package ru.alex;

import ru.alex.utils.person.Person;
import ru.alex.utils.person.PersonHandler;

import java.util.List;


public class App 
{

        private final static int PERSON_AGE_FOR_TEST = 14;

        public static void main(String[] args) {

            List<Person> personList = PersonHandler.getPersonListWithRandomAgeAndAddress();

            PersonHandler.getAddressListWhereAgeGreaterThan(personList, PERSON_AGE_FOR_TEST)
                    .forEach(System.out::println);
        }
}

