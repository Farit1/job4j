package ru.job4j.loop;

public class Mortgage {
    //amount - сумма выданная по кредиту, salary - годовой доход, percent - процентная ставка по кредиту.
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double platej = amount;
        percent = percent / 100;
        do {
            platej = platej + platej * percent - salary;
            year += 1;
        }
        while (platej > 0);
        return year;
    }
}
