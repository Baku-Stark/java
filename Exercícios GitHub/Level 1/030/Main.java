import java.util.*;

public class Main{
	public static void main(String[] args){
		/*
			Desenvolva um programa que leia o comprimento de três retas
            e diga ao usuário se elas podem ou não formar um triângulo.
		*/

		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Determine a reta 1\nr: ");
        double r1 = scanner.nextDouble();
        System.out.println();

        System.out.print("Determine a reta 2\nr: ");
        double r2 = scanner.nextDouble();
        System.out.println();

        System.out.print("Determine a reta 3\nr: ");
        double r3 = scanner.nextDouble();
        System.out.println();
        
        if(r1 < r2 + r3 && r2 < r1 + r3 && r3 < r1 + r2){
            System.out.println("[-] É POSSÍVEL CRIAR UM TRIÂNGULO [-]");
        }

        else{
            System.out.println("[!] MEDIDAS INCORRETAS [!]");
        }

		scanner.close();
	}
}