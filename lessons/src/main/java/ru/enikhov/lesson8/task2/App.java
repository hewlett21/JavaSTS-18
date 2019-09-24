package ru.enikhov.lesson8.task2;

public class App {
    public static void main(String[] args) {
        System.out.println("Class Count:");
        Count cnt1 = new Count();
        Count cnt2 = new Count();
        Count cnt3 = new Count();
        Count cnt4 = new Count();
        System.out.println("Создали " + Count.getCount() + " объекта.");
    }
}
