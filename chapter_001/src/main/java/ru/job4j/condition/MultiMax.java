package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first; // Примем по умолчанию максимальное переменную first
        if (result < second) { // Если принятое максимальное значение окажется меньше переменной second, принять маскимальное значение переменной second
            result = second;
        }
        if (result < third) { // Если принятое максимальное значение окажется меньше переменной thrid, принять маскимальное значение переменной thrid
            result = third;
        }
        return result;
    }
}
