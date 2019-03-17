package AbstactClasses;

public class Cat extends Animal {
    @Override
    public void saySmth() {  //здесь мы реализовываем абстрактные методы, которые были определены в абстрактном классе Animal
        System.out.println("Meow meow!");
    }

    @Override
    public void eat() {
        System.out.println("I like milk!");
    }
}
