package ru.enikhov.lesson13;

//Любимые продукты
public enum LikeFood {
    MILK("Молоко"), APPLE("Яблоко"), BANANA("Банан"), CHEESE("Сыр"),
    MEAT("Мясо"), COOKIES("Печенье"), JUICE("Сок"), OATPORRIDGE("Овсянная каша"),
    SEMOLINAPORIDGE("Манная каша"), TOMATO("Помидор"), CUCUMBER("Огурец");

    private String title;

    LikeFood(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
