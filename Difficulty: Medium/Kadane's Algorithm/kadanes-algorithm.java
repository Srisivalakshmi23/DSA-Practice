class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int max = arr[0];
        int current = arr[0];
        for(int i = 1; i < arr.length; i++){
            current = Math.max(arr[i], current + arr[i]);
            max = Math.max(max, current);
        }
        return max;
    }
}
