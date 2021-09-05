import java.util.Scanner;

class hrecurs {

    //static int sumOfArray(int arr[], int index){
     //   if(index==arr.length){
       //     return 0;
        //}
        //int sum=arr[0]+sumOfArray(arr,index+1);
        //return sum;
    //}

    static int solve(int arr[], int index){
        if (index==0){
         return arr[index];

        }
        int sum=arr[index]+ solve(arr,index-1);
        return sum;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt(), a=0;
        while (t>0){
            t--;    
            int n=s.nextInt();
            a++;
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                 arr[i]=s.nextInt();
            }
            //int sum=sumOfArray(arr, 0);
            int sum2=solve(arr, n-1);
           // System.out.println("Case "+a+": "+sum);
            System.out.println("Case "+a+": "+sum2);

        }
        
    }
    
}
