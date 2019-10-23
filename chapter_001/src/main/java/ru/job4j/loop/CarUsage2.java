package ru.job4j.loop;

public class CarUsage2 {
    public static void main(String[] args) {
        Car2 audi = new Car2();
        if (!audi.canDrive()) {
            audi.fill(10);
        }
        int km = 0;
        while (audi.canDrive()) {
            audi.drive(1);
            km++;
            if (km == 4) {
                audi.drive(1);
                continue;
            }
            if (km == 6) {
                break;
            }
        }
        audi.gasInfo();
    }
}
