package ru.enikhov.lesson7;

public enum Drink {
    ТАРХУН(50), БУРАТИНО(40), ЛИМОНАД(40), БАЙКАЛ(50), ВОДА(20), ЧАЙ(30), КОФЕ(40);

    private int price;

    Drink(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}