package toString_Method;

public class Main {
    public static void main(String[] args){
        Car car = new Car();
        System.out.println(car.toString());
        // ou também pode utilizar
        // ---> System.out.println(car);
    }
}

class Car{
    String make = "Ford";
    String model = "Mustang";
    String color = "Red";
    int year = 2021;

    public String toString(){
        return make + "\n" + model + "\n" + color + "\n" + year;
    }
}