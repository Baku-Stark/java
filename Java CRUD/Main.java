import java.io.*;
import java.io.IOException;

public class Main{
	public static void main(String[] args){
		try{
			// reading a file [db.txt]
			FileReader reader = new FileReader("db.txt");

			int data = reader.read();

            while(data != -1){
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
		}
		catch(IOException error){
			error.printStackTrace();
		}
	}
}