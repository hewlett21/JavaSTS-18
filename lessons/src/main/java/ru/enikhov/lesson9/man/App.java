package ru.enikhov.lesson9.man;

public class App {
    public static void main(String[] args) {
        System.out.println("===ДЗ lesson9 Man abstract Class===");
        Ivan ivan = new Ivan();
        System.out.println("===Иван бегает:");
        System.out.println("Увеличим скорость бега:");
        faster(ivan, 5);        // 5 раз увеличиваем скорость
        System.out.println("Моя скорость: " + ivan.getSpeed() + " км/ч");
        System.out.println("Снизим скорость бега:");
        slowly(ivan, 3);        // 3 раза снижаем скорсть
        System.out.println("Моя скорость: " + ivan.getSpeed() + " км/ч");
        System.out.println("===Иван плавает:");
        System.out.println("Попробуем брассом?");
        ivan.baterfly();
        System.out.println("Попробуем батерфляем?");
        ivan.brass();

        Mike mike = new Mike();
        System.out.println("===Mike бегает:");
        System.out.println("Увеличим скорость бега:");
        faster(mike, 2);        // 2 раза увеличиваем скорость
        System.out.println("Моя скорость: " + mike.getSpeed() + " км/ч");
        System.out.println("Снизим скорость бега:");
        slowly(mike, 2);        // 2 раза снижаем скорсть
        System.out.println("Моя скорость: " + mike.getSpeed() + " км/ч");
        System.out.println("==Mike плавает:");
        System.out.println("Попробуем брассом?");
        mike.brass();
        System.out.println("Попробуем батерфляем?");
        mike.baterfly();

    }

    //count - сколько раз выполняем действие
    static void faster(Man man, int count) {
        for (int i = 0; i < count; i++) {
            man.faster();
            if (man.getSpeed() == 0) {
                break;
            }
        }
    }

    //count - сколько раз выполняем действие
    static void slowly(Man man, int count) {
        for (int i = 0; i < count; i++) {
            man.slowly();
            if (man.getSpeed() == 0) {
                break;
            }
        }
    }
}
