package ru.enikhov.lesson2.task2;

public class NetSalary {

    public static void main(String[] args) {
	int[] salaryGross={11000, 25000, 50000};    // зарплата до вычета нолога
	int percent= 13;                            // подоходный налог 13%

        System.out.println("Расчет з/п:");
        for (int salaryNet:salaryGross) {
            System.out.format("Начислено: %d руб., к выдаче %.2f руб.%n",salaryNet, (salaryNet - salaryNet*0.13));
        }
    }
}
