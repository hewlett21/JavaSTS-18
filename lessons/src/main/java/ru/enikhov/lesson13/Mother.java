package ru.enikhov.lesson13;

public class Mother {
//предлагаем ребенку еду
    public Food getFood(int id) {
        System.out.println("Съешь " + Food.values()[id].getTitle());
        return Food.values()[id]; //Возвращаем значение предложенного продукта из Enum Food
    }
}
