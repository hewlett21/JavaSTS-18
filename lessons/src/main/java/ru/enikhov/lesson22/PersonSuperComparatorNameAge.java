package ru.enikhov.lesson22;

import java.util.Comparator;

//компаратор сортирует по имени и возрасту
public class PersonSuperComparatorNameAge implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int nameCompare = o1.getName().compareTo(o2.getName());
        if (nameCompare != 0) {
            return nameCompare;
        } else {
            return o1.getAge() - o2.getAge();
        }
    }
}
