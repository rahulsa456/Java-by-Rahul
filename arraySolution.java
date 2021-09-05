import java.util.Scanner;
public class arraySolution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= s.nextInt();
        }
        for (int i=0;i<=n-1;i++){
            
            if (i%2==0){
                System.out.print(arr[i/2]+" ");
            
            }
            if (i%2!=0){
                System.out.print(arr[n-1-i/2]+" ");
            }
            
        }
        


    }
}
