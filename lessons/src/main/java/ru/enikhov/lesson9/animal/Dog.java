package ru.enikhov.lesson9.animal;

public class Dog extends Animal implements Swimable, Runable {
    @Override
    public void getName() {
        System.out.println("=== Я собака ===");
    }

    @Override
    public void run() {
        System.out.println("я умею бегать");
    }

    @Override
    public void swim() {
        System.out.println("я умею плавать");
    }

    public void getAbilities() {
        run();
        swim();
    }
}
