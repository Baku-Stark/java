import java.util.Scanner;
import java.util.Arrays;

public class Arrays_List {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] cars = new String[3];

        for(int i=0; i<3; i++){
            System.out.println("Chose your car: ");
            cars[i] = scanner.nextLine();
            System.out.println("\n");
        }

        System.out.println("Your list: " + Arrays.toString(cars));

        for(String car: cars){
            System.out.println(car);
        }

        scanner.close();
    }
}
