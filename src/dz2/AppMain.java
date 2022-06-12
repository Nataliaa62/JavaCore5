package dz2;

public class AppMain {
    public static void main(String[] arg) throws MyArraySizeException, MyArrayDataException {

        String[][] correctArray = {                       //корректный массив 4*4 String
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        String[][] nonCorrectSize = {                     // некорректный массив 4 * 5
                {"1", "2", "3", "4", "5"},
                {"1", "2", "3", "4", "5"},
                {"1", "2", "3", "4", "5"},
                {"1", "2", "3", "4", "5"},
                {"1", "2", "3", "4", "5"}
        };

        String[][] nonCorrectData = {                       //некорректный массив Стринг не перевести в Интеджер
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "Three", "4"},

        };

        String[][] nonCorrectData1 = {                       //некорректный массив Стринг не перевести в Интеджер
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "Three", "4"},
                {"1", "2", "3", "4"}

        };

                                                                     // вызываем поочередно массивы
        try {                                                        //  контролируемый код в блоке оператора try
            ArraySum.sumArray(nonCorrectSize);                      // вызываем метод, подгружаем массив
        } catch (MyArraySizeException | MyArrayDataException ex)     //блок оператора саtch, с указанием типа перехватываемого исключения
            {
                System.out.println(ex.getMessage());                  //указываем, что нужно сделать. вывести сообщение.
            }                                                         // Метод getMessage () класса Throwable используется для возврата
                                                                      // подробного сообщения объекта Throwable, которое также может
                                                                       //быть нулевым (для получения
                                                                      //  подробного сообщения об исключении в виде строкового значения.)


        try {
            ArraySum.sumArray(nonCorrectData);
        } catch (MyArraySizeException | MyArrayDataException ex) {
            {
                System.out.println(ex.getMessage());
            }
        }

        try {
            ArraySum.sumArray(correctArray);
        } catch (MyArraySizeException | MyArrayDataException ex) {
            {
                System.out.println(ex.getMessage());
            }
        }
    }
}


//Задание

//1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
// При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException
// и MyArrayDataException и вывести результат расчета.