import java.util.*;
 
class GFG{
static int minDelete(int arr[], int n)
{
       HashMap<Integer, Integer> freq = new HashMap<>();
    for(int i = 0; i < n; i++)
        freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
 
    
    int max_freq = Integer.MIN_VALUE;
    for(Map.Entry<Integer,
                  Integer> entry : freq.entrySet())
        max_freq = Math.max(max_freq,
                            entry.getValue());
 
   
    return n - max_freq ;
}
 

public static void main(String[] args)
{
    int arr[] = { 4, 3, 4, 4, 2, 4 };
    int n = arr.length;
     
    System.out.print(minDelete(arr, n));
}
}