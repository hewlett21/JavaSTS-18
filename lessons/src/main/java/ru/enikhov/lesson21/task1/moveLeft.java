package ru.enikhov.lesson21.task1;

public class moveLeft {

    public static void main(String[] args) {
        int[][] arr = new int[5][10];
        System.out.println("Заполняем массив...");
        addArray(arr);
        System.out.println("Массив до сдвига...");
        prinArrayToConsole(arr);

        System.out.println("Сдвигаем на один символ влево...");
        moveLeftOneCharacter(arr);

        System.out.println("Массив после сдвига...");
        prinArrayToConsole(arr);

    }

    private static void moveLeftOneCharacter(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                arr[i][j] = arr[i][j + 1];
            }
            arr[i][arr[i].length - 1] = 0;
        }
    }

    private static void addArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (i + 1) * 10 + j;

            }
        }
    }

    private static void prinArrayToConsole(int[][] arrIn) {
        for (int[] a : arrIn) {
            for (int i : a) {
                System.out.print(i + "\t");
            }
            System.out.print("\n");
        }
    }
}
