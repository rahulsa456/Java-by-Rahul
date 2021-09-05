import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class problem {

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        int s=scan.nextInt();
        int ar[]=new int[s];
        
        for(int i=0;i<s;i++)
        {
            ar[i]=scan.nextInt();
        }
        int a=scan.nextInt();
        int temp=0;
        for (int i=0;i<ar.length;i++){
            if (a!=ar[i]){
                temp=-1;
            } 
            
        } System.out.println(temp);
    }
}