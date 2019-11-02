package ru.enikhov.lesson23;

import java.util.ArrayList;
import java.util.List;

public class BasketClass implements Basket {
    List<Product> basketList = new ArrayList<>();
    private int basketSize;     //кол-во записей в корзине
    private int index;          //позиция товара в списке

    public int getBasketSize() {
        return basketSize;
    }

    @Override
    public void addProduct(String product, int quantity) {
        basketList.add(new Product(product, quantity));
        basketSize++;
    }

    @Override
    public void removeProduct(String product) {
        basketList.remove(index);
        basketSize--;
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (index > -1) {  //если -1, то товара нет в корзине, апдейтить нечего
            basketList.get(index).setQuantity(quantity);
        }
    }

    @Override
    public void clear() {
        basketList.clear();
        basketSize = 0;
    }

    //формируем новый List для вывода
    @Override
    public List<String> getProducts() {
        List<String> outList = new ArrayList<>();
        for (Product p : basketList) {
            outList.add(p.toString());
        }
        return outList;
    }

    @Override
    public int getProductQuantity(String product) {
        if (index > -1) {  //если -1, то товара нет в корзине, и нет количества естественно:)
            return basketList.get(index).getQuantity();
        } else {
            return index;
        }
    }

    @Override
    public boolean isEmpty() {
        return basketList.isEmpty(); // проверяем что не пустая корзина
    }

    //проверка на то, что в корзине содержится товар
    //и сразу запоминаем индекс этого товара корзине
    @Override
    public int isContain(String product) {
        index = -1;
        for (int i = 0; i < basketSize; i++) {
            if (basketList.get(i).getName().equals(product)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
