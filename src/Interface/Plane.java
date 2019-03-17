package Interface;

public class Plane implements Vehicle {
    @Override
    public void go() {
        System.out.println("We are flying!");
    }

    @Override
    public void stop() {
        System.out.println("AAAAA!");
    }

    public void setSpeed (int speed) {
        System.out.println("Our speed is: " + speed);
    }
}
