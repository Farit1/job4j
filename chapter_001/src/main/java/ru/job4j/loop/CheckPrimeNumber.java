package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int num) {
        boolean prime = false;
        if (num > 0){
            for (int i = 1; i<=num; i++) {
                if (num % i == 0) {
                    if ((i > 1) && (i<num) ) {
                        prime = false;
                        break;
                    }
                    if (i==num) {
                        prime = true;
                    }
                }
            }
        }
        return  prime;
    }
}
