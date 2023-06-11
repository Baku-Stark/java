package Audio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Main {
    public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException{
        
        try {
            Scanner scanner = new Scanner(System.in);
            
            File file = new File("Satoru-Gojo-_Jujutsu-Kaisen_-Infinito-M4rkim.wav");

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while(!response.equals("Q")){

                System.out.println("P = Play | S = Stop | R = Reset | Q = Quit");
                System.out.print("Enter your choice: ");

                response = scanner.next();
                response = response.toUpperCase();
                System.out.println();
                switch(response){
                    case ("P") : clip.start();
                    break;

                    case ("S") : clip.stop();
                    break;

                    case ("R") : clip.setMicrosecondPosition(0);
                    break;

                    case ("Q") : clip.close();
                    break;
                    default: System.out.println("Not a valid response");
                }
            }
            scanner.close();
        }
        
        catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        }

        catch (IOException e) {
            e.printStackTrace();
        }
        
        finally{
            System.out.println("BYEEE!!!");
        }
    }
}