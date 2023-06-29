import java.util.*;

public class Main{
    public static void main(String[] args) {
        /*
         * Crie um programa que faça o computador jogar Jokenpô 
           com você.
        */

        Scanner scanner = new Scanner(System.in);
        List<String> opcao_list = new ArrayList<String>();

        System.out.println("==============================");
        System.out.println("JOKENPO GAME !!!");
        System.out.println();

        opcao_list.add("PEDRA");
        opcao_list.add("PAPEL");
        opcao_list.add("TESOURA");
        Collections.shuffle(opcao_list);
        String computer = opcao_list.get(0);
        System.out.println("- O COMPUTADOR JÁ FEZ A ESCOLHA!");
        System.out.println();

        System.out.println("[1] - PEDRA\n[2] - PAPEL\n[3] - TESOURA");
        System.out.print("FAÇA SUA ESCOLHA, JOGADOR!\nR: ");
        int opcao = scanner.nextInt();

        String user_opcao;

        switch(opcao){
            case 1 : user_opcao = "PEDRA";
                break;

            case 2 : user_opcao = "PAPEL";
                break;

            case 3 : user_opcao = "TESOURA";
                break;

            default : user_opcao = "PEDRA";
                break;
        }
        System.out.println("==============================");
        System.out.println("JOGADOR    : "  + user_opcao);
        System.out.println("COMPUTADOR : "  + computer);
    
        System.out.println();

        if(user_opcao == "PEDRA" && computer == "TESOURA"){
            System.out.println("O JOGADOR VENCEU!!!");
        }
        else if(user_opcao == "PAPEL" && computer == "PEDRA"){
            System.out.println("O JOGADOR VENCEU!!!");
        }
        else if(user_opcao == "TESOURA" && computer == "PAPEL"){
            System.out.println("O JOGADOR VENCEU!!!");
        }

        else if(user_opcao == computer){
            System.out.println("[-] EMPATE!!! [-]");
        }

        else{
            System.out.println("O COMPUTADOR VENCEU!!!");
        }

        scanner.close();
    }
}