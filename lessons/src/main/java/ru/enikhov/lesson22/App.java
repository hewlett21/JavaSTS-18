package ru.enikhov.lesson22;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        //заполняем коллекцию
        addList(persons);

        printList(persons, "Первоначальный список :");

        Collections.sort(persons, typeSort());
        printList(persons, "Список после сортировки:");
    }

    private static void addList(List<Person> persons) {
        persons.add(new Person("Иван", 22));
        persons.add(new Person("Петр", 22));
        persons.add(new Person("Алиса", 18));
        persons.add(new Person("Андрей", 19));
        persons.add(new Person("Елена", 28));
        persons.add(new Person("Андрей", 28));
        persons.add(new Person("Семен", 35));
        persons.add(new Person("Алексей", 35));
        persons.add(new Person("Татьяна", 18));
        persons.add(new Person("Елена", 25));
    }

    private static Comparator<Person> typeSort() {
        System.out.println("Выберите сортировку:");
        System.out.println("По имени и возрасту. Нажмите 1.");
        System.out.println("По возрасту и имени. Нажмите 2.");
        try {
            Scanner scanner = new Scanner(System.in);
            int sortType = scanner.nextInt();
            switch (sortType) {
                case 1:
                    System.out.println("Сортируем по имени и возрасту:");
                    return new PersonSuperComparatorNameAge();
                case 2:
                    System.out.println("Сортируем по возрасту и имени:");
                    return new PersonSuperComparatorAgeName();
            }
        } catch (InputMismatchException e) {
            System.out.println("Нужно указать цифру.");
        }
        System.out.println("Сортировка по умолчанию (по имени и возрасту.):");
        return new PersonSuperComparatorNameAge();
    }


    private static void printList(List<Person> persons, String s) {
        System.out.println(s);
        for (Person p : persons) {
            System.out.println(p);
        }
        System.out.println("=====================================");
    }
}
