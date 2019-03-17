package ForBeginners;

public class Methods {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        int sum1 = getSum(a, b); //присваиваем этой переменной результат выполения метода getSum (см.ниже)
        System.out.println(sum1);

        int sum2 = getSum(10,2); //теперь мы можем вызывать этот метод и присваивать результат его выполнения любой переменной
        System.out.println(sum2);

        System.out.println(getSum(2,5)); //...или сразу выводить результат выполнения метода

        int result = getSum(1, 2); //здесь переменная result принимает результат выполнения метода getSum с двумя параметрами
        System.out.println(result);
        result = getSum(6, 8, 15); //а здесь в result уже результат getSum с тремя параметрами
        System.out.println(result);

        showSum(1,2,3); //вызываем метод showSum с параметрами

        sayHelloMotherFucker(); //а у этого метода нет никаких параметров

        sayMyName("Vasya"); //вызываем метод и передаём ему любое значение name типа String
        String name = "Yura";
        sayMyName(name);

        sayMyName("Mark", "Andrey"); //вызов перегруженного метода sayMyName

        showSumToPerson("Boris", 5, 9, 46); //вызываем метод showSumToPerson
    }

    private static int getSum (int x, int y) {  //создаём метод, который складывает 2 числа
        int sum = x + y; //в теле метода создаём переменную
        return sum; //метод возвращает результат сложения двух чисел
    }

    private static int getSum (int x, int y, int z) {  //это называется перегрузка метода - теперь у него 3 параиетра
        int sum = x + y + z;
        return sum;
    }


    private static void showSum (int x, int y, int z) { //создаём метод, который просто выводит сумму чисел, но ничего не возвращает (он void, поэтому в теле метода нет return)
        int sum3 = x + y + z;
        System.out.println("Sum is " + sum3);
    }

    private static void sayHelloMotherFucker () { //создаём метод, который ничего не принимает и ничего не возвращает, а просто выводит сообщение
        System.out.println("Hello, I'm motherfucker!");
    }

    private static void sayMyName (String name) { //создаём метод, который принимает значение переменной name
        System.out.println("Hello, " + name +"!");
    }

    private static void sayMyName (String name1, String name2) { //это перегрузка метода sayMyName
        System.out.println("Hello, " + name1 +"!");
        System.out.println("Hello, " + name2 +"!");
    }

    private static void showSumToPerson (String name, int a, int b, int c) {
        sayMyName(name); //вызываем уже имеющиеся методы внутри нового созданного метода
        showSum(a, b, c);
        System.out.println("Bye-bye,baby!");
    }
}
