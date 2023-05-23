package ru.alex.utils.person;

public class Person {

    private int age;
    private String address;

    Person(int age) {
        if (age > 15) {
            throw new IllegalArgumentException("Age can`t be more than 15");
        }
        int randomAgeAddition = Double.valueOf(Math.random() * 10).intValue();
        int random = Double.valueOf(Math.random() * 10).intValue();
        this.age = age + randomAgeAddition;
        if (random > 5) {
            this.address = "Amazing street №" + random;
        }
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
