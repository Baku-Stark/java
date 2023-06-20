import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Crie um programa que leia um número Real qualquer 
            pelo teclado e mostre na tela a sua porção Inteira.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n\\u00Fmero (inteiro)\nr: ");
        int number = scanner.nextInt();

        float number_float = number;
        System.out.println("");
        System.out.println("N\u00FAmero escolhido : " + number);
        System.out.println("Convers\u00E3o        : " + number_float);

        scanner.close();
    }
}
