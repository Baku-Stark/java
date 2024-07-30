import java.util.Arrays;
import java.util.Random;

/**
 * <h1>Tabuada</h1>
 *  Fazer uma tabuada com matriz
 *
 * @author : Wallace
 */
public class TabuadaMatriz {
    public static void main(String[] args) {
        Random rnd = new Random();
        int n = rnd.nextInt(1, 11);

        int[][] tabuada = new int[10][3];

        preencherTabuada(n, tabuada);
        mostrarTabuada(tabuada);
    }

    static void preencherTabuada(int n, int[][] tabuada){
        // PRIMEIRA FORMA
        for (int i = 0; i < tabuada.length; i++) {
            for (int j = 0; j < tabuada[i].length; j++) {
                tabuada[i][j] = (j == 0) ? n : (j == 1) ? i + 1 : n * (i + 1);
            }

        }

        // SEGUNDA FORMA
        for (int i = 0; i < tabuada.length; i++) {
            tabuada[i][0] = i;
            tabuada[i][1] = i + 1;
            tabuada[i][2] = i * (i + 1);
        }

    }

    static void mostrarTabuada(int[][] tabuada){
        for (int[] fila: tabuada) {
            System.out.println(Arrays.toString(fila));
        }
    }
}
