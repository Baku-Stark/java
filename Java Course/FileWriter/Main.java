package FileWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are\nViolets are blue\nBooty booty booty\n");
            
            writer.append("\n(A poem by Bro)");
            writer.close();
        }

        catch(IOException e){
            e.printStackTrace();
        }
    }
}
