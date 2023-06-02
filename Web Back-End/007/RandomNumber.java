import java.util.Random;

public class RandomNumber {
    public static void main(String[] args){
        Random random = new Random();

        int x = random.nextInt(6);
        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println("INT:> "+ x);
        System.out.println("DOUBLE:> " + y);
        System.out.println("BOOLEAN:> " + z);
    }
}