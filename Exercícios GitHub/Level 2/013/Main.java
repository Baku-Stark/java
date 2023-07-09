public class Main{
	public static void main(String[] args){
		/*
			Faça um programa que calcule a soma entre todos os 
			números que são múltiplos de três e que se encontram no intervalo de 1 até 500.
		*/

		int allSum = 0;
		int count = 0;
		String space = " ";

		for (int i=0; i < 501; i++) {
			if(i % 3 == 0){
				count++;
				allSum += i;
				
				if(String.valueOf(count).length() == 1){
					System.out.printf("Count: " + count + "%3s | Sum: " + allSum + "\n", space);
				}

				else if(String.valueOf(count).length() == 2){
					System.out.printf("Count: " + count + "%2s | Sum: " + allSum + "\n", space);
				}

				else{
					System.out.printf("Count: " + count + "%1s | Sum: " + allSum + "\n", space);
				}
			}
		}

	}
}