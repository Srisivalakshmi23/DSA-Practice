//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ob.printTillN(N);
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution {
    static void printTillN(int N) {
        // code here
        print(1, N);
    }
    static void print(int current, int N){
        if(current > N){
            return;
        }
        System.out.print(current);
        if(current < N){
            System.out.print(" ");
        }
        print(current + 1, N);
    }
}