package ru.enikhov.lesson3.task3;

import java.util.Scanner;

public class SecondToHour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите кол-во секунд:");
        int second = scanner.nextInt();
        System.out.println("В " + (double) second / 3600 + " часе(ах) " + second + " секунд");
        scanner.close();
    }
}
