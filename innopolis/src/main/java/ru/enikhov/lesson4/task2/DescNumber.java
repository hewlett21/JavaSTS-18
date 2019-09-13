package ru.enikhov.lesson4.task2;

import java.util.Scanner;

public class DescNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oddEvent;
        System.out.print("Укажите любое число (положительное или отрицательное):");
        int numIn = scanner.nextInt();
        if (numIn == 0) {
            System.out.println("Вы указали число 0");
        } else {
            if (numIn > 0) {
                System.out.println("Число " + numIn + " положительное");
            } else {
                System.out.println("Число " + numIn + " отрицательное");
            }
            oddEvent = Math.abs(numIn % 2);
            switch (oddEvent) {
                case 1:
                    System.out.println("Число " + numIn + " нечетное");
                    break;
                case 0:
                    System.out.println("Число " + numIn + " четное");
            }
        }
        scanner.close();
    }
}
