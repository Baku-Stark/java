import java.util.Arrays;
import java.util.Random;

/**
 * Implemente uma programa que ordene de forma crescente um array unidimensional
 *
 * ex. []array = {10, -1 , 2, 7}
 * []array = {-1, 2, 7, 10}
 */
public class OrdenarNumerosEmArray {

    public static void main(String[] args) {

        int []array = new int[10];

        preencherArray(array);
        ordenarCrescenteArray(array);
        mostrarArray(array);
    }
    static void preencherArray(int []arr){
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(-10, 11);
        }
    }

    static void ordenarCrescenteArray(int []arr){
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int aux = arr[i];
                    System.out.println(aux);

                    arr[i] = arr[j]; // INSERIR O NÚMERO MENOR ANTES
                    arr[j] = aux; // INSERIR O NÚMERO MAIOR DEPOIS
                }
            }
        }

        //System.out.println(Arrays.toString(arr));
    }

    static void mostrarArray(int []arr){
        System.out.println(Arrays.toString(arr));
    }
}