package ru.alex;

public class User implements Comparable<User> {
    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(User o) {
        int nameComparison = this.name.compareTo(o.name);
        if (nameComparison != 0) {
            return nameComparison;
        }

        // Если имена равны, сравниваем id
        return Integer.compare(this.id, o.id);
    }
}

