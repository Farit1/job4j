package ru.job4j.loop;

public class PrimeNumber {
    public int  calc(int finish) {
        int count = 0;
        boolean prime;
        // Внешний цикл используется для прохода по всем числам от 2 до finish.
        for (int i = 2; i <= finish; i++) {
            prime = true;
            //Внутренний цикл используется для проверки деления без остатка.
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime == true) {
                count++;
            }
        }
        return count;
    }
}
