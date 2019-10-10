package ru.enikhov.lesson15;

import java.io.File;

public class MyFolder extends FileSystem {
    FileSystem fileObj = new MyFile();

    //создаем папку
    @Override
    public void createObj(File folder) {
        if (folder.exists()) {
            System.out.println("Директория " + folder + " уже существует.");
        } else {
            folder.mkdirs();
            System.out.println("Директория " + folder + " создана.");
        }
    }

    //удаляем папку (рекурсивно)
    @Override
    public void deleteObj(File root) {
        if (root.exists() && root != null) {
            if (root.isDirectory()) {
                for (File file : root.listFiles()) {
                    System.out.println(file);
                    deleteObj(file);
                }
                root.delete();
            } else {
// если файл, то вызываем метод delete класса MyFile !!!тут вопрос как сделать правильно!!!
                fileObj.deleteObj(root);
            }
        }
    }

    //переименовываем папку
    @Override
    public void renameObj(File folderOld, File folderNew) {
        folderOld.renameTo(folderNew);
    }

    //копируем папку с содержимым (рекрсивно)
    @Override
    public void copyObj(File folderSrc, File folderTrg) {
        String nextSrc, nextTrg;
        message("Копируем каталог " + folderSrc.getAbsolutePath() + "\nв " + folderTrg.getAbsolutePath());
        if (folderSrc.exists()) {
            if (folderSrc.isDirectory()) {
                folderTrg.mkdirs();
                for (File file : folderSrc.listFiles()) {
                    nextSrc = folderSrc.getAbsolutePath() + File.separator + file.getName(); //новая папка источник
                    nextTrg = folderTrg.getAbsolutePath() + File.separator + file.getName(); //новая папка таргет
                    if (new File(nextSrc).isDirectory()) {
                        copyObj(new File(nextSrc), new File(nextTrg));
                    } else {
// если файл, то вызываем метод copy класса MyFile !!!тут вопрос как сделать правильно!!!
                        fileObj.copyObj(new File(nextSrc), new File(nextTrg));
                    }
                }
            }
        }
    }

    @Override
    public void message(String s) {
        System.out.println(s);
    }

}
