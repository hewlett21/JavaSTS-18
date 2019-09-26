package ru.enikhov.lesson9.animal;


public class Cat extends Animal implements Runable, Climbable {
    @Override
    public void getName() {
        System.out.println("=== Я кошка ===");
    }

    @Override
    public void climb() {
        System.out.println("я умею лазить по деревьям");
    }

    @Override
    public void run() {
        System.out.println("я умею бегать");
    }

    public void getAbilities() {
        run();
        climb();
    }

}
