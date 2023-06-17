package Timer_Task;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            
            int counter = 10;
            @Override
            public void run(){
                if(counter > 0){
                    System.out.println(counter + " secondes");
                    counter --;
                }

                else{
                    System.out.println("HAPPY NEW YEAR!");
                    timer.cancel();
                }
            }
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2020);
        date.set(Calendar.HOUR_OF_DAY, 31);
        date.set(Calendar.HOUR, 23);
        date.set(Calendar.MINUTE, 59);
        date.set(Calendar.SECOND, 50);
        date.set(Calendar.MILLISECOND, 0);

        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
