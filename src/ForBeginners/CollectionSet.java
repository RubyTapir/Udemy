package ForBeginners;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(); //массив set отличается от массива list тем, что содержит только уникальные значения и в set нет индексов

        set1.add(11);
        set1.add(12);
        set1.add(13);
        set1.add(12);

        System.out.println(set1.size()); //размер массива = 2, потому что 12 повторяется и это уже не уникальное значение

        Iterator<Integer> itera = set1.iterator();
        while (itera.hasNext()) {
            System.out.println(itera.next()); //выводим элементы сета с помощью цикла while и hasNext
        }

        for (int i : set1) {
            System.out.println(i); //выводим элементы сета с помощью цикла for
        }
    }
}
