package ru.enikhov.lesson13;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        Mother mother = new Mother();
        Child child = new Child();
        String food = "";
        System.out.println("Список доступных продуктов:");
        for (Food f : Food.values()) {
            System.out.println(f.ordinal() + ": " + f + ": " + f.getTitle());
        }
        int max = 20; // количество доступных продуктов из Enum Food
        // Всего их 17, 20 для того чтобы просто проверить исключение ArrayIndexOutOfBoundsException
        int id = (int) (Math.random() * ++max);
        try {
            System.out.println("Обед!");
            //предлагаем ребенку случайный продукт и проверяем любит он его или нет
            food = mother.getFood(id).toString();
            try {
                child.likeFood(food);
            } catch (IllegalArgumentException e) {
                child.notLikeFood(id);
            } finally {
                System.out.println("Спасибо мама.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(id + ": продукта с таким номером нет в списке");
        }
    }
}
