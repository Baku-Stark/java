import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
         * Crie um programa que leia o nome de uma cidade diga se 
            ela começa ou não com o nome “SANTO”.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da cidade\nr: ");
        String city = scanner.nextLine();
        System.out.println();

        System.out.println("=-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-=");
        String[] city_list = city.toUpperCase().split(" ");

        // System.out.println(city_list[0]);

        switch(city_list[0]){
            case "SANTO" : System.out.println("[-] A CIDADE TEM 'SANTOS' NO COMEÇO [-]");
            break;
        }
        
        System.out.println("=-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-=");

        scanner.close();
    }
}