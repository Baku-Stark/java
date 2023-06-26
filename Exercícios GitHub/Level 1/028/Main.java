import java.util.*;

public class Main{
	public static void main(String[] args){
		/*
			Faça um programa que leia três números e mostre qual é o 
            maior e qual é o menor.
		*/

		Scanner scanner = new Scanner(System.in);
        int maior;
        int menor;

        System.out.print("Escolha o 1° numero\nr: ");
        int num1 = scanner.nextInt();
        System.out.println();

        System.out.print("Escolha o 2° numero\nr: ");
        int num2 = scanner.nextInt();
        System.out.println();

        System.out.print("Escolha o 3° numero\nr: ");
        int num3 = scanner.nextInt();
        System.out.println();

        if(num1 > num2 && num1 > num3){
            maior = num1;
            System.out.println("MAIOR NÚMERO : " + maior);
        }

        if(num2 > num1 && num2 > num3){
            maior = num2;
            System.out.println("MAIOR NÚMERO : " + maior);
        }

        if(num3 > num1 && num3 > num2){
            maior = num3;
            System.out.println("MAIOR NÚMERO : " + maior);
        }

        if(num1 < num2 && num1 < num3){
            menor = num1;
            System.out.println("MENOR NÚMERO : " + menor);
        }

        if(num2 < num1 && num2 < num3){
            menor = num2;
            System.out.println("MENOR NÚMERO : " + menor);
        }

        if(num3 < num2 && num3 < num2){
            menor = num3;
            System.out.println("MENOR NÚMERO : " + menor);
        }

        if(num1 == num2 && num1 == num3){
            System.out.println("[-] TODOS OS NÚMEROS SÃO IGUAIS [-]");
        }

		scanner.close();
	}
}