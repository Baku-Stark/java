import java.util.*;

public class Main{
	public static void main(String[] args){
		/*
			Crie um programa que leia um número inteiro e mostre na 
			tela se ele é [PAR] ou [ÍMPAR].
		*/

		Scanner scanner = new Scanner(System.in);

		System.out.print("ESCOLHA UM NÚMERO\nr: ");
		int num = scanner.nextInt();
		System.out.println();

		if(num % 2 == 0){
			System.out.println("[-] NÚMERO PAR [-]");
		}

		else{
			System.out.println("[-] NÚMERO ÍMPAR [-]");
		}

		scanner.close();
	}
}