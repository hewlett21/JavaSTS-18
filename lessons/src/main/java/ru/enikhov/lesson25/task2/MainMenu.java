package ru.enikhov.lesson25.task2;

public enum MainMenu {
    ADDPRODUCT("<Д>обавить товар в корзину"),
    REMOVEPRODUCT("<У>далить товар из корзины"),
    CHANGEQUANTITY("<И>зменить количество товара в корзине"),
    CLEARBASKETALL("<О>чистить корзину полностью"),
    LISTPRODUCT("<С>писок товаров в корзине"),
    COUNTPRODUCT("<К>оличество выбранного товара в корзине"),
    EXITFROMAPPLICATION("<В>ыход из приложения");
    private String title;

    public String getTitle() {
        return title;
    }

    MainMenu(String title) {
        this.title = title;
    }
}
