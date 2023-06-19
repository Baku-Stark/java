import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Somar e Subtrair
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha dois números (adição e sbutração)!\n");
        System.out.print("Número(1): ");
        int num1 = scanner.nextInt();
        System.out.print("Número(2): ");
        int num2 = scanner.nextInt();
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("Soma : " + (num1+num2));
        System.out.println("Subtração : " + (num1-num2));
        System.out.println("------------------------------");

        scanner.close();
    }
}