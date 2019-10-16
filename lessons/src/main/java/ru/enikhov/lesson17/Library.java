package ru.enikhov.lesson17;

import java.io.*;
import java.util.ArrayList;

public class Library implements Serializable {
    private String libraryName = "library.bin";

    public String getLibraryName() {
        return libraryName;
    }

    //Добавляем книги в библиотеку
    public void addBooks(ArrayList<Book> books) {
        try (FileOutputStream fos = new FileOutputStream(getLibraryName());
             ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(books);
            System.out.println("В библиотеке " + books.size() + " книг.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Book> deleteBooks(ArrayList<Book> books, int num) {
        int index = num - 1;
        try {
            System.out.println("Удаляем ");
            System.out.println(books.get(index).toString());
            books.remove(index);
            System.out.println("Книга с номером " + num + " удалена");
        } catch (NullPointerException e) {
            System.out.println("Передана пустая библиотека. Нужно наполнить библиотеку");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Книги с номером " + num + " не найдено.");
        } finally {
            return books;
        }
    }

    //Выводим список книг из библиотеки
    public ArrayList<Book> getListBooks() {
        ArrayList<Book> books = new ArrayList<>();
        File fileLibrary = new File(getLibraryName());
        if (fileLibrary.exists()) {
            try (FileInputStream fis = new FileInputStream(getLibraryName());
                 ObjectInputStream ois = new ObjectInputStream(fis);
            ) {
                if (ois != null) {
                    books = (ArrayList<Book>) ois.readObject();
                }
            } catch (FileNotFoundException e) {
                return books; // Если файл не найден возвращаем пустую библиотеку
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return books;
    }

    //Поиск по названию
    public void seekBooksTitle(String title, ArrayList<Book> books) {
        int count = 0; //кол-во найденных книг
        try {
            System.out.println("Результат поиска: ");
            for (Book b : books) {
                if (b.getTitle().contains(title.toUpperCase())) {
                    System.out.println(b.toString());
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Книг с названием " + title + " не найдено.");
            }
        } catch (NullPointerException e) {
            System.out.println("Передана пустая библиотека. Нужно наполнить библиотеку");
        }
    }

    //Поиск по автору
    public void seekBooksAuthor(String author, ArrayList<Book> books) {
        int count = 0; //кол-во найденных книг
        try {
            System.out.println("Результат поиска: ");
            for (Book b : books) {
                if (b.getAuthor().contains(author.toUpperCase())) {
                    System.out.println(b.toString());
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Книг автора " + author + " не найдено.");
            }
        } catch (NullPointerException e) {
            System.out.println("Передана пустая библиотека. Нужно наполнить библиотеку");
        }
    }

    //Поиск по теме
    public void seekBooksSubject(String subject, ArrayList<Book> books) {
        int count = 0; //кол-во найденных книг
        try {
            System.out.println("Результат поиска: ");
            for (Book b : books) {
                if (b.getSubject().contains(subject.toUpperCase())) {
                    System.out.println(b.toString());
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Книг с темой " + subject + " не найдено.");
            }
        } catch (NullPointerException e) {
            System.out.println("Передана пустая библиотека. Нужно наполнить библиотеку");
        }

    }
}
