package POO_Java;

public class Main{
    public static void main(String[] args){
        // main program
        Car myCar = new Car();

        System.out.println(myCar.year);
        myCar.drive();
    }
}

public class Car {
    String make = "Chevrolet";
    String model = "Covertte";
    int year = 2020;
    String color = "blue";
    double price = 50000.00;

    public void drive(){
        System.out.println("You drive the car!");
    }

    public void brake(){
        System.out.println("You step on the brakes!");
    }
}