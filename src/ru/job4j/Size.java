package ru.job4j.calculator;

public class Size {
    public int add(int left, int right) {
        int result = left + Math.abs(right);
        return result;
    }

    public void info(int size) {
        System.out.println("Your size is : " + size);
    }

    public static void main(String[] args) {
        Size size = new Size();
        int nike1 = 10;
        int puma2 = 50;
        int value3 = size.add(nike1, puma2);
        size.info(value3);
    }
}
