package ru.enikhov.task1;

public class CostGasoline {

    public static void main(String[] args) {
	double[] price={41.30, 43.70, 45.10};
	double[] volume={10, 15, 25};

	for (int i=0; i<price.length;i++){
	    System.out.println("Заправлено "+volume[i]+" литров, на сумму: "+volume[i]*price[i]+" рублей.");
    }
    }
}