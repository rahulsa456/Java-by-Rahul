/*
you are given 2 strings. Find the longerst common substring.
abcdaababacd
ababbababaab

*/
public class newProblem {
    int solve (int A[], int i, int j, int x){
        if (i>j){
            return -1;

        }
        int mid =(i+j)/2;
        if (A[mid]==x){
            return mid;
        } else if (A[mid]>x){
            return solve (A,i,mid-1,x);
        } else {
            return solve(A, mid+1, j, x);
        }
    }
    public int search (int[]nums, int integer){
        return solve(nums, 0, nums.length-1, target);
    }
}
