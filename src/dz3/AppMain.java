package dz3;



import java.util.ArrayList;
import java.util.List;

public class AppMain {

    public static void main(String[] arg) {

        // Создаем яблоки и апельсины
        Apple apple1 = new Apple(1.0f);
        Apple apple2 = new Apple(1.0f);
        Apple apple3 = new Apple(1.0f);

        Orange orange1 = new Orange(1.5f);
        Orange orange2 = new Orange(1.5f);
        Orange orange3 = new Orange(1.5f);

        //Создаем списки фруктов (яблоки в апельсины нельзя положить, т.к.указали класс)
        ArrayList<Apple> appleArrayList = new ArrayList<>();
        appleArrayList.add(apple1);
        appleArrayList.add(apple2);
        appleArrayList.add(apple3);

        ArrayList<Orange> orangeArrayList = new ArrayList<>();
        orangeArrayList.add(orange1);
        orangeArrayList.add(orange2);

        ArrayList<Orange> orangeArrayList1 = new ArrayList<>();
        orangeArrayList1.add(orange3);

        //Создаем коробки с фруктами (помещаем список)
        Box<Apple> boxApple = new Box(appleArrayList);
        Box<Orange> boxOrangeOne = new Box(orangeArrayList);
        Box<Orange> boxOrangeTwo = new Box(orangeArrayList1);


        // Считаем вес коробки (2 способа)
        System.out.println("Вес коробки: " + boxApple.getWeight() + " кг");
        boxApple.getWeight1(boxApple, 1.0f);



        //Сравниваем коробки (2 способа)
        boxApple.compare(boxOrangeOne);
        boxApple.compare1(boxOrangeTwo);

        //Перемещаем фрукты
        boxOrangeTwo.changeBox(boxOrangeOne);

    }
}
