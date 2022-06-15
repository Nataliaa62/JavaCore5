package dz4;

import java.util.*;

public class LessonAnalysis {

    private static Object Collection;

    public  static void main (String [] arg) {


        // ЭТО РАЗБОР УРОКА,  МОЖНО НЕ ПРОВЕРЯТЬ
//ArrayList представляет собой динамический массив(список) в Java;
        ArrayList <String> list = new ArrayList<String>();
        list.add("January");
        list.add("February");
        list.add("March");
        list.add("April");
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
        list.add("June");



        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            if (str.equals("A")) {
                iter.remove();
            }
        }
        System.out.println(list);
        System.out.println(list);    //распечатать лист
        System.out.println(list.get(4));   //получить элемент массива
        list.set(5, "See");                 //заменить по индексу
        System.out.println(list);
        list.remove(2);               //удалить по индексу
        System.out.println(list);
        String [] arr = new String[list.size()];  //преобразовать лист в массив

        List<String> list5 = new ArrayList<>(Arrays.asList("A", "B", "C", "C", "A", "A",
                "B", "C", "B"));
        Iterator<String> iter1 = list5.iterator();
        while (iter1.hasNext()) {

            String str = iter1.next();
            if (str.equals("A")) {
                iter1.remove();
            }
        }
        System.out.println(list5);



        Set<String> set = new HashSet<>(); //создаем сет, как и лист, но уникальные элементы
        set.add("January");              //класс HashSet не гарантирует упорядоченности элементов. распечатаются хаотично
        set.add("February");
        set.add("March");
        set.add("April");
        set.add("January");
        set.add("May");
        set.add("June");
        set.add("July");
        set.add("April");
        set.add("August");
        set.add("September");
        set.add("October");
        set.add("November");
        set.add("February");
        set.add("December");
        set.add("June");
        System.out.println(set);



        // TreeSet Время доступа и извлечения элементов достаточно мало, благодаря чему класс TreeSet оказывается отличным
        // выбором для хранения больших объемов отсортированных данных
        // как и set, но Объекты сохраняются в отсортированном порядке по возрастанию. уникальность
        Set<String> set2 = new TreeSet<>();
        set2.add("January");
        set2.add("February");
        set2.add("March");
        set2.add("April");
        set2.add("January");
        set2.add("May");
        set2.add("June");
        set2.add("July");
        set2.add("April");
        set2.add("August");
        set2.add("September");
        set2.add("October");
        set2.add("November");
        set2.add("February");
        set2.add("December");
        set2.add("June");
        System.out.println(set2);


        //HashMap не гарантирует порядок расположения своих элементов, соответственно порядок их перебора может не
        // соответствовать порядку их добавления
        HashMap <String, String>  map = new HashMap<String, String>();
        map.put("A", "B"); // добавление, метод put(key, value), ключ и значение
        map.put("D", "E");
        map.put("F", "G");
        map.put("E", "K");
        map.put("F", "G");

        System.out.println(map);

        System.out.println(map.get("F")); // получить значение ключа Ф


        // Перебор значений. Все пары (ключ-значение) хранятся во внутреннем интерфейсе Map.Entry,
        // а чтобы получить их, нужно вызвать метод entrySet().
        // Он возвращает множество (Set) пар, которые можно перебрать в цикле:
        for (Map.Entry<String, String> o : map.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());  //get получение
        }

         // Или используя итератор:
        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<String, String> entry =  itr.next();
            // get key
            String key = entry.getKey();
            // get value
            String value = entry.getValue();
        }

        //TreeMap   хранит пары «ключ-значение» в отсортированном порядке (в порядке возрастания ключей).
        Map <String, String>  map1 = new TreeMap<String, String>();
        map1.put("F", "G");
        map1.put("E", "K");
        map1.put("U", "G");
        map1.put("D", "E");
        map1.put("A", "B");
        System.out.println(map);
    }
    /*String a = "FFF";
    String b = "FFF";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));*/
}

