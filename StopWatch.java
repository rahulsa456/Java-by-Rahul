import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
    
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();
        boolean is_timmer_running=false;
        int time=0;
        int timer_reading=0;

        for (int i=0;i<n;i++){
            int time_stamp=s.nextInt();

            if(is_timmer_running){
            timer_reading=timer_reading+(time_stamp-time);
            }
            else {
            time=time_stamp;
            }
            is_timmer_running=! is_timmer_running;
        } 
        if (is_timmer_running){
            System.out.println("still running");
        
        }
        else{
            System.out.println(timer_reading);
        }
        
    }   
}
    

