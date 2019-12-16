package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                // Проверка, если сумма интексов четная, то вывести Х, если не четная, то вывести пробел.
                System.out.print(((row + cell) % 2 == 0) ? "X" : " ");
            }
            //Добавляем перевод на новую строку
            System.out.println();
        }
    }
    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
