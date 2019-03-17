package AbstactClasses;

public class Dog extends Animal {
    @Override
    public void saySmth() {
        System.out.println("Bark bark!"); //в этом классе мы переопределили абстрактные методы из класса Animal
    }

    @Override
    public void eat() {
        System.out.println("I like meat!");
    }

    public void sit() {
        System.out.println("I'm sitting...");
    }
}
