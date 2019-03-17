package ForBeginners;

public class Cycles {
    public static void main(String[] args) {
        for (int i = 0; i<10; i++) {
            System.out.println(i*10); //цикл for
        }

        System.out.println();

        for (int i = 10; i>0; i--) {
            System.out.println(i); //обратный отсчёт от 10
        }

        System.out.println();

        int [] array = new int [10];
        for (int i = 0; i < 10; i++) {
            array[i] = i*2; //создаём массив и заполняем его с помощью цикла
        }

        for (int i = 0; i<10; i++) {
            System.out.println("Element of array " + i + " is:" + array[i]); //выводим элементы массива с помощью цикла
        }

        System.out.println();

        for (int element : array) {
            System.out.println(element); //ещё один способ вывести элементы массива с помощью цикла (т.наз. цикл for each)
        }

        System.out.println();

        int i = 0;
        while (i<10) {
            i++;
            System.out.println(i); //цикл while - сначала проверка, потом действие
        }

        System.out.println();

        i = 0;
        do {
            System.out.println("dododo - " + i);
            i++;
        }
        while (i<6); //цикл do-while - сначала действие, потом проверка
    }
}
