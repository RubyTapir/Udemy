package AbstactClasses;

public abstract class Animal {
    public abstract void saySmth(); //это абстрактные методы, т.е. они ещё не реализованы
    public abstract void eat();

    public void walk (String place) {
        System.out.println("I'm walking here: " + place);
    }


}
