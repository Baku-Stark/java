import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Faça um programa que leia um ângulo qualquer e mostre na 
           tela o valor do "seno", "cosseno" e "tangente" desse ângulo. 
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("\u00C2ngulo\nr: ");
        double angulo = scanner.nextDouble();
        System.out.println();

        double seno = Math.sin(Math.toRadians(angulo));
        double cosseno = Math.cos(Math.toRadians(angulo));
        double tangente = Math.tan(Math.toRadians(angulo));

        System.out.println("[-] SENO     : " + seno);
        System.out.println("[-] COSSENO  : " + cosseno);
        System.out.println("[-] TANGENTE : " + tangente);

        scanner.close();
    }
}
