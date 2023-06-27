import java.util.*;

public class Main{
    public static void main(String[] args) {
        /*
         * Escreva um programa em Python que leia um número inteiro 
           qualquer e peça para o usuário escolher qual será a base de conversão:

            1 para binário; 
            2 para octal; 
            3 para hexadecimal.
        */

        Scanner scanner = new Scanner(System.in);
        Convert convert = new Convert();

        System.out.println("==============================");
        System.out.printf("%5s CONVERSÃO B.O.H\n", " ");
        System.out.printf("%3s [ 1 ] Binário\n", " ");
        System.out.printf("%3s [ 2 ] Octal\n", " ");
        System.out.printf("%3s [ 3 ] Hexadecimal\n", " ");
        System.out.println();

        System.out.print("Escolha uma das opções de conversão\nR: ");
        int choice = scanner.nextInt();
        System.out.println();

        System.out.print("Escolha um número\nR: ");
        int number = scanner.nextInt();
        System.out.println();
        System.out.println("==============================");

        System.out.println();

        switch (choice) {
            case 1:
                convert.conBin(number);
                break;

            case 2:
                convert.conOct(number);
                break;

            case 3:
                convert.conHex(number);
                break;
        
            default:
                System.out.println("[-] Nenhuma opção de conversão foi selecionada [-]");
                break;
        }

        scanner.close();
    }
}