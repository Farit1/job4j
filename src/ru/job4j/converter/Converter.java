package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int euroToRuble(int value) {
        return value*70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int dollarToRuble(int value) {
        return value*60;
    }
    public static void main(String[] args) {
   /*     int euro = rubleToEuro(140);
        int dollar = rubleToDollar(140);
        int ruble1 = euroToRuble(2);
        int ruble2 = dollarToRuble(2);

        System.out.println("140 rubles are "+euro+" euro");
        System.out.println("140 rubles are "+dollar+" dollar");
        System.out.println("2 euro are "+ruble1+" ruble");
        System.out.println("2 dollar are "+ruble2+" ruble");
*/
        int in = 140;
        int excepted = 2;
        int out = rubleToEuro(in);
        boolean passed = excepted == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

    }

}
