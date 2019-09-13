package ru.enikhov.lesson4.task1;

import java.util.Scanner;

public class GreatLess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите первое число:");
        int numOne = scanner.nextInt();
        System.out.print("Укажите второе число:");
        int numTwo = scanner.nextInt();
        String result = (numOne > numTwo) ? "Число " + numTwo + " меньше чем " + numOne : "Число " + numOne + " меньше чем " + numTwo;
        System.out.println(result);
        scanner.close();
    }
}
