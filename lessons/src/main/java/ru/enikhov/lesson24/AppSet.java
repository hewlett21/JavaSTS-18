package ru.enikhov.lesson24;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class AppSet {
    Set<String> set = new LinkedHashSet<>();
    Set<String> setOut = new LinkedHashSet<>();

    private void addFirstSet(AppSet appSet) {
        appSet.set.add("Петр");
        appSet.set.add("Татьяна");
        appSet.set.add("Иван");
        appSet.set.add("Владимир");
        appSet.set.add("Ирина");
        appSet.set.add("Алексей");
        appSet.set.add("Елена");
        appSet.set.add("Виктория");
        appSet.set.add("Алена");
        appSet.set.add("Наталья");
        appSet.set.add("Антон");
        appSet.set.add("Андрей");
        appSet.set.add("Дмитрий");

    }


    public static void main(String[] args) {
        AppSet appSet = new AppSet();
        appSet.addFirstSet(appSet);
        System.out.println("Первоначальное множество:");
        System.out.println(appSet.set);
        appSet.removeEventLength(appSet.set);
        System.out.println("Отфильтрованое множество:");
        System.out.println(appSet.setOut);
    }

    private Set<String> removeEventLength(Set<String> set) {
        Iterator<String> iterator = set.iterator();
        String str;
        while (iterator.hasNext()) {
            str = iterator.next();
            if (str.length() % 2 != 0) {
                setOut.add(str);
            }
        }
        return setOut;
    }
}
