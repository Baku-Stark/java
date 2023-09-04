import java.util.*;

public class Main{
	public static void main(String[] args){
		/*
			Melhore o jogo do DESAFIO 28 onde o computador vai “pensar” em um número 
			entre 0 e 10. Só que agora o jogador vai tentar adivinhar até acertar, mostrando no final 
			quantos palpites foram necessários para vencer.
		*/
		Scanner scanner = new Scanner(System.in);
		boolean while_cond = true;
		List<Integer> numbers = new ArrayList<Integer>();

		for (int i = 1;i < 11; i++) {
			numbers.add(i);
		}

		Collections.shuffle(numbers);
		int computer = numbers.get(0);
		// System.out.print(numbers.get(0));

		do{
			System.out.println("Escolha um número entre (0 até 10)");
			int player = scanner.nextInt();

			if(player < computer){
				System.out.println("O número é menor.");
			}

			else if(player > computer){
				System.out.println("O número é maior.");
			}

			else{
				System.out.println("=== VOCÊ ACERTOU! ===");
				while_cond = false;
			}

			System.out.println("\n");
		}while(while_cond);

		scanner.close();
	}
}