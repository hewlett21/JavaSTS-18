package ru.enikhov.lesson2.task1;

public class CostGasoline {

    public static void main(String[] args) {
        double[] price  = {40.00, 42.50, 45.35}; //цена за литр
        double[] volume = {15,25,7};             //объем, литров

        for (int i=0; i<price.length;i++) {
            System.out.println("Заправлено "+volume[i]+" литров, по "+price[i]+" руб. за литр, на сумму: "+volume[i]*price[i]+" руб.");
        }
    }
}
