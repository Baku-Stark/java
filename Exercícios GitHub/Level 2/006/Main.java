import java.util.*;

public class Main{
    public static void main(String[] args) {
        /*
         * A Confederação Nacional de Natação precisa de um programa 
           que leia o ano de nascimento de um atleta e mostre sua categoria, de acordo com a 
           idade:

            – Até 9 anos: MIRIM

            – Até 14 anos: INFANTIL

            – Até 19 anos: JÚNIOR

            – Até 25 anos: SÊNIOR

            – Acima de 25 anos: MASTER

        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.printf("%4s CONFEDERAÇÃO NACIONAL DE NATAÇÃO\n", " ");

        System.out.println();

        System.out.print("Data de Nascimento do Atleta\nDIA: ");
        int dia = scanner.nextInt();
        System.out.println();

        System.out.print("MÊS: ");
        int mes = scanner.nextInt();
        System.out.println();

        System.out.print("ANO: ");
        int ano = scanner.nextInt();

        int idade = 2023 - ano;
        System.out.println("==============================");
        System.out.println("DATA DE NASCIMENTO : " + dia + " / " + mes + " / " + ano);

        System.out.println();

        if(idade <= 9){
            System.out.println("[!] ALUNO ESTÁ NA CATEGORIA MIRIM [!]");
            System.out.println("Idade : " + idade + " anos.");
        }

        else if(idade >= 10 && idade <= 14){
            System.out.println("[!] ALUNO ESTÁ NA CATEGORIA INFANTIL [!]");
            System.out.println("Idade : " + idade + " anos.");
        }

        else if(idade >= 15 && idade <= 19){
            System.out.println("[!] ALUNO ESTÁ NA CATEGORIA JÚNIOR [!]");
            System.out.println("Idade : " + idade + " anos.");
        }

        else if(idade >= 20 && idade <= 25){
            System.out.println("[!] ALUNO ESTÁ NA CATEGORIA SÊNIOR [!]");
            System.out.println("Idade : " + idade + " anos.");
        }

        else if(idade > 25){
            System.out.println("[!] ALUNO ESTÁ NA CATEGORIA MASTER [!]");
            System.out.println("Idade : " + idade + " anos.");
        }

        scanner.close();
    }
}