import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Faça um programa que leia o comprimento do [cateto oposto] e do [cateto adjacente]
           de um triângulo retângulo. Calcule e mostre o comprimento da hipotenusa.

           : Teorema da Pitágoras: <a² = b² + c²> 
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("H I P O T E N U S A");
        System.out.println();

        System.out.print("[-] Cateto Oposto\nr: ");
        double c_opt = scanner.nextDouble();
        System.out.println();

        System.out.print("[-] Cateto Adjacente\nr: ");
        double c_adj = scanner.nextDouble();
        System.out.println();

        double raiz = (c_opt*c_opt) + (c_adj*c_adj);
        double hipotenusa = Math.sqrt(raiz);

        System.out.println("RESULTADO : Hipotenusa - " + hipotenusa);

        scanner.close();
    }
}
