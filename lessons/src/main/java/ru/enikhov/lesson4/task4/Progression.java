package ru.enikhov.lesson4.task4;

import java.util.Scanner;

public class Progression {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Укажите первый элемент прогресcии:");
            int fNum = scanner.nextInt();
            System.out.print("Укажите сколько выводить элементов прогрессии:");
            int maxNum = scanner.nextInt();
            System.out.print("Укажите какую прогрессию нужно получить (1-арифметическая/0-геометрическая):");
            int type = scanner.nextInt();
//если не выбрали тип прогрессии, то справшиваем выходить из программмы или нет
            if (type != 1 && type != 0) {
                System.out.print("Нужно выбрать 0 или 1. Попробовать еще раз (1-да/0-нет)?");
                int again = scanner.nextInt();
                if (again == 0) { //если выбрали 0, то выходим из цикла и из программы
                    break;
                }
            } else {
                if (type == 1) { //если type=1, то считаем арифметическую прогрессию
                    System.out.print("Укажите разность арифметической прогрессии:");
                    int step = scanner.nextInt();
                    System.out.println("Арифметическая прогрессия a(n):");
                    for (int i = 1; i <= maxNum; i++) { //цикл по выбранному колчеству элементов прогрессии
                        //an=a1+d(n-1)
                        // d  - разность прогрессии
                        // a1 - первый элемент прогрессии
                        System.out.println("a" + i + ": " + (fNum + (i - 1) * step));
                    }
                } else { //если type=0, то считаем геометрическую прогрессию
                    System.out.print("Укажите знаменатель геометрической прогрессии:");
                    int step = scanner.nextInt();
                    System.out.println("Геометрическая прогрессия b(n):");
                    for (int i = 1; i <= maxNum; i++) { //цикл по выбранному колчеству элементов прогрессии
                        //bn=b1*q(в степени n-1),
                        // q  - знаменатель прогрессии
                        // b1 - первый элемент прогрессии
                        System.out.println("b" + i + ": " + (fNum * (int) Math.pow(step, i - 1)));
                    }

                }
                System.out.println("Еще раз? (1-да/0-нет)");
                int again = scanner.nextInt();
                if (again == 0) { //если выбрали 0, то выходим из цикла и из программы
                    break;
                } else {
                    System.out.println("=================================");
                }
            }
        }
        System.out.print("Пока! Приходите еще!");
        scanner.close();
    }
}
