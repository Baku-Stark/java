package Inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.go();
        bicycle.stop();

        System.out.println(car.speed);
        System.out.println(bicycle.speed);

        System.out.println(car.wheels);
        System.out.println(bicycle.pedals);
    }
}

class Vehicle{
    double speed;

    void go(){
        System.out.println("This vehicle is moving");
    }

    void stop(){
        System.out.println("This vehicle is stopped");
    }
}

class Car extends Vehicle{
    int wheels = 4;
    int doors = 4;
}

class Bicycle extends Vehicle{
    int wheels = 2;
    int pedals = 2;
}
