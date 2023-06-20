import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Escreva um programa que converta uma temperatura 
            digitando em graus Celsius e converta para graus Fahrenheit.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversão \u00BAC -> \u00BAF");
        System.out.println("");

        System.out.print("-- Registre a temperatura (\u00BAC)\nr: ");
        double celsius = scanner.nextDouble();
        System.out.println("");

        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf(">>> Temperatura convertida para Fahrenheit : %.0f", fahrenheit);
        scanner.close();
    }
}
