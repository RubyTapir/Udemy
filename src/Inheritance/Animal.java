package Inheritance;

public class Animal {
    String name;
    String color;

    protected int var1 = 10; /*это переменная для демонстрации принципа инкапсуляции, не бойся её:)*/

    public void walk (String place) {
        System.out.println("We are walking here:" + place);
    }

    public void sleep (){
        System.out.println("Zzz...");
    }

    public void sound () {
        System.out.println("Hello,dude!"); /*это метод для демонстрации принципа полиморфмизма, на примере переопределения методов в классе Cat*/
    }
}
