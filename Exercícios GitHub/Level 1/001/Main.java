import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Utilizar "print" e "input"
        System.out.println("Hello World!\n");
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? r: ");
        String name = scanner.nextLine();
        System.out.println("");
        System.out.println("Hi " + name + "!" + "\nWELCOME TO JAVA!!! :D");
        scanner.close();
    }
}