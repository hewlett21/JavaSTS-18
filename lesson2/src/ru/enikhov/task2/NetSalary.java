package ru.enikhov.task2;

public class NetSalary {

    public static void main(String[] args) {
	int[] gross={15000, 30000, 50000};
	int nalog = 13; // подоходный налог 13%
        for (int grossSalary:gross) {
            System.out.println("Начислено: "+ grossSalary+" руб., к выдаче: "+(grossSalary-grossSalary*nalog/100)+" руб.");
        }
    }
}
