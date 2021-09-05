import java.util.Scanner;

public class assending {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int in=0;
        int dec=0;
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.next();
        }

        for (int i=0;i<n-1;i++){
            if (arr[i].compareTo(arr[i+1])<0){
                in++;
            }
            if (arr[i].compareTo(arr[i+1])>0){
                dec++;
            }

        }
        if (in>0 || dec==0){
            System.out.println("Increasing");
        }
        else if (dec>0||in==0){
            System.out.println("Increasing");
        }
        else{
            System.out.println("Neither");
        }
    
    }
}    