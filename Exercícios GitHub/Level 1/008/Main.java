import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		// Conversão [REAL -> DÓLAR]
		// 1 REAL = 0.21 DÓLAR

		Scanner scanner = new Scanner(System.in);

		System.out.print("Registre o valor (em REAL)\nr: ");
		double real_coin = scanner.nextDouble();
		System.out.println("");

		System.out.println("-------------------------");
		System.out.println(" " + "------ CONVERS\u00C3O ------");
		System.out.println("-------------------------");

		double us_coin = real_coin * 0.21;

		System.out.printf("BR : R$%.2f\n", real_coin);
		System.out.printf("US : U$%.2f\n", us_coin);
		
		scanner.close();
	}
}