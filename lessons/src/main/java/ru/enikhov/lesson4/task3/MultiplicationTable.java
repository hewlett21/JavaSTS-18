package ru.enikhov.lesson4.task3;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Укажите до какого числа строить таблицу умножения (от 1 до 10):");
        int range=scanner.nextInt();
        if (range>0 && range <11) {
            for (int i = 1; i <= range; i++) {
                for (int j = 1; j < 11; j++) {
                    System.out.println(i + "x" + j + " = " + i * j);
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Ваше число "+range+" не попадает в диапазон от 0 до 10.\nПопробуйте еще раз.");
        }
        scanner.close();
    }
}
