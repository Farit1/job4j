package ru.job4j.loop;

public class PrimeNumber {
    public int  calc(int finish) {
        CheckPrimeNumber cpn = new CheckPrimeNumber();
        int count = 0;
        boolean prime;
        // Внешний цикл используется для прохода по всем числам от 2 до finish.
        for (int i = 2; i <= finish; i++) {
            /* Внутренний цикл определения простого числа
            prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            */
            // Проверка простого числа посредством обращения к классу CheckPrimeNumber
            prime = cpn.check(i);
            if (prime) {
                count++;
            }
        }
        return count;
    }
}
