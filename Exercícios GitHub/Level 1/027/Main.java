import java.util.*;

public class Main{
	public static void main(String[] args){
		/*
			Faça um programa que leia um ano qualquer e mostre se ele 
            é bissexto.
		*/

		Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha um ano\nr: ");
        int ano = scanner.nextInt();
        System.out.println();

        if(ano % 4 == 0 && ano  % 100 != 0 || ano % 400 == 0){
            System.out.println("[-] O ANO É BISSEXTO [-]");
        }

        else{
            System.out.println("[-] O ANO NÃO É BISSEXTO [-]");
        }

		scanner.close();
	}
}