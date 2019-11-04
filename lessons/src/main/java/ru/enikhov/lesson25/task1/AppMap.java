package ru.enikhov.lesson25.task1;

import java.util.*;

public class AppMap {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        setMapUnique(map1);
        System.out.println(map1);
        System.out.println("Нет дублей: " + isUnique(map1));
        setMapNotUnique(map1, map2);
        System.out.println(map2);
        System.out.println("Нет дублей: " + isUnique(map2));
        map2.clear();
        System.out.println("Пустой HashMap: " + isUnique(map2));
    }

    private static boolean isUnique(Map<String, String> map) {
        if (map.isEmpty()) {
            return true;
        } else {
            HashSet<String> values = new HashSet<>(map.values());
            if (values.size() == map.size())
                return true;
        }
        return false;
    }


    private static void setMapUnique(Map<String, String> map1) {
        System.out.println("Map unique");
        map1.put("Федор", "Достоевский");
        map1.put("Михаил", "Лермонтов");
        map1.put("Афанасий", "Фет");
        map1.put("Александр", "Пушкин");
        map1.put("Лев", "Толстой");
        map1.put("Сергей", "Есенин");
        map1.put("Дмитрий", "Мамин-Сибиряк");
        map1.put("Николай", "Гоголь");
        map1.put("Борис", "Пастернак");
        map1.put("Антон", "Чехов");
    }

    private static void setMapNotUnique(Map<String, String> map1, Map<String, String> map2) {
        System.out.println("Map not unique:");
        map2.putAll(map1);
        map2.put("Михаил1", "Лермонтов");
        map2.put("Александр1", "Пушкин");
    }

}
