package ru.enikhov.lesson6;

import java.util.Date;

public class App {

    public static void main(String[] args) {
        ReObject[] obj = new ReObject[2];
//Создаем земельный участок
        Land land = new Land();
        obj[0] = land;
        obj[0].setAddress("пл. Ленина");
        obj[0].setCadNum("21:21:0605012:0");
        obj[0].setSq(1000.00);
        land.setCatLand("Земли населенных пунктов");
//Создаем здание
        Building building = new Building();
        obj[1] = building;
        obj[1].setAddress("пл. Ленина, д. 1, кв. 10");//адрес
        obj[1].setCadNum("21:50:0605012:123");        // кадастровый номер
        obj[1].setSq(100.00);                         //площадь
        building.setFloor(2);                         //Кол-во этажей
//Создаем субъекта
        Subjects subj = new Subjects();
        subj.setFirstName("Петр");      //Имя
        subj.setSecondName("Петров");   //Фамилия
        subj.setAge(30);                //Возраст

//Создаем право
        Rigths rt = new Rigths();
        rt.setRtNum("21-21-01/001/2019-1");
        rt.setRtType("Право собственности");
        rt.setStartDate(new Date());

        System.out.println(obj[0].getDesc()); //Описание земельного участка
        System.out.println("=================");
        System.out.println(obj[1].getDesc()); //Описание объекта капитального строительства (ОКС)

        System.out.println("=================");
        System.out.println("Субъект права: " + subj.getDescSubject()); //Описание правообладателя
        System.out.println("=================");
        for (ReObject o : obj) {
            System.out.println("Описание права\n" + rt.getRtDesc(o, subj)); //Описание права на объекты
        }
    }
}
