import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        // Para utilizar o input utiliza-se o "Scanner"
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();

        System.out.println("-------------------------------");

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("-------------------------------");

        System.out.println("What's your favorite food?");
        String food = scanner.nextLine();

        System.out.println("-------------------------------");
        System.out.println("Hello, " + name + "!");
        System.out.println("Your age is: " + age);
        System.out.println("Your favorite food is: " + food);

        scanner.close();
    }
}
