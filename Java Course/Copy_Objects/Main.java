package Copy_Objects;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Nissan", "GT-R R35", 2020);
        //Car car2 = new Car("Ford", "Mustang", 2022);
        Car car2 = new Car(car);

        //car2.copy(car);

        System.out.println(car);
        System.out.println(car2);
        System.out.println();
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}
