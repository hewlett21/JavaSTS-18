package ru.enikhov.lesson14;

import java.util.Scanner;
import  org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    static Logger logger=LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.trace("Запустили приложение");
        System.out.println("==Ассортимент==");
        for (Drink d : Drink.values()) {
            System.out.println("[" + d.ordinal() + "] - " + d + " (" + d.getPrice() + " руб.)");
        }
        loop();// для выхода из двух вложенных циклов. Или можно было использовать метку цикла
        logger.trace("Вышли из приложение");
    }

    private static void loop() {
        Work work = new Work();
        Scanner scanner = new Scanner(System.in);
        int rangeCount = work.getRangeCount(); //Кол-во позиций в ассортименте
        while (true) {
            System.out.println("Внесите нужную сумму:");
            int summa = scanner.nextInt();
            logger.info("пользователь внес сумму {}", summa);
            if (summa == 0) {
                logger.info("Сумму не внесли,  {} руб.", summa);
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
                logger.info("Выбрали напиток {}", work.getDrinkChoice(numDrink));
                if (numDrink < 0 || numDrink > rangeCount) {//если набранный номер не попадает в диапазон номеров ассортимента
                    logger.info("Такого напитока нет в ассортименте {}", numDrink);
                    System.out.println("Такого товара нет в ассортименте:");
                    continue;
                }
                if (summa < work.getDrinkPrice(numDrink)) {
                    logger.trace("Вы выбрали: " + work.getDrinkChoice(numDrink) + ", цена " + work.getDrinkPrice(numDrink) + " руб.");
                    logger.trace("Ваших средств недостаточно, заберите деньги.");
                    System.out.println("Вы выбрали: " + work.getDrinkChoice(numDrink) + ", цена " + work.getDrinkPrice(numDrink) + " руб.");
                    System.out.println("Ваших средств недостаточно, заберите деньги.");
                } else {
                    logger.info("Заберите напиток {}", work.getDrinkChoice(numDrink));
                    System.out.println("Заберите ваш напиток " + work.getDrinkChoice(numDrink));
                    if (summa > work.getDrinkPrice(numDrink)) {
                        int delivery = summa - work.getDrinkPrice(numDrink); //сдача
                        logger.info("Заберите сдачу " + delivery + " руб.");
                        System.out.println("Заберите сдачу " + delivery + " руб.");
                    }
                }
                return;
            }
        }

    }
}
