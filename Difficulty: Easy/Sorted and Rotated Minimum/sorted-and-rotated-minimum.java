// User function Template for Java

class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        int low = 0;
        int high = arr.length - 1; 
        if (arr[low] <= arr[high]) {
            return arr[low];
        } 
        while (low < high) {
            int mid = low + (high - low) / 2; 
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } 
            else {
                high = mid;
            }
        } 
        return arr[low];
    }
}
