package ru.enikhov.lesson31;

import java.util.LinkedList;
import java.util.Scanner;

public class AppPalindrom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово. Для выхода нажмите 0");
        while (scanner.hasNext()) {
            String in = scanner.next();
            if (in.equals("0")) {
                break;
            } else {
                System.out.println(in);
                System.out.println("First  method =================");
                checkPalindrom(in);
                System.out.println("Second method =================");
                checkPalindrom1(in);
            }
        }
        scanner.close();
    }

    private static void checkPalindrom(String in) {
        char[] charArray = in.toCharArray();
        LinkedList<Character> palList = new LinkedList<>();
        for (char c : charArray) {
            palList.add(c);
        }
        while (!palList.isEmpty()) {
            if (palList.size() == 1) {
                break;
            } else {
                if (!palList.pollFirst().equals(palList.pollLast())) {
                    System.out.println("не палиндром");
                    return;
                }
            }
        }
        System.out.println("палиндром");
    }

    private static void checkPalindrom1(String in) {
        StringBuilder sb = new StringBuilder(in);
        if (in.equals(sb.reverse().toString())) {
            System.out.println("палиндром");
        } else {
            System.out.println("не палиндром");
        }
    }
}
