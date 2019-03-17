package ForBeginners;

public class SimpleOperands {
    public static void main(String[] args) {
        int a;
        a= 2;
        System.out.println(a);

        int b = 4;
        System.out.println(a>b);
        System.out.println(a!=b);

        int i = 1;
        i++;
        System.out.println(i);

        i = 3;
        System.out.println(i++); //значение сохраняется

        i = 3;
        System.out.println(++i); //выводится сразу с инкрементом

        a = 10;
        b = 20;
        System.out.println(a > b || a < b); //оператор "или"
        System.out.println(a > b && a < b); //оператор "и"

        int c =9;
        System.out.println(Math.sqrt(c)); //извлекаем корень
        System.out.println(Math.pow(c,3)); //возведение в степень

        a = 10;
        a += 5; //идентично выражению a = 10+5
        System.out.println(a);



    }
}
