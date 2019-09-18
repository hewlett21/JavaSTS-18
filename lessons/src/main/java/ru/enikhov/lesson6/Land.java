package ru.enikhov.lesson6;

public class Land extends ReObject {
    private String catLand; //категория земель

    public void setCatLand(String catLand) {
        this.catLand = catLand;
    }

    public String getCatLand() {
        return catLand;
    }

    //Описание земельного участка
    @Override
    public String getDesc() {
        return "Земельный участок:\nадрес:" + getAddress() +
                ",\nплощадь: " + getSq() + ",\nкадастровый номер: " + getCadNum() +
                ",\nкатегория земель: " + getCatLand();
    }
}
