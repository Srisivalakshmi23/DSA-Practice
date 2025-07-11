// User function Template for Java

class Solution {

    public int maxWater(int arr[]) {
        // Code Here
        int left = 0;
        int right = arr.length - 1;
        int maxArea = 0; 
        while (left < right) {
            int currentArea = Math.min(arr[left], arr[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea); 
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        } 
        return maxArea;
    }
}