import java.util.Scanner;

public class Nested_Loops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";
        String line = "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=";

        System.out.println(line);
        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("\n");

        System.out.println("Enter # of cols: ");
        columns = scanner.nextInt();
        System.out.println("\n");

        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        System.out.println(line);
        System.out.println("\n");

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=columns; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();
    }
}
