package dz3;

import java.util.ArrayList;

// T является наследником класса Фрукты
public class Box <T extends  Fruit> {

    //в список будут помещаться объекты фруктов
    ArrayList<T> fruit;

    public Box(ArrayList<T> fruit) {
        this.fruit = fruit;

    }

    // Задание D. 1 способ проходит по элементам списка, записывает в переменную value вес и суммирует в result
    public float getWeight(){
        float result = 0.0f;
        for(T t: getFruit()){
                float value =  t.getWeightSimple();
                result = result + value;
        }
        return result;
    }

    //2 способ
    public  float getWeight1(Box box, float weight) {
        float count = box.fruit.size() * weight;
        System.out.println("Вес коробки: " +  count + " кг");
        System.out.println();
        return count;
    }


    //Задание Е. 1 способ: в метод передаем бокс и сравниваем результаты, полученные из метода getWeight
    public void compare(Box box) {
        if (this.getWeight() == box.getWeight()) {
            System.out.println("Коробки равны");

        }
        else System.out.println("Коробки не равны");
    }

    //2 способ сравнения с помощью Math.abs
    public void compare1(Box box) {
       if ( Math.abs(this.getWeight() - box.getWeight()) < 0.001){
        System.out.println("Коробки равны");
       }
        else System.out.println("Коробки не равны");
        System.out.println();
    }


    // Задание F. Так как внутри бокса хранится список, можно использовать методы c ArrayList: addAll, clear
    public void changeBox(Box <T> box) {
        System.out.print("Содержимое коробки 1 до: ");
        for (int i = 0; i < box.getFruit().size(); i++) {
            System.out.print(box.getFruit().get(i).getName() + " ");

        }
        System.out.println();

        System.out.print("Содержимое коробки 2 до: ");
        for (int i = 0; i < this.getFruit().size(); i++) {
            System.out.print(this.getFruit().get(i).getName() + " ");
        }
        System.out.println();

        box.getFruit().addAll(this.getFruit());
        this.getFruit().clear();
        System.out.println();

        System.out.print("Содержимое коробки 1 после: ");
        for (int i = 0; i < box.getFruit().size(); i++) {
            System.out.print(box.getFruit().get(i).getName() + " ");

        }
        System.out.println();
        System.out.print("Содержимое коробки 2 после: ");
        for (int i = 0; i < this.getFruit().size(); i++) {
            System.out.print(this.getFruit().get(i).getName() + " ");
        }
    }


    public ArrayList<T> getFruit() {
        return fruit;
    }
}



// Задача:
//a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
//b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу
//фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//c. Для хранения фруктов внутри коробки можно использовать ArrayList (ArrayList обсудим
//на следующем уроке);
//d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта
//и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
//e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую
//коробку с той, которую подадут в compare() в качестве параметра. true – если их массы
//равны, false в противоположном случае. Можно сравнивать коробки с яблоками и
//апельсинами;
//f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
//Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
//Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются
//объекты, которые были в первой;
//g. Не забываем про метод добавления фрукта в коробку.





//Мусор.

  /* public static <T extends Fruit> void cccc(ArrayList<T> one, ArrayList<T> two) {    //метод из одной коробки в другую

        one.addAll(two);                                 //addAll перебрасывает элементы
        two.clear();                                       //clear очищает список

    }*/
