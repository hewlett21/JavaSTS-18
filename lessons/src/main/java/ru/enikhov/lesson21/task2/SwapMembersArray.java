package ru.enikhov.lesson21.task2;

import java.util.Scanner;

public class SwapMembersArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите размер массива:");
        int size = scanner.nextInt();
//объявляем массив, размерностью size
        int[] arrays = new int[size];
        addArray(arrays);
        System.out.println("Начальный массив:");
        printArray(arrays);
        swapArray(arrays);
        System.out.println("Массив после перестановки:");
        printArray(arrays);
    }

//переставляем элементы массива
//двигаясь слева до половины массива,
//меняем местами элементы слева и справа от половины массива
    private static void swapArray(int[] arrays) {
        int buf;
        for (int i = 0; i < arrays.length / 2; i++) {
            buf = arrays[i];
            arrays[i] = arrays[arrays.length - (i + 1)];
            arrays[arrays.length - (i + 1)] = buf;
        }
    }

    //заполняем массив случайными значениями от 0 до 99(включительно)
    private static void addArray(int[] arrays) {
        int range = 100;
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * range);
        }
    }

    private static void printArray(int[] arrays) {
        for (int arr : arrays) {
            System.out.printf("[ %2d ]", arr);
        }
        System.out.println();
    }
}
