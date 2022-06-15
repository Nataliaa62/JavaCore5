package dz4;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.*;

public class ReplayWord {
    public static void main(String[] arg) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("January");
        list.add("February");
        list.add("March");
        list.add("April");
        list.add("January");
        list.add("January");
        list.add("May");
        list.add("June");
        list.add("July");
        list.add("April");
        list.add("August");
        list.add("September");
        list.add("October");
        list.add("November");
        list.add("February");
        list.add("December");
        list.add("December");
        list.add("June");
        System.out.println(list);                                // выводим лист на экран

        Set<String> set = new HashSet<String>(list);            // помещаем лист в ХэшСет для отображения уникальных слов
        System.out.println(set);

        replayWorld(list);

    }

    public static void replayWorld(ArrayList <String> list) {            //передаем лист
        Map<String, String> map = new TreeMap<String, String>();         //создаем TreeMap(уникальный и отсортирует)
        for (String k :list) {                                           //пробегаем по листу
            int freq = Collections.frequency(list, k);                   // frequency исп. для получения частоты элемента в списке коллекции
            map.put(k, String.valueOf(freq)  );                          //в мар записываем значения
        }
        System.out.println(map);
    }
}
/*
1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
 из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.

*/



