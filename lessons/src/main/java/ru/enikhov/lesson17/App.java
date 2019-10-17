package ru.enikhov.lesson17;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        Library library = new Library();

        System.out.println("< Меню Библиотека >");
//считываем из файла menu.txt главное меню.
        File mainMenu = new File("menu.txt");
        Scanner menu = new Scanner(System.in);
        try (InputStream is = new FileInputStream(mainMenu);
             LineNumberReader isr = new LineNumberReader(new InputStreamReader(is))) {
            String line;
            while ((line = isr.readLine()) != null) {
                System.out.println(line);
            }
            while (menu.hasNext()) {
                String command = menu.next().toUpperCase();
//Вызываем метод обработки выбранного пункта меню
                cmdMainMenu(command, library);
                if (command.equals("З")) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void cmdMainMenu(String command, Library library) {
        switch (command) {
            case "Д":
                System.out.println("===> Добавляем книгу.");
                addBook(library);
                break;
            case "У":
                System.out.println("===> Удаляем книгу.");
                deleteBook(library);
                break;
            case "П":
                System.out.println("===> Поиск книги.");
                seekBook(library);
                break;
            case "С":
                listBooks(library);
                break;
            case "З":
                System.out.println("До новых встреч.");
                break;
            default:
                System.out.println("Неизвестная комманда. Попробуйте еще раз.");
        }
    }

    private static void seekBook(Library library) {
        Scanner seekScan = new Scanner(System.in);
        books = library.getListBooks();
        if (books.size() != 0) {
            System.out.println("Выберите атрибут поиска,\nпо автору нажмите А, по названию нажмите Н, по теме нажмите Т:");
            System.out.println("> <А>втор.");
            System.out.println("> <Н>азвание.");
            System.out.println("> <Т>ематика.");
            System.out.println("> <В>ыход.");
            while (seekScan.hasNext()) {
                String command = seekScan.next().toUpperCase();
//вызываем метод обработки меню поиска
                cmdSeekMenu(library, command);
                if (command.equals("В")) {
                    System.out.println("===> Вышли из поиска.");
                    break;
                }
                System.out.println("Укажите атрибут поиска,\nпо автору нажмите А, по названию нажмите Н, по теме нажмите Т:");
            }
        } else {
            System.out.println("Библиотека пустая. Нужно добавить книги.");
        }
    }

    private static void cmdSeekMenu(Library library, String command) {
        switch (command) {
            case "А":
                System.out.println("Укажите автора:");
                library.seekBooksAuthor(getText(), books);
                break;
            case "Н":
                System.out.println("Укажите название:");
                library.seekBooksTitle(getText(), books);
                break;
            case "Т":
                System.out.println("Укажите тему:");
                library.seekBooksSubject(getText(), books);
                break;
            case "В":
                break;
            default:
                System.out.println("Неизвестная комманда. Попробуйте еще раз.");
        }
    }

    //Получаем список книг в библиотеке.
    private static void listBooks(Library library) {
        books = library.getListBooks();
        int count = 0;
        if (books.size() != 0) {
            System.out.println("Список книг в библиотеке:");
            for (Book book : books) {
                count++;
                System.out.println("№/№" + count + ". " + book.toString());
            }
        } else {
            System.out.println("Библиотека пустая. Нужно добавить книги.");
        }
    }

    private static void addBook(Library library) {
        Scanner newBookScan = new Scanner(System.in);
        String newAuthor = "";
        String newTitle = "";
        String newSubject = "";
        int newYear = 0;
        books = library.getListBooks();
        while (true) {
            System.out.println("Укажите автора:");
            newAuthor = getText();
            System.out.println("Укажите название:");
            newTitle = getText();
            System.out.println("Укажите тему:");
            newSubject = getText();
            System.out.println("Укажите год издания:");
            newYear = Integer.parseInt(getText());
            books.add(new Book(newAuthor, newTitle, newSubject, newYear));
            System.out.println("Нажмите <В> для выхода из меню добавления");
            System.out.println("Любая другая клавиша - продолжить добавлять новую книгу.");
            String command = newBookScan.next().toUpperCase();
            if (command.equals("В")) {
                break;
            }
        }
        library.addBooks(books);
    }

    //Удаляем книгу по номеру в библиотеке.
    private static void deleteBook(Library library) {
        Scanner delBookScan = new Scanner(System.in);
        books = library.getListBooks();
        if (books.size() != 0) {
            while (true) {
                System.out.println("Укажите номер книги:");
                int delNum = delBookScan.nextInt();
                books = library.deleteBooks(books, delNum);
//обновляем список книг в библиотеке, т.к. номера книг сдвинулись
//после удаления
                library.addBooks(books);
                listBooks(library);
                System.out.println("Нажмите <В> для выхода из меню добавления");
                System.out.println("Любая другая клавиша - продолжить удалять книги.");
                String command = delBookScan.next().toUpperCase();
                if (command.equals("В")) {
                    break;
                }
            }
        } else {
            System.out.println("Библиотека пустая. Нужно добавить книги.");
        }

    }


    //Вводим с консоли текст (например название или автора книги)
    private static String getText() {
        Scanner name = new Scanner(System.in);
        return name.nextLine();
    }

}
