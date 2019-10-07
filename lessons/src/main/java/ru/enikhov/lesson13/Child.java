package ru.enikhov.lesson13;

public class Child {
    public void likeFood(String food) {
        System.out.println("Я люблю : " + LikeFood.valueOf(food).getTitle());
    }

    public void notLikeFood(int id) {
        System.out.println("Мама, я не люблю " + Food.values()[id].getTitle());
    }
}
