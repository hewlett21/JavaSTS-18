package ru.enikhov.lesson9.animal;

public class Duck extends Animal implements Flyable, Swimable, Runable {
    @Override
    public void getName() {
        System.out.println("=== Я утка ===");
    }

    @Override
    public void fly() {
        System.out.println("я умею летать");
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
        fly();
    }

}
