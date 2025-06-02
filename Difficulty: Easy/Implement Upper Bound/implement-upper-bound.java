class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int result = n;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] <= target){
                low = mid + 1;
            } else {
                result = mid;
                high = mid - 1;
            }
        }
        return result;
    }
}


