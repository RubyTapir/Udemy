package ClassesAndObjects;

public class CarObject {
    public static void main(String[] args) {
        Car carClass1 = new Car();
        carClass1.color = "Black";
        carClass1.length = 5000;
        carClass1.height = 2000;
        carClass1.width = 2000;

        carClass1.addWeight(50);
        carClass1.drive(50);

        carClass1.addWeight(700);
        carClass1.drive(100);

        Car carClass2 = new Car();
        carClass2.color = "White";
        Car carClass3 = new Car();
        carClass3.color = "Yellow";

        carClass2.drive(150);
        carClass3.drive(200);

        System.out.println("The color of this car is: " + carClass1.color);
        System.out.println("The color of this car is: " + carClass2.color);
        System.out.println("The color of this car is: " + carClass3.color);

        Car car4 = new Car("Green"); //здесь при создании объекта вызывается конструктор, задаём параметр
        System.out.println("The color of this car is: " + car4.color);

        Car car5 = new Car("Red", 2100, 3200, 1000); //здесь при создании объекта вызывается перегруженный конструктор, задаём параметры
        System.out.println(car5.color + " " + car5.height + " " + car5.width + " " + car5.length);

        System.out.println(Car.var1); //не нужно создавать объект класса, чтобы получить значение статичной переменной
        Car.var1 = 20; //присваиваем статичной переменной новое значение
        System.out.println(car4.var1); //выводим значение статичной переменной для любого объекта класса
        System.out.println(car5.var1);

        Car.method1(); //вызываем статичный метод (опять же - без создания объекта)

        String.format("And the winner is...", "winner"); //format - это тоже статичный метод, он вызывается из класса String
        Math.sqrt(9); //статичный метод sqrt из класса Math
    }
}
