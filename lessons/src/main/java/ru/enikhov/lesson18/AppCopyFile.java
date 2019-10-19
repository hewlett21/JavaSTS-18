package ru.enikhov.lesson18;

import java.io.*;

public class AppCopyFile {
    public static void main(String[] args) {
        File fileSource = new File("utf-8.txt");
        String charSetSource = "UTF8";
        File fileDest = new File("windows-1251.txt");
        String charSetDest = "windows-1251";
//если файла источника нет, создаем его.
        if (!fileSource.exists()) {
            System.out.println("Создаем файл utf-8.txt.");
            createFile(fileSource);
        }
        try (FileInputStream fisSource = new FileInputStream(fileSource);
             InputStreamReader isr = new InputStreamReader(fisSource, charSetSource);
             BufferedReader reader = new BufferedReader(isr);
             FileOutputStream fisDest = new FileOutputStream(fileDest);
             OutputStreamWriter writer = new OutputStreamWriter(fisDest, charSetDest);) {
//копируем файл
            copyFile(reader, writer);
            System.out.println("Скопировали файл " + fileSource + " в кодировке " + isr.getEncoding() + "\n" +
                    "в файл " + fileDest + " в кодировке " + writer.getEncoding());
        } catch (FileNotFoundException e) {
            if (!fileSource.exists()) {
                System.out.println("Не найден файл источник");
            }
            if (!fileDest.exists()) {
                System.out.println("Не найден файл приемник");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createFile(File fileSource) {
        try (FileWriter writeSource = new FileWriter(fileSource, false);) {
            writeSource.write("Привет!\n");
            writeSource.write("Пока!\n");
            writeSource.write("Здравствуйте!\n");
            writeSource.write("До свидания!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copyFile(BufferedReader reader, OutputStreamWriter writer) throws IOException {
        int numLine = 1;
        String line = null;
        while ((line = reader.readLine()) != null) {
            line = (numLine == 1) ? line : "\n" + line; // кроме первой страки ставим перед строкой перевод строки:)
            writer.write(line);
            numLine++;
        }
    }
}
