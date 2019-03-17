package Interface;

public class Car implements Vehicle {
    @Override
    public void go() {
        System.out.println("We are driving!");
    }

    @Override
    public void stop() {
        System.out.println("We are moving slowly!");
    }


}
