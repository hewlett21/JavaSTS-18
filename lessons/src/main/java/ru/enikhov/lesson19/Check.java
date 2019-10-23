package ru.enikhov.lesson19;

import java.util.Locale;

public class Check {
    private String product;     //название продукта;
    private Float quantity;     //количество товара;
    private Float price;        //цена за еденицу товара;
    private float allSumma = 0; // Итоговая сумма

    public float getAllSumma() {
        return allSumma;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getQuantity() {
        int outInt;
        float outFloat;
        outInt = quantity.intValue(); // извлекаем целую часть из считанного веса, объема или количества товара
        outFloat = outInt - quantity; // извлекаем дробную часть
        //если дробная часть 0, то возвращаем строковое представление int, иначе float
        //чтобы при печати целых значений не было 0 после запятой
        return (outFloat == 0) ? String.format("%s", outInt) : String.format("%6.3f", quantity);
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // фортматированный вывод чека на консоль
    public void printCheck() {
        String res = String.format("%-20s %7.2f x %6s\t%10s\n", product, price, getQuantity(), getSumma());
        System.out.print(res);
        //привидение к типу Float, для правильного округления итоговой суммы
        allSumma += Float.parseFloat(String.format(Locale.US, "%.2f", quantity * price));
    }

    public void printTitle() {
        System.out.println("Наименование            Цена   Кол-во    Стоимость");
        System.out.println("==================================================");
    }

    public void printBottom() {
        System.out.printf("==================================================\n");
        System.out.printf("Итого:%36s %s", ' ', getAllSumma());
    }

    private String getSumma() {
        return String.format("=%.2f", quantity * price);
    }

}
