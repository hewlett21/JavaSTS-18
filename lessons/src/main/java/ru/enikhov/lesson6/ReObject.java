package ru.enikhov.lesson6;

public class ReObject {
    private double sq;      //площадь объекта
    private String address; //адрес объекта
    private String cadNum;  // кадастровый номер объекта

    public void setSq(double sq) {
        this.sq = sq;
    }

    public void setCadNum(String cadNum) {
        this.cadNum = cadNum;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSq() {
        return sq;
    }

    public String getAddress() {
        return address;
    }

    public String getCadNum() {
        return cadNum;
    }

    public String getDesc() {
        return "";
    }

}
