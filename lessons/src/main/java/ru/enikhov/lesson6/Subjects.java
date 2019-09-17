package ru.enikhov.lesson6;

public class Subjects {
    private String firstName;
    private String secondName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Описание субъекта
    public String getDescSubject() {
        return getFirstName() + " " + getSecondName() + " " + getAge() + ", лет.";
    }
}
