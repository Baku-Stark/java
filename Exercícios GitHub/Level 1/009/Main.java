import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		// Pintando A Parede (QUADRADO e RETANGULO) A = b x a

		Scanner scanner = new Scanner(System.in);

		System.out.print("Altura da parede\nr: ");
		double height = scanner.nextDouble();
		System.out.println("");

		System.out.print("Largura da parede\nr: ");
		double width = scanner.nextDouble();
		System.out.println("");

		double area = height * width;

		double tinta = area / 2;

		System.out.println("[!] \u00C9 necess\u00E1rio " + tinta + " litros de tinta para pintar a parede. [!]");

		scanner.close();
	}
}