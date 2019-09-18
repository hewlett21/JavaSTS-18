package ru.enikhov.lesson7;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("==Ассортимент==");
        for (Drink d : Drink.values()) {
            System.out.println("[" + d.ordinal() + "] - " + d + " (" + d.getPrice() + " руб.)");
        }
        loop();// для выхода из двух вложенных циклов. Или можно было использовать метку цикла
    }

    private static void loop() {
        Work work = new Work();
        Scanner scanner = new Scanner(System.in);
        int rangeCount = work.getRangeCount(); //Кол-во позиций в ассортименте
        while (true) {
            System.out.println("Внесите нужную сумму:");
            int summa = scanner.nextInt();
            if (summa == 0) {
                System.out.println("Вы не внесли нужную сумму.");
                System.out.println("Выход - [0] /Продолжить - [любая цифра]");
                int choice = scanner.nextInt();
                if (choice == 0) {
                    break;
                } else {
                    continue;
                }
            }
            while (true) {
                System.out.println("Выберите номер напитка:");
                int numDrink = scanner.nextInt();
                if (numDrink < 0 || numDrink > rangeCount) {//если набранный номер не попадает в диапазон номеров ассортимента
                    System.out.println("Такого товара нет в ассортименте:");
                    continue;
                }
                if (summa < work.getDrinkPrice(numDrink)) {
                    System.out.println("Вы выбрали: " + work.getDrinkChoice(numDrink) + ", цена " + work.getDrinkPrice(numDrink) + " руб.");
                    System.out.println("Ваших средств недостаточно, заберите деньги.");
                } else {
                    System.out.println("Заберите ваш напиток " + work.getDrinkChoice(numDrink));
                    if (summa > work.getDrinkPrice(numDrink)) {
                        int delivery = summa - work.getDrinkPrice(numDrink); //сдача
                        System.out.println("Заберите сдачу " + delivery + " руб.");
                    }
                }
                return;
            }
        }

    }
}
