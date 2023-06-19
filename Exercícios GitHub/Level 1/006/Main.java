import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Escreva um programa que um valor em metros e o exiba convertido em centímetros e milímetros.
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha um valor em metros\nr: ");
        double num = scanner.nextDouble();
        System.out.println("------------------------------");
        double cm = num * 100;
        double mm = num * 1000;
        System.out.println("Cent\u00EDmetros : " + (cm) + "cm");
        System.out.println("Mil\u00EDmetros  : " + (mm) + "mm");
        System.out.println("------------------------------");

        scanner.close();
    }
}