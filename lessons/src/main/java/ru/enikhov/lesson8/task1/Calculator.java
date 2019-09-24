package ru.enikhov.lesson8.task1;

public class Calculator {
    static int sum(int one, int two) {
        return one + two;
    }

    static double sum(double one, double two) {
        return one + two;
    }

    static int minus(int one, int two) {
        return one - two;
    }

    static double minus(double one, double two) {
        return one - two;
    }

    static int multi(int one, int two) {
        return one * two;
    }

    static double multi(double one, double two) {
        return one * two;
    }

    static double div(int one, int two) {
        return (double) one / two;
    }

    static double div(double one, double two) {
        return one / two;
    }

    static double percent(int prc, int num) {
        return ((double) num / 100) * prc;
    }

    static double percent(int prc, double num) {
        return (num / 100) * prc;
    }

}
