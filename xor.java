import java.util.Scanner;
public class xor {
    public static void main(String args[]){
       int a,b;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a value :");
       a = sc.nextInt();
       System.out.println("Enter b value :");
       b = sc.nextInt();
       a = a^b;
       System.out.println("Value of the variable a after swapping : "+a);
       
    }
 }