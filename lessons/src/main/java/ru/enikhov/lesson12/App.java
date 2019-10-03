package ru.enikhov.lesson12;

public class App {

    public static void main(String[] args) throws MyException {
        String string = new String("Hello, World!");
//для проверки MyException проверяем что входная фраза не равна Hello, World!
        //String string = new String("Hello, WWWorld!");

// раскомментировать для проверки NullPointerException
//        string = null;
        try {
            hello(string);
        } catch (NullPointerException npe) {
            System.out.println("Объект пустой");
        }
    }

    static void hello(String s) throws MyException {
        char[] chars = s.toCharArray();
        try {
            System.out.println("Вывод строки:");
            System.out.println(s.toString());
            System.out.println("Вывод массива char:");
            for (int i = 0; i < chars.length; i++) {
                //для проверки ArrayIndexOutOfBoundsException сделать
                //i <= chars.length
                System.out.println(chars[i]);
            }
            if (!s.equals("Hello, World!")) {
                throw new MyException("Это не фраза Hello, World!");
            }
        } catch (ArrayIndexOutOfBoundsException arre) {
            System.out.println("Вышли за границы массива");
        }
    }
}
