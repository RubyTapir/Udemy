package ForBeginners;

public class Exceptions {
    public static void main(String[] args) {

        divide(5, 2);
        divide(5, 0);

        divide1(9, 3);
        divide1(7, 0);
    }

    public static void divide(int a, int b) {
        try { //основная часть выполнения метода
            System.out.println("Result is: " + a / b);
        } catch (ArithmeticException e) { //блок, где обрабатываются эксепшены
            System.out.println("We have a problem!");
        } finally { //блок, который выполняется в любом случае, необязательный
            System.out.println("We finished!");
        }
    }

    public static void divide1(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero"); //другой вариант оформления обработки эксепшенов
        } else {
            System.out.println("Result is: " + a / b);
        }

    }

}
