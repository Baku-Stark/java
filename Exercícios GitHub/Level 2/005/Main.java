import java.util.*;

public class Main{
    public static void main(String[] args) {
        /*
         * Crie um programa que leia duas notas de um aluno e 
          calcule sua média, mostrando uma mensagem no final, de acordo com a média 
          atingida:

            – Média abaixo de 5.0: REPROVADO

            – Média entre 5.0 e 6.9: RECUPERAÇÃO

            – Média 7.0 ou superior: APROVADO
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.printf("%4s BOLTEIM ESCOLAR\n", " ");

        System.out.println();

        System.out.print("1° Bimestre\nR: ");
        float bim_1 = scanner.nextFloat();
        System.out.println();
        System.out.print("2° Bimestre\nR: ");
        float bim_2 = scanner.nextFloat();

        float semestre_1 = bim_1 + bim_2;
        System.out.println("==============================");

        System.out.println();

        if(semestre_1 < 5.0){
            System.out.println("[!] ALUNO REPROVADO [!]");
        }

        else if(semestre_1 >= 5.0 && semestre_1 <= 6.9){
            System.out.println("[&] RECUPERAÇÃO [&]");
        }

        else{
            System.out.println("[-] O ALUNO ESTÁ APROVADO [-]");
        }

        scanner.close();
    }
}