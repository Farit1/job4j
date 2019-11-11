package ru.job4j.loop;

/**
 * Splash
 * @author Farit Shaikhytdinov (farit84@yandex.ru)
 *
 */
public class Slash {
    /**
     * Method draw - Метод выполняет вывод в консоль крест в псевдографике.
     * @param size - размер поля креста.
     */
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = (row == cell) ? true:false; // добавить условие, по которому нужно определить ставить ли символ или нет.
                boolean right = (cell == size - row - 1) ? true:false; // добавить условие, что нужно ставить элемент в правый угол.
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
}
    /**
     * Конструктор, выполняет построение крестов в псевдографике размером 3х3 и 5х5.
     * @param args - args.
     */
    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }

}