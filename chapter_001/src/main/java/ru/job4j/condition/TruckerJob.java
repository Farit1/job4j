package ru.job4j.condition;

public class TruckerJob {
    public static void main(String[] args) {
        Driver steve = new Driver();
        System.out.println("Steve wants the trucker job.");

        if (!steve.hasLicense()) { // Проверка, если у Steve нет водительского удостоверения, выдать сообщение "Steve need to get a license!"
            System.out.println("Steve need to get a license!");
            //steve.passExamOn('A'); // Присваивает переменной license в классе Driver значение 'A'
            steve.passExamOn('D'); // Присваивает переменной license в классе Driver значение 'D'

        }

        if (steve.canDrive('C')) { // Проверяем, если у водителя удостоверение с категорией C, то выдать сообщение, "Стив работает на грузовиках"
            System.out.println("Steve works on truckers!");
        } else if (steve.canDrive('B')) { // Проверяем, если у водителя удостоверение с категорией B, то выдать сообщение, "Стив работает в такси"
            System.out.println("Steve works in taxi.");
        } else {
            // Если у водителя не A и не B, то выдать сообщение, вто Стив не работает, но ездит на мотоцикле, предполагая, что у него категория C.
            // В этом случае есть минус, если вызвать функцию steve.passExamOn('D'); c параметром 'D', то алгоритм все равно выдаст сообщение, что Стив не работает, но ездит на мотоцикле.
            System.out.println("Steve does not have a job, but ride on motorbike!");
        }
    }
}
