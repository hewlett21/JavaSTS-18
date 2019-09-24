package ru.enikhov.lesson8.task1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInt = 0, secondInt = 0;
        double firstDouble = 0.0, secondDouble = 0.0;
        System.out.println("Укажите первое число:");
        if (scanner.hasNextInt()) {
            firstInt = scanner.nextInt();
        } else if (scanner.hasNextDouble()) {
            firstDouble = scanner.nextDouble();
        }
        System.out.println("Укажите второе число:");
        if (scanner.hasNextInt()) {
            secondInt = scanner.nextInt();
        } else if (scanner.hasNextDouble()) {
            secondDouble = scanner.nextDouble();
        }

        System.out.println(firstDouble);
        System.out.println("Укажите операцию: 1. Сложение; 2. Вычитание; 3. Умножение; 4. Деление; 5. Процент от числа");
        int action = scanner.nextInt();
        switch (action) {
            case 1:
                System.out.println("Сложение:");
                if (firstInt != 0 && secondInt != 0) {
                    System.out.println(Calculator.sum(firstInt, secondInt));
                } else {
                    System.out.println(Calculator.sum(firstDouble, secondDouble));
                }
                break;
            case 2:
                System.out.println("Вычитание:");
                if (firstInt != 0 && secondInt != 0) {
                    System.out.println(Calculator.minus(firstInt, secondInt));
                } else {
                    System.out.println(Calculator.minus(firstDouble, secondDouble));
                }
                break;
            case 3:
                System.out.println("Умножение:");
                if (firstInt != 0 && secondInt != 0) {
                    System.out.println(Calculator.multi(firstInt, secondInt));
                } else {
                    System.out.println(Calculator.multi(firstDouble, secondDouble));
                }
                break;
            case 4:
                System.out.println("Деление:");
                if (firstInt != 0 && secondInt != 0) {
                    System.out.println(Calculator.div(firstInt, secondInt));
                } else {
                    System.out.println(Calculator.div(firstDouble, secondDouble));
                }
                break;
            case 5:
                System.out.println("Процент от числа:");
                if (firstInt != 0 && secondInt != 0) {
                    System.out.println(Calculator.percent(firstInt, secondInt));
                } else {
                    System.out.println(Calculator.percent(firstInt, secondDouble));
                }
        }

    }
}