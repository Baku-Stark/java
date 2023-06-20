import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
         * Um professor quer sortear um dos seus quatro alunos para 
           apagar o quadro. Faça um programa que ajude ele, lendo
           o nome dos alunos e escrevendo na tela o nome do escolhido.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("[-] SORTEIO DE ALUNOS [-]");
        System.out.println();

        List<String> alunos = new ArrayList<String>();

        for(int i = 0; i < 4; i++){
            System.out.print("Registre o(a) " + (i+1) + "\u00B0 aluno(a)\nr: ");
            String aluno = scanner.nextLine();

            // adicionando item na lista
            alunos.add(aluno);
            System.out.println();
        }

        // System.out.println("Lista de alunos : " + Arrays.toString(alunos));

        // sortear os alunos no array []
        Collections.shuffle(alunos);
        System.out.println("[!] ALUNO SELECIONADO : " + alunos.get(0));

        scanner.close();
    }
}
