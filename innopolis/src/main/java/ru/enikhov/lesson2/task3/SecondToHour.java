package ru.enikhov.lesson2.task3;

public class SecondToHour {

    public static void main(String[] args) {
	int[] second={3600, 1440,600,36000};
        for (int sec:second) {
            System.out.println("В "+(double)sec/3600+" часе(ах) "+sec+" секунд.");
        }
    }
}
