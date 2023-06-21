import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
         * Crie um programa que leia o nome completo de uma pessoa e 
            mostre:
         *  - O nome com todas as letras maiúsculas e minúsculas.
         *  - Quantas letras ao todo (sem considerar espaços).
         *  - Quantas letras tem o primeiro nome.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva seu nome completo\nr: ");
        String name = scanner.nextLine();
        System.out.println();

        System.out.println("=-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-=");
        System.out.println("Nome com todas as letras MAIÚSCULAS  : " + name.toUpperCase());
        System.out.println("Nome com todas as letras MINÚSCULAS  : " + name.toLowerCase());
        System.out.println();
        System.out.println("Quantidade de letras no nome         : " + name.replace(" ", "").length());
        System.out.println();
        String[] name_list = name.split(" ");
        System.out.println("Quantidade de letras no PRMEIRO nome : " + name_list[0].length());
        System.out.println("=-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-=");

        scanner.close();
    }
}
