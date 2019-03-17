package Inheritance;

public class TestClass {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.name = "Emelya";
        dog.name = "Alma";

        cat.color = "Grey";
        dog.color = "Brown";

        cat.walk("Park");
        dog.walk("Garden");

        cat.feed("Milk");
        dog.sit();

        System.out.println("Cat name is:" + cat.name);
        System.out.println("Dog name is:" + dog.name);

        System.out.println("Вес собаки " + dog.name + "=" + dog.getWeight() + " килограмма");

        cat.sound();
        dog.sound();
    }

}
