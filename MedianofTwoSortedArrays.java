public class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
        int total = A.length + B.length;
        if(total%2==1)
            return helper(A,0, A.length , B, 0, B.length , total/2 +1);
        else
            return (helper(A,0, A.length , B, 0, B.length , total/2   ) +
                   helper(A,0, A.length , B, 0, B.length , total/2 +1)) /2.0;    

    }
    
    public double helper(int A[], int a, int m, int B[], int b, int n, int findIndex){
        if(m > n)
            return helper(B, b, n, A, a, m, findIndex );
        if(m == 0)
            return B[findIndex-1];
        if( findIndex == 1)
            return Math.min(A[a],B[b]);
        int curr_a = Math.min( findIndex / 2, m );
        int curr_b = findIndex - curr_a;
        if( A[a + curr_a-1] < B[b + curr_b-1])
            return helper(A, a+ curr_a, m - curr_a, B, b, n, findIndex - curr_a);
        else if( A[a + curr_a-1] > B[b + curr_b-1] )
            return helper(A, a, m, B, b + curr_b, n - curr_b, findIndex - curr_b);
        else 
            return A[a + curr_a-1];
    }
}