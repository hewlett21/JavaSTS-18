package ru.enikhov.lesson9.animal;

public class Crocodile extends Animal implements Swimable, Runable {
    @Override
    public void getName() {
        System.out.println("=== Я крокодил ===");
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
