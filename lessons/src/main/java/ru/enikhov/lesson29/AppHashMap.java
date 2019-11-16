package ru.enikhov.lesson29;

import java.util.*;

public class AppHashMap {

    public static void main(String[] args) {
        removeTheDuplicates(createMap());
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

    public static void removeTheDuplicates(Map<String, Person> map) {
        System.out.println("Создаем TreeMap (для красоты вывода) ==============================");
        Map<String, Person> treeMap = new TreeMap<>(map);
        System.out.println(treeMap.toString().replace(',', '\n'));

        System.out.println("Создаем Map которые будем удалять ==================================");
        Map<String, Person> delMap = new TreeMap<>(treeMap);
        Iterator<Map.Entry<String, Person>> iterator = delMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            int cnt = Collections.frequency(delMap.values(), entry.getValue());
            if (cnt == 1) {
                iterator.remove();
            }
        }
        System.out.println(delMap.toString().replace(',', '\n'));

        //Выполняем удаление найденных дублей из копии исходной мапы
        for (Map.Entry<String, Person> del : delMap.entrySet()) {
            removeItemFromMapByValue(treeMap, del.getValue());
        }
        System.out.println("Оставшиеся записи в TreeMap ========================================");
        System.out.println(treeMap.toString().replace(',', '\n'));

        returnDeleted(treeMap, delMap);
    }

    private static void returnDeleted(Map<String, Person> treeMap, Map<String, Person> delMap) {
        System.out.println("Возвращаем в TreeMap каждый первый дубль обратно ====================");
        Iterator<Map.Entry<String, Person>> it1 = delMap.entrySet().iterator();
        while (it1.hasNext()) {
            Map.Entry<String, Person> entry = it1.next();
            if (!treeMap.containsValue(entry.getValue())) {
                treeMap.put(entry.getKey(), entry.getValue());
            }
        }
        System.out.println(treeMap.toString().replace(',', '\n'));
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
