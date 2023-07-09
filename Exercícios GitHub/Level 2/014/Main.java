import java.util.*;

public class Main{
	public static void main(String[] args){
		/*
			Desenvolva um programa que leia seis números 
			inteiros e mostre a soma apenas daqueles que forem pares. Se o valor 
			digitado for ímpar, desconsidere-o.
		*/

		Scanner scanner = new Scanner(System.in);
		int pairNumbersSum = 0;
		List<Integer> pairNumbers = new  ArrayList<Integer>();

		for (int i=1; i < 7; i++) {
			System.out.print(i + " - Choose a number\nr: ");
			int number = scanner.nextInt();
			System.out.println();

			if(number % 2 == 0){
				pairNumbers.add(number);
				pairNumbersSum += number;
			}
		}

		System.out.println("==============================");
		System.out.print("RESULT (Adding even numbers): " + pairNumbersSum + "\n");
		System.out.print("YOUR LIST (w/ Pair Numbers) : " + pairNumbers + "\n");

		scanner.close();
	}
}