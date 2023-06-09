package Exception_Handling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();
            System.out.println();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();
            System.out.println();

            int z = x / y;

            System.out.println("Result: " + z);
        }

        catch(ArithmeticException e){
            System.out.println("You can't divide by zero! IDIOT!!");
        }

        catch(InputMismatchException e){
            System.out.println("PLEASE ENTER A NUMBER OMFG!!!");
        }

        catch(Exception e){
            System.out.println(e);
        }

        finally{
            System.out.println("This will always print");
            scanner.close();
        }

    }
}
