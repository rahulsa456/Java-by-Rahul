import java.util.*;
import java.util.Scanner;
public class factorial {
    

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int num = s.nextInt();
        int num1=s.nextInt();
        int a = Math.min(num, num1);
        long factorial = 1;

        for(int i = 1; i <= a; ++i)
        {
            
            factorial *= i;
        }
        System.out.println(factorial);
        

        
    }
}