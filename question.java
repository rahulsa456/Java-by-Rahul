import java.util.Scanner;
public class question {
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to check wether the number is Armstrong number or not ");
        int number=s.nextInt(), originalNum, reminder, result=0;
            
        originalNum=number;
        
        while (originalNum!=0){
            reminder=originalNum%10;
            result+=Math.pow(reminder, 3);
            originalNum/=10;
        }
        if (result==number){
            System.out.println("The number "+number+" is a Armstrong Number");
        }
        else{
            System.out.println("The Number "+number+" is not a Armstrong Number"); 
        }
    }

    
}
