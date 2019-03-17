package ClassesAndObjects;

public class Car {

    public Car() { //Это конструктор класса - такой метод, он должен называться так же, как и класс - Car и вызывается при создании объекта класса
        System.out.println("New car created!");
    }

    public Car(String color) { //Перегружаем метод - конструктор класса - задаём ему параметр
        this.color = color; //при создании объекта указываем цвет и объект сразу принимает его
    }

    static int var1 = 10; //создаём статичную переменную
    /*final static int var1 = 10; //если мы напишем final, то переменная var1 будет константой и мы не сможем присваивать ей новые значения
    то же самое и с методами - метод с final мы не сможем переопределить*/
    static void method1 () { //создаём статичный метод
        System.out.println("static method");
    }

    public Car (String color, int height, int width, int length) { //ещё раз перегружаем конструктор
        this.color = color;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    int height;
    int width;
    int length;
    int weight = 2000;
    int maxWeight = 2700;
    int speed;
    int maxSpeed = 260;
    String color;

    public void addWeight(int weight) {
        this.weight += weight; //этот метод добавляет к текущему значению массы значение переменной weight
        System.out.println("New weight: " + this.weight);
    }

    public void drive (int speed) {
        if (weight <= maxWeight) {  //если масса авто <= максимальной массе
            this.speed = speed; //скорость данного автомобиля станет равной скорости, которую мы задали в методе
            System.out.println("We are driving " + speed + " km/h!");
        } else {
            System.out.println("Cannot drive! " + weight + " kg" + " is too much!");
        }
    }

}
