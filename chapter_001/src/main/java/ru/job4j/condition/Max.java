package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {  // Метод возвращает максимальное из двух чисел
        int result = left > right ? left : right;
        return result;
    }

}
