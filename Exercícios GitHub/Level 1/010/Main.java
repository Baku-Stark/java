import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		// Calcular Desconto (5%)

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nome do produto\nr: ");
		String produto = scanner.nextLine();
		System.out.println("");

		System.out.print("Valor do produto\nr: ");
		double valor = scanner.nextDouble();
		System.out.println("");

		System.out.printf("O seu desconto(5) do " + produto + " -> R$%.2f", valor-(valor*5/100));
	
		scanner.close();
	}
}