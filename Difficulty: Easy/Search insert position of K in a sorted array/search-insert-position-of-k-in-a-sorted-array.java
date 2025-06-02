// User function Template for Java

class Solution {
    static int searchInsertK(int Arr[], int N, int k) {
        // code here
        N = Arr.length;
        int low = 0;
        int high = N - 1;
        int result = N;
        while(low <= high){
            int mid = (low + high) / 2;
            if(Arr[mid] >= k){
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}