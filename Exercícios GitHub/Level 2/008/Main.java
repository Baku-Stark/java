import java.util.*;

public class Main{
    public static void main(String[] args) {
        /*
         * Desenvolva uma lógica que leia o peso e a altura de uma 
           pessoa, calcule seu Índice de Massa Corporal (IMC) e mostre seu status, de 
           acordo com a tabela abaixo:

            – IMC abaixo de 18,5: Abaixo do Peso

            – Entre 18,5 e 25: Peso Ideal

            – 25 até 30: Sobrepeso

            – 30 até 40: Obesidade

            – Acima de 40: Obesidade Mórbida 
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.print("Peso\nR: ");
        float peso = scanner.nextFloat();
        System.out.println();

        System.out.print("Altura\nR: ");
        float altura = scanner.nextFloat();
        System.out.println();

        float imc = altura / (peso * 2);
        System.out.println("==============================");
        System.out.println("PESO   : " + peso + " kg");
        System.out.println("ALTURA : " + altura + " cm");
        System.out.println("IMC    : " + imc + " kg/m\u00B2");

        System.out.println();

        if(imc < 18.5){
            System.out.println("[-] IMC - Abaixo do Peso [-]");
        }

        else if(imc <= 18.5 && imc <= 25){
            System.out.println("[-] IMC - Peso Ideal [-]");
        }

        else if(imc > 25 && imc <= 30){
            System.out.println("[-] IMC - Sobrepeso [-]");
        }

        else if(imc > 30 && imc <= 40){
            System.out.println("[-] IMC - Obesidade [-]");
        }

        else{
            System.out.println("[-] IMC - Obesidade Mórbida [-]");
        }

        scanner.close();
    }
}