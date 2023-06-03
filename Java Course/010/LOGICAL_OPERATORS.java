import java.util.Scanner;

public class LOGICAL_OPERATORS {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("You're playing a game! Press q or Q to quit");
        String response = scanner.next();

        // && - (AND)
        // || - (OR)
        // !  - (NOT)

        if(!response.equals("q") && !response.equals("Q")){
            System.out.println("You're still playing the game *pew pew*");
        }

        else{
            System.out.println("You quit the game");
        }

        scanner.close();
    }
}
