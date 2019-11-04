package ru.enikhov.lesson25.task2;

import java.util.Iterator;
import java.util.Scanner;

public class AppBasket {
    public static void main(String[] args) {
        getMainMenu(); //вызов меню
        processMenu(); //обработка выбора
    }

    private static void getMainMenu() {
//enum используется просто для вывода меню.
        System.out.println("< Меню Корзина >");
        for (MainMenu mm : MainMenu.values()) {
            System.out.printf("[%-40s]\n", mm.getTitle());
        }
    }

    private static void processMenu() {
        Scanner scanner = new Scanner(System.in);
        Basket bc = new BasketClass();
        while (scanner.hasNext()) {
            String command = scanner.next().toUpperCase();
            if (command.equals("В")) {
                System.out.println("Hasta la vista");
                break;
            } else if (command.equals("Д")) {
                appendProduct(scanner, bc); //добавляем продукт в корзину
            } else if (bc.isEmpty()) {
                System.out.println("Корзина пустая.");
            } else {
                switch (command) {
                    case "У":
                        delProduct(scanner, bc);//удаляем выбранный продукт
                        break;
                    case "И":                   //апдейтим количество
                        updateQuantity(scanner, bc);
                        break;
                    case "О":                   //очищаем корзину полностью
                        bc.clear();
                        System.out.println("Корзина очищена.");
                        break;
                    case "С":                   //список товаров в корзине
                        listOutList(bc);
                        break;
                    case "К":                   //количество выбранного товара в корзине
                        countProduct(scanner, bc);
                        break;
                }
            }
            System.out.println("Выберите действие...");
        }
        scanner.close();
    }

    //печать содержимого крзины
    private static void listOutList(Basket bc) {
        Iterator it;
        System.out.println("<Список товаров в корзине:  >");
        System.out.println("|Название:                Кол-во:");
        it = bc.getProducts().iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
        System.out.println("================================");
    }

    private static void appendProduct(Scanner scanner, Basket bc) {
        String productName;
        int quantity;
        productName = setProduct(scanner);
        while (true) {
            quantity = setQuantity(scanner);
            if (quantity > 0) {
                if (!bc.isContain(productName)) {
                    bc.addProduct(productName, quantity);       //если товар новый, то добавляем в корзину
                } else {
                    bc.updateProductQuantity(productName, bc.getProductQuantity(productName) + quantity); //если уже есть такой товар, то меняем только количество
                }
                System.out.printf("Добавлен продукт: %s, кол-во: %d\n", productName, quantity);
                break;
            } else {
                System.out.println("Не указали количество");
                continue;
            }
        }
    }

    private static void countProduct(Scanner scanner, Basket bc) {
        String productName;
        System.out.println("<Количество определенного товара в корзине>");
        productName = setProduct(scanner);
        if (bc.isContain(productName)) {
            System.out.println("Товар \"" + productName + "\", в корзине = " + bc.getProductQuantity(productName));
        } else {
            notProduct(productName);
        }
    }

    private static void updateQuantity(Scanner scanner, Basket bc) {
        String productName;
        int quantity;
        System.out.println("<Изменяем кол-во товара в корзине>");
        productName = setProduct(scanner);
        if (bc.isContain(productName)) {
            quantity = setQuantity(scanner);
            if (quantity == 0) {
                bc.removeProduct(productName);
            } else {
                bc.updateProductQuantity(productName, quantity);
            }
            System.out.printf("Изменен продукт: %s, кол-во стало: %d\n", productName, quantity);
        } else {
            notProduct(productName);
        }
    }

    private static void delProduct(Scanner scanner, Basket bc) {
        String productName;
        System.out.println("<Удаляем товар из корзины>");
        productName = setProduct(scanner);
        if (bc.isContain(productName)) {
            bc.removeProduct(productName);
            System.out.println("Товар " + productName + " из корзины удален");
        } else {
            notProduct(productName);
        }
    }

    //сообщение когда товара нет в корзине
    private static void notProduct(String productName) {
        System.out.println("Товара " + productName + " нет в корзине.");
    }

    // получаем с консоли кол-во продукта
    private static int setQuantity(Scanner s) {
        System.out.println("Укажите кол-во товара:");
        return s.nextInt();
    }

    // получаем с консоли название продукта
    public static String setProduct(Scanner s) {
        System.out.println("Укажите название товара:");
        return s.next();
    }
}
