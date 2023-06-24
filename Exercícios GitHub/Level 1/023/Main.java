import java.util.*;

public class Main{
	public static void main(String[] args){
		/*
			Escreva um programa que faça o computador “pensar” em um 
			número inteiro entre 0 e 5 e peça para o usuário tentar descobrir qual foi o
			número escolhido pelo computador. O programa deverá escrever na tela se o
			usuário venceu ou perdeu.
		*/

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String game;

		System.out.println("=== JOGO DE ADIVINHAÇÃO !!! ===");
		System.out.println();

		System.out.print("Escolha um número entre 0 e 5.\nr: ");
		int user_choice = scanner.nextInt();
		int comp_choice = random.nextInt(5);
		System.out.println();

		if(user_choice == comp_choice){
			game = "[-] O JOGADOR ACERTOU! [-]";
		}

		else{
			game = "[!] O JOGADOR ERROU... [!]";
		}

		System.out.println("==============================");
		System.out.println("--- " + game + " ---");
		System.out.println();
		System.out.println("Escolha do JOGADOR   : " + user_choice);
		System.out.println("Escolha do COMPUTADOR: " + comp_choice);
		System.out.println("==============================");

		scanner.close();
	}
}