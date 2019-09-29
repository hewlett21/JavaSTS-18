package ru.enikhov.lesson9.animal;

public class App {

    public static void main(String[] args) {
        System.out.println("===ДЗ lesson9 Animal Class===");
        Animal[] animals = new Animal[5];

        animals[0] = new Dog();                    //Собака
        animals[1] = new Cat();                    //Кошка
        animals[2] = new Fish();                   //Рыба
        animals[3] = new Duck();                   //Утка
        animals[4] = new Crocodile();               //Крокодил

        for (Animal a : animals) {
            a.getName();      //название животного
            a.getAbilities(); //способности животного
        }
    }
}
