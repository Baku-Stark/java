import java.util.ArrayList;

public class For_Each_Loop {
    public static void main(String[] args){
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for(String i : animals){
            System.out.println(i);
        }
    }
}
