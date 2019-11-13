package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int num) {
        boolean prime = true;
        // Проверка, если число больше нуля
        if (num > 0) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                        prime = false;
                        break;
                }
            }
        }
        return prime;
    }
}
