import java.util.Scanner;
class PrimeNumber{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if (a%1==0){
            if (a%a==0){
            System.out.println(a+"   The number you entered is a Prime Number!!");
            }
        }
        
    }
}