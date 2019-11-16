package ru.enikhov.lesson29;

import java.util.Objects;

public class Person {
    private int age;
    private String familia;
    private String sex;

    public Person(int age, String familia, String sex) {
        this.age = age;
        this.familia = familia;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(familia, person.familia) &&
                Objects.equals(sex, person.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, familia, sex);
    }

    @Override
    public String toString() {
        return "Person[" +
                "age=" + age +
                "; familia='" + familia + '\'' +
                "; sex='" + sex + '\'' +
                "; hash='" + hashCode() + '\'' +
                ']';
    }

}
