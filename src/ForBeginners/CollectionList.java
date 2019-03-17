package ForBeginners;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {
        int [] arr = new int [4]; //так создаётся обычный массив

        List<Integer> list1 = new ArrayList<>(); //создаём коллекцию типа List
        list1.add(5);
        list1.add(20); //добавляем элементы в коллекцию
        list1.add(60);

        System.out.println(list1.get(1)); //выводим элементы массива

        list1.set(1, 30); //так присваиваем новые значения существующим элементам
        System.out.println(list1.get(1));

        list1.remove(1); //удаляем элементы
        System.out.println(list1.get(1));

        System.out.println(list1.size()); //выводим размер массива

        System.out.println(list1.contains(20)); //проверяем, находится ли заданное значение в массиве

        Iterator <Integer> itera = list1.iterator(); //это итератор
    /*    System.out.println(itera.next());
        System.out.println(itera.next()); //итератор выводит элементы массива, начиная с первого
        System.out.println(itera.hasNext()); //итератор проверяет, есть ли следующее значение в массиве */

        while (itera.hasNext()) {
            System.out.println(itera.next()); //выводим все элементы массива с помощью цикла и hasNext
        }

    }
}
