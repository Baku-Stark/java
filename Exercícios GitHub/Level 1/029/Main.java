import java.util.*;

public class Main{
	public static void main(String[] args){
		/*
			Escreva um programa que pergunte o salário de um 
            funcionário e calcule o valor do seu aumento. Para salários superiores a 
            R$1250,00, calcule um aumento de 10%. Para os inferiores ou iguais, o aumento é 
            de 15%.
		*/

		Scanner scanner = new Scanner(System.in);
        String space = "";
        double aumento;
        
        System.out.print("Qual o salário do funcionário?\nr: ");
        double salario = scanner.nextDouble();
        System.out.println();
        
        if(salario > 1250){
            aumento = salario + (salario * 10/100);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.printf("%2s SALÁRIO     : R$%.2f\n", space, salario);
            System.out.printf("%2s AUMENTO(10) : R$%.2f\n", space, aumento);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
        }

        else{
            aumento = salario + (salario * 15/100);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.printf("%2s SALÁRIO     : R$%.2f\n", space, salario);
            System.out.printf("%2s AUMENTO(15) : R$%.2f\n", space, aumento);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
        }

		scanner.close();
	}
}