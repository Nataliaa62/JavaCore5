package dz4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Number {

    private HashMap<String, String> map = new HashMap<>();


    public void add(String number, String secondName) {                //метод добавления
        map.put(number, secondName);
    }


    //Т.к. у элементов класса HashMap нет порядкового номера,  цикл со счетчиком не подойдет.
    // Можно получить множество ключей с помощью метода keySet(), как пройтись по множеству.
    //сравниваем значение, полученное от  команды map.get(key) с введенным значением. Если совпадает печатаем ключ

    public void get(String secondName) {
        for (String key : map.keySet()) {
            if (map.get(key).equals(secondName)) {
                System.out.println(secondName + " имеет телефон " + key);  //get получение
            }
        }
    }
//или итератором
    public void get1(String secondName) {
        Iterator iter = map.keySet().iterator();
        while (iter.hasNext()) {
            String key = (String) iter.next();
            String value = map.get(key);
            if (value.equals(secondName)) {
                System.out.println(secondName + " имеет телефон " + key);
            }
        }
    }
}

//Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
//телефонных номеров. В этот телефонный справочник с помощью метода add() можно
//добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
//учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
//тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять
//лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем
//через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного
//справочника











































