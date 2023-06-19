import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Crie um algoritmo que leia um número e mostre seu dobro, triplo e raiz quadrada.
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha um número\nr: ");
        int num = scanner.nextInt();
        System.out.println("------------------------------");
        System.out.println("Dobro          : " + (num*2));
        System.out.println("Triplo         : " + (num*3));
        System.out.println("Raiz Quadrada  : " + (num*num));
        System.out.println("------------------------------");

        scanner.close();
    }
}