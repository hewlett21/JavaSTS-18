package ru.enikhov.lesson22;

import java.util.Comparator;

//компаратор сортирует по возрасту и имени
public class PersonSuperComparatorAgeName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int nameCompare = Integer.valueOf(o1.getAge()).compareTo(o2.getAge());
        if (nameCompare != 0) {
            return nameCompare;
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
