package ru.enikhov.lesson8.task3;

public class Dogovor {
    private int numDogovor;
    private String dtDogovor;
    private String[] productDogovor;

    public Dogovor(int numDogovor, String dtDogovor, String... productDogovor) {
        this.numDogovor = numDogovor;
        this.dtDogovor = dtDogovor;
        this.productDogovor = productDogovor;
    }

    public int getNumDogovor() {
        return numDogovor;
    }

    public String getDtDogovor() {
        return dtDogovor;
    }

    public String[] getProductDogovor() {
        return productDogovor;
    }

}
