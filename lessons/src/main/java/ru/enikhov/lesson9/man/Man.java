package ru.enikhov.lesson9.man;

public abstract class Man implements Runable, Swimable {

    private int speed = 10;

    @Override
    public void brass() {
        System.out.println("Я плыву брасом");
    }

    @Override
    public void baterfly() {
        System.out.println("Я плыву батерфляем");
    }

    @Override
    public void faster() {
        System.out.println("Бегу быстрее");
        speed++;
    }

    @Override
    public void slowly() {
        System.out.println("Снижаю скорость");
        speed--;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
