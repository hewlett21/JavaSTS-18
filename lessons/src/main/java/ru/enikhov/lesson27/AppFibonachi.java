package ru.enikhov.lesson27;

import java.util.Scanner;

public class AppFibonachi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int step;
        System.out.println("Укажите N, (Выход - не цифра):");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                step = scanner.nextInt();
                System.out.println("Число Фибоначчи для N = " + step + ": ");
                System.out.print("Рекурсия: ");
                printRec(step);
                System.out.print("Итерация: ");
                iterFib(step);
            } else {
                break;
            }
        }
    }

    private static void printRec(int step) {
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < step; i++) {
            System.out.print(recFib(i));
            if (i < step - 1) {
                System.out.print(",");
            }
        }
        System.out.println("\nВремя выполнения: " + (System.currentTimeMillis() - timeStart)+" ms");
    }

    private static long recFib(int step) {
        if (step < 2) {
            return step;
        }
        return recFib(step - 1) + recFib(step - 2);
    }

    private static void iterFib(int step) {
        long[] prev = {0, 0};
        long sum = 0;
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < step; i++) {
            if (i < 2) {
                sum = i;
                prev[i] = i;
            } else {
                sum = prev[0] + prev[1];
                prev[0] = prev[1];
                prev[1] = sum;
            }
            System.out.print(sum);
            if (i < step - 1) {
                System.out.print(",");
            }
        }
        System.out.println("\nВремя выполнения: " + (System.currentTimeMillis() - timeStart)+" ms");
    }

}
