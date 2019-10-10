package ru.enikhov.lesson15;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;

public class MyFile extends FileSystem {

    //создаем файл
    @Override
    public void createObj(File name) {
        try {
            if (name.createNewFile()) {
                message("Файл " + name.getAbsolutePath() + " создан.");
            } else {
                fileNotExist(name);
            }
        } catch (IOException e) {
            message(e.getMessage());
        }
    }

    //удаляем файл
    @Override
    public void deleteObj(File name) {
        if (name.exists()) {
            name.delete();
            message("Файл " + name.getAbsolutePath() + " удален.");
        } else {
            fileNotExist(name);
        }
    }

    //переименовываем файл nameOld в nameNew
    @Override
    public void renameObj(File nameOld, File nameNew) {
        if (nameOld.exists()) {
            nameOld.renameTo(nameNew);
            message("Файл " + nameOld.getAbsolutePath() + " переименован в " + nameNew);
        } else {
            fileNotExist(nameOld);
        }
    }

    //копируем файл nameOld в nameNew
    @Override
    public void copyObj(File nameOld, File nameNew) {
        try {
            if (nameOld.exists()) {
                Files.copy(nameOld.toPath(), nameNew.toPath());
                message("Файл " + nameOld.getAbsolutePath() + " скопирован в " + nameNew);
            } else {
                fileNotExist(nameOld);
            }
        } catch (FileAlreadyExistsException e) {
            message("Файл " + nameNew.getAbsolutePath() + " уже существует.");
        } catch (IOException e) {
            message(e.getMessage());
        }
    }

    //метод для обработки ситуации, когда файл не существует
    private void fileNotExist(File nameFile) {
        message("Файла " + nameFile.getAbsolutePath() + " не существует.");
    }

    @Override
    public void message(String s) {
        System.out.println(s);
    }

}
