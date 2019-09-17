package ru.enikhov.lesson6;

public class Building extends Object {

    private int floor; //кол-во этажей

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    //Описание здания
    @Override
    public String getDesc() {
        return "Здание:\nадрес:" + getAddress() + "\nкол-во этажей: " + getFloor() +
                ",\nплощадь: " + getSq() + ",\nкадастровый номер: " + getCadNum();
    }
}
