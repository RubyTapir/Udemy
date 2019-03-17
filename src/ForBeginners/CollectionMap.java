package ForBeginners;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionMap {
    public static void main(String[] args) {
        Map <Integer, String> map1 = new HashMap<>(); //Map - тоже коллекция, но хранит значения в паре ключ-значение
        map1.put(1, "Black");
        map1.put(2, "White");
        map1.put(3, "Yellow"); //добавляем значения в map. Ключи должны быть уникальными!

        System.out.println(map1.get(1)); //выводим значение по ключу

        System.out.println(map1.size()); //размер

        System.out.println(map1.containsKey(1)); //есть ли такой ключ
        System.out.println(map1.containsKey(4));
        System.out.println(map1.containsValue("White")); //есть ли такое значение
        System.out.println(map1.containsValue("Green"));

        Set <Integer> keys = map1.keySet(); //создаём set с ключами из map
        Iterator <Integer> itera = keys.iterator(); //создаём итератор
        while (itera.hasNext()) {
            System.out.println(map1.get(itera.next())); //выводим значения map по итератору ключей
        }

        map1.put(2, "Brown"); //изменяем уже существующее значение, указывая существующий ключ
        System.out.println(map1.get(2));
    }
}
