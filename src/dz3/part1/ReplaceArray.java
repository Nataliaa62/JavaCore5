package dz3.part1;

import java.util.Arrays;

public class ReplaceArray {

    public static void replaceIndex(String[] arrayOne, int indexOne, int indexTwo) throws MyArrayIndexBoundsEx {     //передаем массив1, номера ячеек массива
        checkLength(arrayOne, indexOne, indexTwo);                           // проверяем индекс на длину массива
            String[] arrayTwo = new String[arrayOne.length];                 //создаем новый массив2
            for (int i = 0; i < arrayOne.length; i++) {
                arrayTwo[i] = arrayOne[i];                                   //записываем массив1 в массив2
                String a = arrayOne[indexOne];                               //создаем переменные, содержащие значения ячеек, которые будут меняться местами
                String b = arrayOne[indexTwo];
                for (int j = 0; j < arrayTwo.length; j++) {                  //записываем новые значения в массив 2
                    arrayTwo[indexOne] = b;
                    arrayTwo[indexTwo] = a;
                }
            }
            System.out.println("Массив после: " + Arrays.toString(arrayTwo)); //выводим на экран

        }
    static void checkLength(String[] arrayOne, int indexOne, int indexTwo) throws MyArrayIndexBoundsEx {      //метод проверяет соответсвие индекса длине массива и пробрасывает исключение
        if (indexOne >= arrayOne.length | indexTwo >= arrayOne.length)
            throw new MyArrayIndexBoundsEx("Такой ячейки не существует");

    }
}




