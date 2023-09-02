import java.util.*;

public class Main{
	public static void main(String[] args){
		/*
			Desenvolva um programa que leia o nome, idade e sexo 
			de 4 pessoas. No final do programa, mostre: a média de idade do grupo, 
			qual é o nome do homem mais velho e quantas mulheres têm menos de 20 anos.
		*/
		Scanner scanner = new Scanner(System.in);

		String nome_homem_mais_velho = "";
		int idade_homem_mais_velho = 0;

		int mulheres_menos_20 = 0;
		
		double sum_idade = 0;

		for(int i = 1; i < 5; i++){
			System.out.println("==== Cadastre a" + i + "ª pessoa ====");
			System.out.println("Nome: ");
			String nome = scanner.nextLine();
			System.out.println("");

			System.out.println("Sexo: ");
			String sexo = scanner.nextLine();
			System.out.println("");

			System.out.println("Idade: ");
			int idade = scanner.nextInt();
			System.out.println("");
			scanner.nextLine();

			switch(sexo.toLowerCase()){
				case "m": if(i == 1){
						idade_homem_mais_velho = idade;
						nome_homem_mais_velho = nome;
					}

					else{
						if(idade > idade_homem_mais_velho){
							idade_homem_mais_velho = idade;
							nome_homem_mais_velho = nome;
						}
				};
				break;

				case "f": if(idade < 20){
					mulheres_menos_20++;
				};
				break;

				default: System.out.println("Error - SEXO");
				break;
			}

			System.out.println("");
			sum_idade = sum_idade + idade;
		}

		System.out.println("RESULTADO!!!");
		System.out.println("Média de IDADES : " + media/4);
		System.out.println("Nome do homem mais velho : " + nome_homem_mais_velho);
		System.out.println("Mulheres com menos de 20 anos : " + mulheres_menos_20);

		scanner.close();
	}
}