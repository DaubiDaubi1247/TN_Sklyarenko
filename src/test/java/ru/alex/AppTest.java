package ru.alex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.alex.utils.person.Person;
import ru.alex.utils.person.PersonHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private final static int PERSON_MIN_AGE_FOR_TEST = 14;
    private final static int PERSON_AGE_FOR_TEST = 15;
    private final static int PERSON_COUNT_FOR_TEST = 3;
    private final static String ADDRESS_NAME_FOR_TEST = "addr ";

    @Test
    public void getAddressListWhereAgeGreaterThan_CorrectAddress_ExpectedResult() {

        List<String> expectedResult = new ArrayList<>();

        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < PERSON_COUNT_FOR_TEST; i++) {
            Person person = new Person(PERSON_AGE_FOR_TEST);

            String address = ADDRESS_NAME_FOR_TEST + i;
            person.setAddress(address);
            expectedResult.add(address);

            personList.add(person);
        }

        Assertions.assertEquals(expectedResult, PersonHandler.getAddressListWhereAgeGreaterThan(personList, PERSON_MIN_AGE_FOR_TEST));
    }

    @Test
    public void getAddressListWhereAgeGreaterThan_AllAddressIsNull_ExpectedEmptyList() {

        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < PERSON_COUNT_FOR_TEST; i++) {
            Person person = new Person(PERSON_AGE_FOR_TEST);
            person.setAddress(null);

            personList.add(person);
        }

        Assertions.assertEquals(0, PersonHandler.getAddressListWhereAgeGreaterThan(personList, PERSON_MIN_AGE_FOR_TEST).size());
    }
}
