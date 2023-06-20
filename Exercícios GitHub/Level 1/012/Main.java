import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Escreva um programa que pergunte a quantidade de Km percorridos por um 
           carro alugado e a quantidade de dias pelos quais ele foi alugado. 
           Calcule o preço a pagar, sabendo que o carro custa R$60 por dia e 
           R$0,15 por Km rodado.

            1 dia = R$60,00
            1 km = R$0,15
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos dias utilizou o ve\u00EDculo?\nr: ");
        double dias = scanner.nextDouble();
        System.out.println("");

        System.out.print("Quantidade de KM percorridos\nr: ");
        double km = scanner.nextDouble();
        System.out.println("");

        System.out.println("--------------------");
        System.out.println("P A G A M E N T O");
        System.out.println("");
        dias *= 60;
        System.out.printf("Aluguel a pagar (Dias) : R$%.2f\n", dias);

        km *= 0.15;
        System.out.printf("KM rodados :             R$%.2f\n", km);
        System.out.println("--------------------");
        System.out.printf("TOTAL :                  R$%.2f\n", km + dias);

        scanner.close();
    }
}
