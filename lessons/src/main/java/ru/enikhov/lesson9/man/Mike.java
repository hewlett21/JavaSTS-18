package ru.enikhov.lesson9.man;

public class Mike extends Man {
    @Override
    public void brass() {
        super.brass();
    }

    @Override
    public void baterfly() {
        System.out.println("К сожалению стилем батерфляй плавать не могу");
        ;
    }

    @Override
    public void faster() {
        System.out.println("Врачи запрещают бегать");
        setSpeed(0); // бегать нельзя, скорость 0
    }

    @Override
    public void slowly() {
        System.out.println("Врачи запрещают бегать");
        setSpeed(0); // бегать нельзя, скорость 0
    }
}
