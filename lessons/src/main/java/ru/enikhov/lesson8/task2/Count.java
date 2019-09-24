package ru.enikhov.lesson8.task2;

public class Count {
    private static int count;

    public Count() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
