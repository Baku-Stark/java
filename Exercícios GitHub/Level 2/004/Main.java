import java.util.*;

public class Main{
    public static void main(String[] args) {
        /*
         * Faça um programa que leia o ano de nascimento de um jovem e 
           informe, de acordo com a sua idade, se ele ainda vai se alistar ao serviço 
           militar, se é a hora exata de se alistar ou se já passou do tempo do alistamento. 
           Seu programa também deverá mostrar o tempo que falta ou que passou do prazo.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.printf("%4s SERVIÇO MILITAR\n", " ");

        System.out.println();

        System.out.print("Qual a sua idade?\nR: ");
        int idade = scanner.nextInt();
        System.out.println("==============================");

        System.out.println();

        if(idade <= 17){
            System.out.println("[-] VOCÊ AINDA DEVE FAZER SEU ALISTAMENTO EM BREVE [-]");
        }

        else if(idade == 18){
            System.out.println("[-] VOCÊ PRECISA REALIZAR O SEU ALISTAMENTO [-]");
        }

        else{
            System.out.println("[!] O TEMPO DO SEU ALISTAMENTO JÁ PASSOU [!]");
        }

        scanner.close();
    }
}