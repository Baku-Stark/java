import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
         * Faça um programa que leia um número de 0 a 9999 e 
            mostre na tela cada um dos dígitos separados.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha um número\nr: ");
        String number = scanner.nextLine();
        System.out.println();

        System.out.println("=-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-=");
        String[] number_list = number.split("", 4);
        
        if(number.length() == 4){
            System.out.println("[!] MILHAR   : " + number_list[0]);
            System.out.println("[!] CENTENA  : " + number_list[1]);
            System.out.println("[!] DEZENA   : " + number_list[2]);
            System.out.println("[!] UNIDADE  : " + number_list[3]);
        }

        else if(number.length() == 3){
            System.out.println("[!] CENTENA  : " + number_list[0]);
            System.out.println("[!] DEZENA   : " + number_list[1]);
            System.out.println("[!] UNIDADE  : " + number_list[2]);
        }

        else if(number.length() == 2){
            System.out.println("[!] DEZENA   : " + number_list[0]);
            System.out.println("[!] UNIDADE  : " + number_list[1]);
        }

        else{
            System.out.println("[!] UNIDADE  : " + number_list[0]);
        }
        System.out.println("=-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-=");

        scanner.close();
    }
}