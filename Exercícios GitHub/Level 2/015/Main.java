import java.util.*;

public class Main{
	public static void main(String[] args){
		// Faça um programa que leia um número inteiro e diga se 
		// ele é ou não um número primo. 
		Scanner scanner = new Scanner(System.in);
		int tot = 0;

		System.out.print("Type a number: ");
		int number = scanner.nextInt();

		for(int i = 1; i < number + 1; i++){
			if(number % i == 0){
				tot += 1;
			}
			System.out.println(i);
		}
		System.out.println();
		if (tot == 2){
			System.out.println("The number " + number + " is a prime number");
		}
		else{
			System.out.println("The number " + number + " isn't a prime number");
		}
	}
}