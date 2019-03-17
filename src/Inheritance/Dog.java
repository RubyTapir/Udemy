package Inheritance;

public class Dog extends Animal {

    private int weight = 2; /*это переменная типа private, мы можем использовать её только в данном классе, поэтому для вызова её в других классах создадим геттер и сеттер*/

    public int getWeight() {  /*это геттер для переменной weight, создаётся Alt+Insert, просто возвращает нужную переменную*/
        return weight;
    }

    public void setWeight(int weight) {  /*а это сеттер, он принимает на вход значение, которое мы хотим установить, и присваивает его переменной*/
        this.weight = weight;
    }

    public void sit (){
        System.out.println("I'm sitting!");
    }

    public void lay (){
        System.out.println("I'm laying!");
    }
}
