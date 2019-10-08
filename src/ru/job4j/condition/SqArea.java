package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        int s, h;
        h = p/(2*(k+1));
        s = h*h*k;
        return s;
    }

    public static void main(String[] args) {
        double result = square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result);
    }
}