import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
         * Faça um programa que leia o nome completo de uma pessoa, 
           mostrando em seguida o primeiro e o último nome separadamente.
        */
        Word word = new Word();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome completo\nr: ");
        String name = scanner.nextLine();
        System.out.println();

        System.out.println("=-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-=");
        System.out.println("PRIMEIRO NOME : " + word.firstName(name.split(" ")));
        System.out.println();

        System.out.println("ÚLTIMO NOME   : " + word.lastName(name.split(" ")));
        System.out.println("=-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-=");

        scanner.close();
    }
}

class Word{
    public String firstName(String[] name_list){
        return name_list[0];
    }

    public String lastName(String[] name_list){
        return name_list[name_list.length-1];
    }
}