import java.util.*;

public class Main{
    public static void main(String[] args) {
        /*
         * Escreva um programa para aprovar o empréstimo 
           bancário para a compra de uma casa. Pergunte o valor da casa, o salário do 
           comprador e em quantos anos ele vai pagar. A prestação mensal não pode exceder 
           30% do salário ou então o empréstimo será negado.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.printf("%3s BANCO BAKATSU\n", " ");
        System.out.println();

        System.out.print("Valor da residência\nR$");
        double home_value = scanner.nextDouble();
        System.out.println();

        System.out.print("Qual o seu salário?\nR$");
        double salario = scanner.nextDouble();
        System.out.println();

        System.out.print("Quantos anos pretende realizar o pagamento?\nR: ");
        int anos = scanner.nextInt();
        System.out.println("==============================");

        System.out.println();

        double PRESTACAO = home_value / (anos * 12);
        double PERCENT = salario * 30 / 100;

        if(PRESTACAO > PERCENT){
            System.out.println("[!] INFELIZMENTE NÃO SERÁ POSSÍVEL FAZER O EMPRÉSTIMO... [!]");
        }

        else{
            System.out.println("[-] EMPRÉSTIMO REALIZADO COM SUCESSO! [-]");
            System.out.printf("PRESTAÇÃO : R$%.2f", PRESTACAO);
        }

        scanner.close();
    }
}