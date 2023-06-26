import java.util.*;

public class Main{
	public static void main(String[] args){
		/*
			Desenvolva um programa que pergunte a distância de uma 
			viagem em Km. Calcule o preço da passagem, cobrando R$0,50 por Km para viagens
            de até 200Km e R$0,45 parta viagens mais longas.
		*/

		Scanner scanner = new Scanner(System.in);
        String space = "";

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.printf("%3s BAKATSU VIAGENS\n", space);
        System.out.println();
        System.out.print("Qual istância da viagem?\nr: ");
        double distance = scanner.nextDouble();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println();

        if(distance <= 200){
            double short_trip = distance * 0.50;
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.printf("%4s VIAGEM CURTA!\n", space);
            System.out.println();
            System.out.printf("%2s DISTÂNCIA : %.1f KM\n", space, distance);
            System.out.printf("%2s PREÇO     : R$%.2f\n", space, short_trip);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
        }

        else{
            double long_trip = distance * 0.45;
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.printf("%4s VIAGEM LONGA!\n", space);
            System.out.println();
            System.out.printf("%2s DISTÂNCIA : %.1f KM\n", space, distance);
            System.out.printf("%2s PREÇO     : R$%.2f\n", space, long_trip);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
        }

		scanner.close();
	}
}