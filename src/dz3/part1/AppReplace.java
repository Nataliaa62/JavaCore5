package dz3.part1;

import java.util.Arrays;

public class AppReplace {


    public static void main(String[] arg) throws MyArrayIndexBoundsEx {

        //Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);

        String[] arrayOne = {"One", "Two", "Three", "Four", "Five", "Six"};

        System.out.println("Массив до: " + Arrays.toString(arrayOne));


        try {
            ReplaceArray.replaceIndex(arrayOne, 1, 3);
        } catch (MyArrayIndexBoundsEx ex) {
            {
                System.out.println(ex.getMessage());
            }
        }
    }
}


