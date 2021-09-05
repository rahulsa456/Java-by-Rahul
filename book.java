import java.util.Scanner;

public class book {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        long b=s.nextInt();
        int temp=0;
        int arr[]=new int[a];
        for (int i=0;i<=a;i++){
            arr[i]=s.nextInt();
        }
        for (int i=0;i<=a;i++){
            if (arr[i]>=b){
                temp+=arr[i];
                if (temp==b){

                }


            }
        }

    }
    
}
