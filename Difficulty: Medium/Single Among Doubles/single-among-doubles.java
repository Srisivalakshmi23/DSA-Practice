// User function Template for Java

class Sol {
    public static int search(int n, int arr[]) {
        // your code here
        int result = 0;
        for(int num : arr){
            result ^= num;
        }
        return result;
    }
}