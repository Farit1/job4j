package ru.job4j.array;
/**
 *  Defragment
 *  @author Farit Shaikhytdinov (farit84@yandex.ru)
 */
public class Defragment {
    /**
     * Method compress - выполняет дефрагментацию массива
     * @param array - массив который передается в метод для дефрагментации
     * @return array - возвращает дефрагментированный массив
     */
    public static String[] compress(String[] array) {
        for(int index = 0; index < array.length-1; index++) {
            String cell = array[index];
            if(cell == null) {
                // переместить первую не null ячейку
                // Здесь нужен цикл while
                int j = index+1;
                while ((j<array.length-1)&&(array[j]==null)) {
                    j++;
                }
                if (array[j]!=null) {
                    array[index]=array[j];
                    array[j]=cell;
                }
               /* Альтернативный вариант при помощи оператора for (...)
               for (int j = index+1; j<array.length; j++) {
                    if (array[j]!=null) {
                        array[index]=array[j];
                        array[j]=cell;
                        break;
                    }
                }
                */
            }
            System.out.print(array[index]+ " ");
        }
        return array;
    }

    public static void main(String[] args){
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index< compressed.length; index++){
            System.out.print(compressed[index]+ " ");
        }
    }
}
