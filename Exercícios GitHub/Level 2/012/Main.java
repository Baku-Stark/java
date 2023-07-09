public class Main{
	public static void main(String[] args){
		/*
			Crie um programa que mostre na tela todos os números 
			pares que estão no intervalo entre 1 e 50.
		*/

		for(int i=1; i < 51; i++){
			if(i % 2 == 0){
				System.out.println(i);
			}
		}
	}
}