package ForBeginners;

public class DataTypesAndArrays {
    public static void main(String[] args) {
        String str1 = "Hey Man";
        String str2 = "listen to me!";
        int a = 5893365;
        double d = 5.8555;
        float f = 15.85f;
        boolean bu = 1>2;
        char c = 'g'; //переменные разных типов

        String[] mass = new String[5]; //это массив типа String
        mass[0] = "Выдра";
        mass[1] = "Козидра";

        int[] chisla = {8, 9, 58, 25}; //это массив типа int

        System.out.println(str1 + ',' + str2);
        System.out.println("Это переменная int= " + a);
        System.out.println("This is double variable d= " + d);
        System.out.println("А это флоат= " + f);
        System.out.println("А это пример boolean: 1>2=" + bu);
        System.out.println("Это элемент массива- " + mass[0] + chisla[3]);
        System.out.println(chisla.length); //длина массива


        int[] arr2 = new int[5]; //так можно объявлять массив из 5 элементов

        System.out.println();

        for (int j = 0; j<5; j++){
            arr2[j] = j * 10;
            System.out.println(arr2[j]); //цикл берёт каждое число массива, умножает его на 10 и выводит
        }
    }
}
