package ru.enikhov.lesson15;

import java.io.File;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Выполняем действия как с файлами, так и с папками.
        //3 пункт меню ("Вывод структуры. Нажмите 3:") реализует дополнительное задание
        //вывода структуры каталогов с пробелами в зависимости от уровня.
        //создаем файловую систему.
        String[] dirList = {"testData/a/b/c/d", "testData/a/c/a/a", "testData/b/a/a", "testData/b/c/b", "testData/b/a/c/b"};
        String[] fileList = {"testData/a/1.txt", "testData/b/2.txt", "testData/b/a/3.txt", "testData/b/a/c/b/4.txt", "testData/a/b/c/d/5.txt"};
        FileSystem folder = new MyFolder();
        FileSystem file = new MyFile();
        if (!new File("testData").exists()) {
            folder.message("===Создаем папки:");
            for (String dir : dirList) {
                folder.createObj(new File(dir));
            }
            file.message("===Создаем файлы");
            for (String f : fileList) {
                file.createObj(new File(f));
            }
        }
        System.out.println("===Файловая система создана.");

        System.out.printf("My name is: %18s%n", "joe");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите операции с папкой или с файлом:");
            System.out.println("Папка.           Нажмите 1:");
            System.out.println("Файл.            Нажмите 2:");
            System.out.println("Вывод структуры. Нажмите 3:");
            System.out.println("Выход.           Нажмите 0:");
            int input = scanner.nextInt();
            switch (input) {
                case (1):
                    folderAction(folder, scanner);
                    break;
                case (2):
                    fileAction(file, scanner);
                    break;
                case (3):
                    System.out.println("Структура каталогов:");
                    System.out.println("testData");
                    FileSystem.getFileSystem(new File("testData"), 0);
                    break;
                case (0):
                    break;
            }
            if (input == 0) {
                break;
            }
        }
    }

    private static void folderAction(FileSystem folder, Scanner scanner) {
        String folderOne = "";
        String folderOld = "";
        String folderNew = "";
        while (true) {
            System.out.println("Выберите действие с папкой:");
            System.out.println("Создать папку.       Нажмите 1:");
            System.out.println("Переименовать папку. Нажмите 2:");
            System.out.println("Скопировать папку.   Нажмите 3:");
            System.out.println("Удалить папку.       Нажмите 4:");
            System.out.println("Выход.               Нажмите 0:");
            int input = scanner.nextInt();
            switch (input) {
                case (1):
                    folderOne = "testData/a/a1";
                    System.out.println("Создаем папку " + folderOne);
                    folder.createObj(new File(folderOne));
                    break;
                case (2):
                    folderOne = "testData/a/b";
                    folderNew = "testData/a/b1";
                    folder.renameObj(new File(folderOld), new File(folderNew));
                    break;
                case (3):
                    folderOld = "testData/a/b";
                    folderNew = "testData/b";
                    folder.copyObj(new File(folderOld), new File(folderNew));
                    break;
                case (4):
//здесь подразумевается, что удаляется все, что внутри папки testData/a/b и сама папка b
                    folderOne = "testData/a/b";
                    System.out.println("Удаляем папку " + folderOne);
                    folder.deleteObj(new File(folderOne));
                    break;
                case (0):
                    break;
            }
            if (input == 0) {
                break;
            }
        }

    }

    private static void fileAction(FileSystem file, Scanner scanner) {
        String fileOne = "";
        String fileOld = "";
        String fileNew = "";
        while (true) {
            System.out.println("Выберите действие с файлом:");
            System.out.println("Создать файл.       Нажмите 1:");
            System.out.println("Переименовать файл. Нажмите 2:");
            System.out.println("Скопировать файл.   Нажмите 3:");
            System.out.println("Удалить файл.       Нажмите 4:");
            System.out.println("Выход.              Нажмите 0:");
            int input = scanner.nextInt();
            switch (input) {
                case (1):
                    fileOne = "testData/a/111.txt";
                    System.out.println("Создаем файл " + fileOne);
                    file.createObj(new File(fileOne));
                    break;
                case (2):
                    fileOld = "testData/a/1.txt";
                    fileNew = "testData/a/1_1.txt";
                    file.renameObj(new File(fileOld), new File(fileNew));
                    break;
                case (3):
                    fileOld = "testData/a/1.txt";
                    fileNew = "testData/a/b/1.txt";
                    file.copyObj(new File(fileOld), new File(fileNew));
                    break;
                case (4):
                    fileOne = "testData/a/111.txt";
                    System.out.println("Удаляем файл " + fileOne);
                    file.deleteObj(new File(fileOne));
                    break;
                case (0):
                    break;
            }
            if (input == 0) {
                break;
            }
        }
    }

}
