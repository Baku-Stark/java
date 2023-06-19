import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Faça um programa que leia um número inteiro e mostre na tela seu sucessor e seu antecessor.
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um número\nr: ");
        int num = scanner.nextInt();
        System.out.println("------------------------------");
        System.out.println("Sucessor   : " + (num+1));
        System.out.println("Antecessor : " + (num-1));
        System.out.println("------------------------------");

        scanner.close();
    }
}