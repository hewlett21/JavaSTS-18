package ru.enikhov.lesson11;

public class Censor {
    public static String replace(String inStr) {
        String[] arrIn = inStr.split(" ");
        String result = "";
        for (int i = 0; i < arrIn.length; i++) {
            if (arrIn[i].replaceAll("[^а-я]", "").equals("бяка")) {
                result += arrIn[i].replaceFirst("бяка", "вырезано цензурой") + " ";
            } else {
                result += (arrIn[i].length() == 0) ? " " : arrIn[i] + " ";
            }
        }
        return result;
    }
}
