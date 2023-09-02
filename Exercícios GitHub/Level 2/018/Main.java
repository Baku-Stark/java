import java.util.*;

public class Main{
	public static void main(String[] args){
		/*
			Faça um programa que leia o peso de cinco pessoas. 
			No final, mostre qual foi o maior e o menor peso lidos.
		*/
		Scanner scanner = new Scanner(System.in);
		double maior = 0;
		double menor = 0;
		List<Double> pesos = new ArrayList<Double>();

		for(int i = 1; i < 6; i++){
			System.out.println("Registre o peso da " + i + "ª pessoa: ");
			double peso = scanner.nextDouble();

			if(i == 1){
				maior = peso;
				menor = peso;
			}

			else{
				if(peso > maior){
					maior = peso;
				}

				else if(peso < menor){
					menor = peso;
				}
			}

			pesos.add(peso);
			System.out.println("");
		}

		System.out.println("Todos os pesos registrados: " + pesos);
		System.out.println("Maior peso : " + maior);
		System.out.println("Menor peso : " + menor);

		scanner.close();
	}
}