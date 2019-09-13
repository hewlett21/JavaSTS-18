package ru.enikhov.lesson3.task1;

import java.util.Scanner;

public class CostGasoline {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price;
        int value;
        System.out.println("Укажите стоимость бензина за литр: ");
        price = scanner.nextDouble();
        System.out.println("Укажите кол-во литров: ");
        value = scanner.nextInt();

        System.out.println("Заправлено " + value + " литров, на сумму: " + value * price + " рублей.");
        scanner.close();
    }
}
