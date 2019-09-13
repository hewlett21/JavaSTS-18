package ru.enikhov.lesson3.task2;
import java.util.Scanner;

public class NetSalary {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//	int[] gross={15000, 30000, 50000};
        System.out.println("Укажите начисленную сумму:");
        int gross=scanner.nextInt();
	    int nalog = 13; // подоходный налог 13%
        System.out.println("Начислено: "+ gross+" руб., к выдаче: "+(gross-gross*nalog/100)+" руб.");
        scanner.close();
    }
}
