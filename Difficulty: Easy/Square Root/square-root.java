/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    int floorSqrt(int n) {
        // Your code here
        int low = 1;
        int high = n;
        int result = 0;
        while(low <= high){
            int mid = (low + high)/2;
            if(mid <= n/mid){
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if(n == 0 || n == 1){
            return n;
        }
        return result;
    }
}