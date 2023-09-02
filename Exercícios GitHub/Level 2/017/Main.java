import java.util.*;

public class Main{
	public static void main(String[] args){
		/*
			Crie um programa que leia o ano de nascimento de sete 
			pessoas. No final, mostre quantas pessoas ainda não atingiram a maioridade e 
			quantas já são maiores.
		*/
		Scanner scanner = new Scanner(System.in);
		int current_year = 2023;
		int maior = 0;
		int menor = 0;
		List<Integer> maioridade = new ArrayList<Integer>();
		List<Integer> n_maioridade = new ArrayList<Integer>();

		for(int i = 1; i < 8; i++){
			System.out.println("Registre o ano da " + i + "ª pessoa: ");
			int year = scanner.nextInt();
			int age = current_year - year;

			if(age >= 18){
				maioridade.add(year);
				maior++;
			}

			else{
				n_maioridade.add(year);
				menor++;
			}

			System.out.println("");
		}

		System.out.println("Ano das pessoas com 18 anos ou mais: " + maioridade + "| Qtd: " + maior);
		System.out.println("Ano das pessoas menores de idade   : " + n_maioridade + "| Qtd: " + menor);


		scanner.close();
	}
}