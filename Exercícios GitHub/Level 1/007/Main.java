import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		// Tabuada
		Scanner scanner = new Scanner(System.in);

		System.out.print("Escolha um n\u00FAmero\nr: ");
		int number = scanner.nextInt();

		System.out.println("------------------------------");
		System.out.println(" " + "------ TABUADA DE " + number + " ------");
		System.out.println("------------------------------");

		for(int i = 0; i < 11; i++){
			System.out.println("\t" +number + " x " + i + " = " + number * i);
		}
		System.out.println("------------------------------");

		scanner.close();
	}
}