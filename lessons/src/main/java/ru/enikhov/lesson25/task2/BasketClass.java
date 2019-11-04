package ru.enikhov.lesson25.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasketClass implements Basket {
    Map<String, Integer> basketMap = new HashMap<>();
    private int basketSize;     //кол-во записей в корзине

    public int getBasketSize() {
        return basketSize;
    }

    @Override
    public void addProduct(String product, int quantity) {
        basketMap.put(product, quantity);
        basketSize++;
    }

    @Override
    public void removeProduct(String product) {
        basketMap.remove(product);
        basketSize--;
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        basketMap.put(product, quantity);
    }

    @Override
    public int getProductQuantity(String product) {
        return basketMap.get(product);
    }

    @Override
    public void clear() {
        basketMap.clear();
        basketSize = 0;
    }

    //формируем новый List для вывода
    @Override
    public List<String> getProducts() {
        List<String> outList = new ArrayList<>();

        for (String key : basketMap.keySet()) {
//            System.out.println(key + ": " + basketMap.get(key));
            outList.add(String.format("|%-25s %5s|\n", key, basketMap.get(key)));
        }
        return outList;
    }

    @Override
    public boolean isEmpty() {
        return basketMap.isEmpty(); // проверяем что не пустая корзина
    }

    //проверка на то, что в корзине содержится товар
    @Override
    public boolean isContain(String product) {
        return basketMap.containsKey(product);
    }
}