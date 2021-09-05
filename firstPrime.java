import java.util.*;
class firstPrime{

        static void sieve(boolean prime[])
        {
        // Set all numbers as
        // prime initially
        for (int i = 0; i < 1000000; i++)
        {
            prime[i] = true;
        }
        
        // Mark 0 and 1 as non-prime
        prime[0] = prime[1] = false;
        
        for (int i = 2; i * i <= 1000000; i++)
        {
            // If current element is prime
            if (prime[i])
            {
            // Mark all its multiples
            // as non-prime
            for (int j = i * i; j < 1000000; j += i)
            {
                prime[j] = false;
            }
            }
        }
        }
        
        // Function to print the subarray
        // whose sum of elements is prime
        static void firstElementPrime(int N, int K, int arr[],boolean prime[])
        {
        
        for (int i = 0; i < K; i++)
        {
            if (prime[arr[i]]){
                System.out.print(arr[i]+" ");
            }
            else{
                System.out.println("0 ");
            }
        } 
        
        
        int st = 1, en = K;
        
        while (en < N)
        {
            for (int i = st; i <= en; i++)
            {
                if (prime[arr[i]]){
                    System.out.print(arr[i]+" ");
                }
                else{
                    System.out.println("0 ");
                }
            }
            return;
            }
            en++;
            st++;
        }
    
    
    // Driver Code
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int K=s.nextInt();
        int arr[]=new int[N];
        for (int i=0;i<N;i++){
            arr[i]=s.nextInt();
    
        }
        boolean []prime = new boolean[1000000];
        sieve(prime);
        firstElementPrime(N, K, arr, prime);
    }
}