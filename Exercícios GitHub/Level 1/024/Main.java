import java.util.*;

public class Main{
	public static void main(String[] args){
		/*
			Crie um programa que leia a velocidade de um carro.
			Se ele ultrapassar 80Km/h, mostre uma mensagem dizendo que ele foi multado.
			número escolhido pelo computador. O programa deverá escrever na tela se o
			A multa vai custar R$7,00 por cada Km acima do limite.
		*/

		Scanner scanner = new Scanner(System.in);
		double multa = 7;

		System.out.print("Velocidade do carro.\nr: ");
		double km = scanner.nextDouble();
		System.out.println();

		if(km > 80){
			double multa_total = (km - 80) * 7;

			System.out.println("==============================");
			System.out.println("VELOCIDADE DO VEÍCULO : " + km + "KM");
			System.out.printf("VALOR DA MULTA         : R$%.2f\n", multa);
			System.out.println("==============================");
			System.out.printf("TOTAL                  : R$%.2f\n", multa_total);
		}

		else{
			System.out.println("==============================");
			System.out.println("VELOCIDADE DO VEÍCULO : " + km + "KM");
			System.out.println("==============================");
			System.out.println("FAÇA UMA BOA VIAGEM!!!");
		}

		scanner.close();
	}
}