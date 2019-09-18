package ru.enikhov.lesson7;

import java.util.Arrays;

public class Work {

    //получаем название напитка
    Drink getDrinkChoice(int num) {
        return Drink.values()[num];
    }

    //получаем цену напитка
    int getDrinkPrice(int num) {
        return getDrinkChoice(num).getPrice();
    }

    int getRangeCount() {
        return Arrays.asList(Drink.values()).size() - 1;
    }
}
