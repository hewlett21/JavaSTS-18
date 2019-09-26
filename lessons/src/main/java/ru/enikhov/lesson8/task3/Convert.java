package ru.enikhov.lesson8.task3;

import java.util.Arrays;

public class Convert {
    static Act convert(Dogovor d) {
        System.out.println("Class Dogovor:");
        System.out.println(d.getNumDogovor());
        System.out.println(d.getDtDogovor());
        System.out.println(Arrays.toString(d.getProductDogovor()));
        Act a = new Act();
        a.setNumAct(d.getNumDogovor());
        a.setDtAct(d.getDtDogovor());
        a.setProductAct(d.getProductDogovor());
        System.out.println("Class Act:");
        System.out.println(a.getNumAct());
        System.out.println(a.getDtAct());
        System.out.println(Arrays.toString(a.getProductAct()));
        return a;
    }
}
