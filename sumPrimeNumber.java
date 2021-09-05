import java.util.Scanner;
public class sumPrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=sc.nextInt();
        int sum=0;
        for (int i=0;i<n-1;i++){
            for (int j=2;j<i-1;j++){
                if (i%j==0){
                    sum=sum+i;
                }

            }System.out.println("The sum of " +n+ " numbrer is: "+sum);

        }
                
    }
}
