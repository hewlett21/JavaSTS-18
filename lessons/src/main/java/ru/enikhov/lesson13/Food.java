package ru.enikhov.lesson13;

//Доступные продукты
public enum Food {
    APPLE("Яблоко"), CHEESE("Сыр"), FISH("Рыба"), BANANA("Банан"), MILK("Молоко"),
    MEAT("Мясо"), COOKIES("Печенье"), JUICE("Сок"), OATPORRIDGE("Овсянная каша"),
    SEMOLINAPORIDGE("Манная каша"), BROCCOOLI("Брокколи"), CABBAGE("Капуста"),
    BEET("Свекла"), CHICKEN("Курица"), VEGETABLEMARROW("Кабачок"),
    TOMATO("Помидор"), CUCUMBER("Огурец");

    private String title;

    Food(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
