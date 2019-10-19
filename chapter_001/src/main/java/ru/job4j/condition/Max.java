package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {  // Метод возвращает максимальное из двух чисел
        int result1 = left > right ? left : right;
        return result1;
    }

    public static int Firstmax(int first, int second) { // Метод проверки первого максимального
        int result2 =  first > second ? first : 0;
        return result2;
    }

    public static int Secondmax(int first, int second) { // Метод проверки второго максимального
        int result3 =  first < second ? second : 0;
        return result3;
    }

    public static int same(int first, int second) {  // Метод проверяет одинаковость чисел и возвращает любое из них
        int result4 = first == second ? first : 0;
        return result4;
    }
}
