import java.util.*;

public class Main{
	public static void main(String[] args){
		// Crie um programa que leia uma frase qualquer e diga se 
		// ela é um palíndromo, desconsiderando os espaços. Exemplos de palíndromos:

		// 	- APOS A SOPA, A SACADA DA CASA, A TORRE DA DERROTA, O LOBO AMA O BOLO, 
		// 	  ANOTARAM A DATA DA MARATONA.
		
		// Exemplos de Palíndromos:
		// 		[] - Apos a sopa
		// 		[] - A sacada da casa
		// 		[] - A torre da derrota
		// 		[] - O lobo ama o bolo
		// 		[] - Anotaram a data da maratona

		Scanner scanner = new Scanner(System.in);
		String num = "";
		String num_invert = "";

		System.out.print("Type words or phrases or numbers\nr: ");
		num = scanner.nextLine();
		System.out.println();

		for (int i = num.length() - 1; i >= 0; --i){
			num_invert += num.charAt(i);
		}

		if(num.equalsIgnoreCase(num_invert)){
			System.out.println("PALINDROME!");
		}
		else{
			System.out.println("NO PALINDROME!");
		}
	}
}