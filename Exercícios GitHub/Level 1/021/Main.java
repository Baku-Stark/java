import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
         * Faça um programa que leia uma frase pelo teclado e 
            mostre quantas vezes aparece a letra “A”, em que posição ela aparece a
            primeira vez e em que posição ela aparece a última vez.

                - #Quantas vezes aparece a letra "A" 
                - #Em que posição ele aparece pela primeira vez 
                - #Em que posição ele aparece pela última vez 
        */
        Word word = new Word();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase\nr: ");
        String userWord = scanner.nextLine();
        userWord = userWord.toUpperCase();
        System.out.println();

        System.out.println("=-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-=");
        System.out.println("Quantas vezes que a letra 'A' aparece        : " + word.countA(userWord));
        System.out.println();

        System.out.println("Em que posi\u00E7\u00E3o ele aparece pela primeira vez : " + word.firstA(userWord));
        System.out.println();
        
        System.out.println("Em que posi\u00E7\u00E3o ele aparece pela \u00FAltima vez   : " + word.lastA(userWord));
        System.out.println("=-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-=");

        scanner.close();
    }
}

class Word{
    public int countA(String userWord){
        int count_a = 0;

        for(int i = 0; i < userWord.length(); i++){
            switch(userWord.charAt(i)){
                case 'A' : count_a++;
                break;
            }
        }

        return count_a;
    }

    public int firstA(String userWord){
        return userWord.indexOf("A") + 1;
    }

    public int lastA(String userWord){
        return userWord.lastIndexOf("A") + 1;
    }
}