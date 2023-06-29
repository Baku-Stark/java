import java.util.*;

public class Main{
    public static void main(String[] args) {
        /*
         * Elabore um programa que calcule o valor a ser pago por um 
           produto, considerando o seu preço normal e condição de pagamento:

            – à vista dinheiro/cheque: 10% de desconto

            – à vista no cartão: 5% de desconto

            – em até 2x no cartão: preço formal 

            – 3x ou mais no cartão: 20% de juros
        */

        Scanner scanner = new Scanner(System.in);
        Pagamento pagamento = new Pagamento();

        System.out.println("==============================");
        System.out.print("Preço do produto\nR$");
        double preco = scanner.nextDouble();
        scanner.nextLine();
        System.out.println();

        System.out.print("Maneira de pagamento \n[ 1 ] - Cartão\n[ 2 ] - Dinheiro/Cheque\nR: ");
        String opcao = scanner.nextLine();
        System.out.println();

        System.out.println("==============================");
    
        System.out.println();

        switch (opcao) {
            case "1": pagamento.pagamento_cartao(preco);
                break;

            case "2": pagamento.pagamento_dinheiro(preco);
                break;
        
            default: System.out.println("[!] NENHUMA FORMA DE PAGAMENTO FOI SELECIONADA [!]");
                break;
        }

        scanner.close();
    }
}

class Pagamento{
    Scanner scanner = new Scanner(System.in);

    public void pagamento_cartao(double preco){
        System.out.println("[-] FORMA DE PAGAMENTO - CARTÃO [-]");
        System.out.println();

        System.out.print("Parcelamento -> [ 1 ] 2x | [ 2 ] 3x\nR: ");
        int parcela = scanner.nextInt();
        System.out.println();

        if(parcela == 1){
            System.out.println("[-] 2X [-]");
            System.out.printf("PREÇO : R$%.2f", (preco / 2));
        }

        else if(parcela == 2){
            System.out.println("[-] 3X + 20% de JUROS [-]");
            System.out.printf("PREÇO : R$%.2f", (preco / 3 + (preco * 20 / 100)));
        }

        else{
            System.out.println("[!] NENHUM TIPO DE PARCELA FOI SELECIONADA [!]");
            System.out.println("\u00E0 vista no cart\u00E3o: 5% de desconto");
            System.out.println();
            System.out.printf("PREÇO : R$%.2f", (preco - (preco * 5 / 100)));
        }
    }

    public void pagamento_dinheiro(double preco){
        System.out.println("[-] FORMA DE PAGAMENTO - DINHEIRO / CHEQUE [-]");
        System.out.println("\u00E0 vista dinheiro/cheque: 10% de desconto");
        System.out.println();
        System.out.printf("PREÇO : R$%.2f", (preco - (preco * 10 / 100)));
    }
}