package ru.enikhov.lesson3.HotCold;

import java.util.Scanner;

public class HoldCold {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = 100;     //диапазон чисел
        int fNum = 0;        //первое введенное число
        int number = (int) (Math.random() * range); // Загаданое число
        int prevDiff = 0;
        String mess = "";
        System.out.println("Угадайте число от 0 до 100.");
        while (true) {
            int input = scanner.nextInt();
            if (input == number) {
                System.out.println("Вы угадали число!");
                break;
            }
            //для первого угадывания числа проверяем в какую половину диапазона попадает введеное число.
            //если введеное число < загаданного, то проверяем от 0 до загаданного числа.
            //если введеное число > загаданного, то проверяем от загаданного числа до 100.
            //
            if (fNum == 0) {
                if (input < number) {
                    mess = (input <= (int) number / 2) ? "Холодно" : "Горячо";
                } else {
                    mess = (input <= ((int) (range - number) / 2) + number) ? "Горячо" : "Холодно";
                }
                fNum = 1; //все последущие угадывания сравниваем разность по сравнению с прошлым числом
            } else {
                mess = (Math.abs(number - input) <= prevDiff) ? "Горячо" : "Холодно";
            }
            prevDiff = Math.abs(number - input);

            System.out.println("Ваше число: " + input + ":	" + mess);
            scanner.nextLine();
            System.out.println("Продолжить игру (1-да/0-нет)?");
            int exit = scanner.nextInt();
            if (exit != 1) break;
            else System.out.println("Продолжим угадывать число. Угадайте число от 0 до 100.");
        }
        scanner.close();
    }
}
