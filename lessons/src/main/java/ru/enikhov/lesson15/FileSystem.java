package ru.enikhov.lesson15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public abstract class FileSystem implements Action {

    public abstract void message(String s); //метод для вывода сообщений

    public static void getFileSystem(File root, int deep) {
        int f = 0;
        if (root.exists() && root != null) {
            if (root.isDirectory()) {
                for (File file : root.listFiles()) {
                    f = (int) (file.toString().length() + deep);
                    System.out.printf("%" + f + "s%n", file);
                    getFileSystem(file, deep + 1);
                }
            }
        }
    }
}
