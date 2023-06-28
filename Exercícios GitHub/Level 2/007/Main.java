import java.util.*;

public class Main{
    public static void main(String[] args) {
        /*
         * Refaça o DESAFIO 35 dos triângulos, 
           acrescentando o recurso de mostrar que tipo de triângulo será formado:

            – EQUILÁTERO: todos os lados iguais

            – ISÓSCELES: dois lados iguais, um diferente

            – ESCALENO: todos os lados diferentes

        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.print("1° Lado do Triângulo\nR: ");
        float ladoA = scanner.nextFloat();
        System.out.println();

        System.out.print("2° Lado do Triângulo\nR: ");
        float ladoB = scanner.nextFloat();
        System.out.println();

        System.out.print("3° Lado do Triângulo\nR: ");
        float ladoC = scanner.nextFloat();
        System.out.println("==============================");

        System.out.println();

        if(ladoA == ladoB && ladoA == ladoC){
            System.out.println("[-] TRIÂNGULO EQUIL\u00C1TERO [-]");
        }

        else if(ladoA == ladoB || ladoA == ladoC){
            System.out.println("[-] TRIÂNGULO IS\u00D3SCELES [-]");
        }

        else{
            System.out.println("[-] TRIÂNGULO ESCALENO [-]");
        }

        scanner.close();
    }
}