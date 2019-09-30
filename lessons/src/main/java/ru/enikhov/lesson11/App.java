package ru.enikhov.lesson11;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        //заменяем слово бяка с утетом того что слева или справа от "бяка" нет букв
        String inStr = "бяка кулебяка  !!!бяка   бука кулебяка бяка 233 опятьбяка 2бяка   _бяка №бяка опаньки 1234бяка бяка>> бяка> бякабука";
        System.out.println("Строка на входе:");
        System.out.println(inStr);
        String resultStr = Censor.replace(inStr);
        System.out.println("Строка после цензуры:");
        System.out.println(resultStr);
    }
}