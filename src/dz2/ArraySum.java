package dz2;

public class ArraySum {

    static int lenghtArray = 4;

    public static int sumArray (String[][] array) throws MyArraySizeException, MyArrayDataException {       //метод, преобразующий массив String в Int и суммирующий значения
        checkLength(array);                       //метод проверит размер массива
        int count = 0;                          //счетчик
        int i =0;
        int j =0;
        try {                                   // проверяемый код
            for (i = 0; i < array.length; i++) {                            // проходим по массиву переводя стринг в инт
                for (j = 0; j < array.length; j++) {
                    array[i][j] = String.valueOf(Integer.parseInt(array[i][j]));
                    count += Integer.parseInt(array[i][j]);                    //суммируем значения
                }
            }
            System.out.println("Сумма чисел массива равна " + count);          //вывод на экран будет, если не сработают исключения
        } catch (NumberFormatException ex) {                                   //блок оператора саtch, с указанием типа перехватываемого исключения
            throw new MyArrayDataException("Ошибка в позиции: "  + i + " " + j);   // NumberFormatException -когда не может преобразовать String в числовой тип.
        }
        return count;
    }


    static void checkLength(String[][] array) throws MyArraySizeException {      //метод проверяет соответсвие длины массива и пробрасывает исключение
        if(array.length!= lenghtArray || array[0].length!=lenghtArray)
            throw new MyArraySizeException();

             //если длина массива не равна 4*4 пробрасывется исключение. проверка происходит в методе sumArray. и если условие не выполняется
             // код не выполнится.
    }


}

