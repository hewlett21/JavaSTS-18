package ru.enikhov.lesson9.animal;

public class App {

    public static void main(String[] args) {
        System.out.println("===ДЗ lesson9 Animal Class===");
        Dog dog = new Dog();                    //Собака
        Cat cat = new Cat();                    //Кошка
        Fish fish = new Fish();                 //Рыба
        Duck duck = new Duck();                 //Утка
        Crocodile crocodile = new Crocodile();  //Крокодил
        dog.getName();
        dog.getAbilities();                     //Способности собаки
        cat.getName();
        cat.getAbilities();                     //Способности кошки
        duck.getName();
        duck.getAbilities();                    //Способности утки
        fish.getName();
        fish.getAbilities();                    //Способности рыбы
        crocodile.getName();
        crocodile.getAbilities();               //Способности крокодила
    }
}
