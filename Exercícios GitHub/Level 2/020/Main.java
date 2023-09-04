import java.util.*;

public class Main{
	public static void main(String[] args){
		/*
			Faça um programa que leia o sexo de uma pessoa, 
			mas só aceite os valores ‘M’ ou ‘F’. Caso esteja errado, peça a digitação 
			novamente até ter um valor correto.
		*/
		Scanner scanner = new Scanner(System.in);
		boolean while_cond = true;
		String sexo = "";

		do{
			System.out.println("Qual o seu sexo?");
			sexo = scanner.nextLine();

			switch(sexo.toUpperCase()){
				case "M": System.out.println("[-] O sexo é masculino");
					while_cond = false;
					break;

				case "F": System.out.println("[-] O sexo é feminino");
					while_cond = false;
					break;
			}

			System.out.println("\n");
		}while(while_cond);

		scanner.close();
	}
}