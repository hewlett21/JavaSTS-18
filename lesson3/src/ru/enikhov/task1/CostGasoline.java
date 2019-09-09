package ru.enikhov.task1;

import java.util.Scanner;

public class CostGasoline {

    public static void main(String[] args) {
//	double[] price={41.30, 43.70, 45.10}; // Цена за литр.
//	double[] volume={10, 15, 25};         // Кол-во литров.
		Scanner scanner=new Scanner(System.in);
		double price;
		int    value;
		System.out.println("Укажите стоимость бензина за литр: ");
		price=scanner.nextDouble();
		System.out.println("Укажите кол-во литров: ");
		value=scanner.nextInt();

	    System.out.println("Заправлено "+value+" литров, на сумму: "+value*price+" рублей.");
	    scanner.close();
    }
}
