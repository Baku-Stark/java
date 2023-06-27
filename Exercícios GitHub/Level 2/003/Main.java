import java.util.*;

public class Main{
    public static void main(String[] args) {
        /*
         * Escreva um programa que leia dois números inteiros e 
           compare-os. mostrando na tela uma mensagem:

            – O primeiro valor é maior

            – O segundo valor é maior

            – Não existe valor maior, os dois são iguais
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.print("Escolha o 1° número\nR: ");
        int num1 = scanner.nextInt();
        System.out.println();

        System.out.print("Escolha o 2° número\nR: ");
        int num2 = scanner.nextInt();
        System.out.println("==============================");

        System.out.println();

        if(num1 > num2){
            System.out.println("O número " + num1 + " é maior que " + num2);
        }

        else if(num2 > num1){
            System.out.println("O número " + num2 + " é maior que " + num1);
        }

        else{
            System.out.println("Ambos são iguais.");
        }

        scanner.close();
    }
}