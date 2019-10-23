package ru.enikhov.lesson19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Price {

    public static void main(String[] args) {
        Check check = new Check();
        try (Scanner scanner = new Scanner(new File("products.txt"));) {
            scanner.useDelimiter("\n");
            scanner.useLocale(Locale.US);   //выбираем локаль, для считывания float
            check.printTitle();             // печатаем шапку чека
            while (scanner.hasNext()) {
                check.setProduct(scanner.next());       // название продукта
                check.setQuantity(scanner.nextFloat()); // количество
                check.setPrice(scanner.nextFloat());    // цена за еденицу товара
                check.printCheck();                     // печатаем "тело" чека
            }
            check.printBottom();                        // печатаем итоговую сумму чека
        } catch (FileNotFoundException e) {
            System.out.printf("Файл не найден.");
        }
    }
}
