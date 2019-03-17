package AbstactClasses;

public class TestClass {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.walk ("Park");
        dog.saySmth();

        cat.walk("Kitchen");
        cat.eat();
    }

}
