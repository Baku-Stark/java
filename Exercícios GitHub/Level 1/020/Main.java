import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
         * Crie um programa que leia o nome de uma pessoa e diga 
            se ela tem “SILVA” no nome.
        */
        boolean silva = false;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome completo\nr: ");
        String nome = scanner.nextLine();
        System.out.println();

        System.out.println("=-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-=");
        String[] nome_list = nome.toUpperCase().split(" ");

        for(String word : nome_list){
            // System.out.println(word);

            if(word.toString() == "SILVA"){
                silva = true;
                break;
            }
        }

        if(silva){
            System.out.println("[-] O NOME POSSUI 'SILVA' [-]");
        }

        else{
            System.out.println("[!] O NOME NÃO POSSUI 'SILVA' [!]");
        }

        System.out.println("=-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-=");

        scanner.close();
    }
}