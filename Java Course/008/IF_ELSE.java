import java.util.Scanner;

public class IF_ELSE {
    public static void main(String[] args){
        System.out.println("How old are you?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n");

        int age = scanner.nextInt();

        if(age == 50){
            System.out.println("Hello, boomer!");
        }

        else if(age >= 18){
            System.out.println("You're an adult!");
        }

        else if(age >= 13){
            System.out.println("You're a teenager!");
        }

        else{
            System.out.println("You're a child");
        }

        scanner.close();
    }
}
