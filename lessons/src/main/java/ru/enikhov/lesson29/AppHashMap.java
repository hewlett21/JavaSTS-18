package ru.enikhov.lesson29;

import java.util.*;

public class AppHashMap {

    public static void main(String[] args) {
        Map<String, Person> map = createMap();
        System.out.println("Начальный список:");
        printMap(map);
        removeTheDuplicates(map);
        System.out.println("\nПосле удаления дублей:");
        printMap(map);
    }

    private static Map<String, Person> createMap() {
        Map<String, Person> book = new HashMap<>();
        Person person1 = new Person(29, "Петрова", "жен");
        Person person2 = new Person(34, "Сидорова", "жен");
        Person person3 = new Person(34, "Тихонова", "жен");
        Person person4 = new Person(35, "Петров", "муж");
        book.put("Key1", person1);
        book.put("Key2", person2);
        book.put("Key3", person4);
        book.put("Key4", person3);
        book.put("Key5", person4);
        book.put("Key6", person1);
        return book;
    }

    private static void printMap(Map<String, Person> map) {
        Map<String, Person> treeMap = new TreeMap<>(map);
        System.out.println(treeMap.toString().replace(',', '\n'));
    }

    public static void removeTheDuplicates(Map<String, Person> map) {
        Map<String, Person> cloneMap = new HashMap<>(map);
        for (Map.Entry<String, Person> entry : cloneMap.entrySet()) {
            int cnt = Collections.frequency(map.values(), entry.getValue());
            if (cnt > 1) {
                removeItemFromMapByValue(map, entry.getValue());
                map.put(entry.getKey(), entry.getValue());
            }
        }
    }


    public static void removeItemFromMapByValue(Map<String, Person> map, Person value) {
        Map<String, Person> copy = new HashMap<>(map);
        for (Map.Entry<String, Person> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }
}
