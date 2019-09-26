package ru.enikhov.lesson9.animal;

public class Fish extends Animal implements Swimable {
    @Override
    public void getName() {
        System.out.println("=== Я рыба ===");
    }

    @Override
    public void swim() {
        System.out.println("я умею плавать!");
    }

    public void getAbilities() {
        swim();
    }

}
