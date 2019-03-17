package Inheritance;

public class Cat extends Animal{
    public void feed (String food) {
        System.out.println("I like:" + food);
    }

    @Override
    public void sound () {
        System.out.println("Meow, meow, meow!"); /*это метод для демонстрации принципа полиморфмизма, на примере переопределения метода sound из класса Animal*/
    }
}
