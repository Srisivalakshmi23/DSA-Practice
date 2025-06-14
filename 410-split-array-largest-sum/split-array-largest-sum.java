class Solution {
    public int splitArray(int[] nums, int k) { 
        int max = 0, sum = 0; 
        for (int num : nums) {
            max = Math.max(max, num);
            sum += num;
        } 
        int left = max, right = sum;
        int answer = sum; 
        while (left <= right) {
            int mid = left + (right - left) / 2; 
            if (canSplit(nums, k, mid)) {
                answer = mid;
                right = mid - 1;  
            } else {
                left = mid + 1;  
            }
        } 
        return answer;
    } 
    private boolean canSplit(int[] nums, int k, int maxAllowedSum) {
        int currentSum = 0, parts = 1; 
        for (int num : nums) {
            if (currentSum + num > maxAllowedSum) {
                parts++;
                currentSum = num;
                if (parts > k) return false;
            } else {
                currentSum += num;
            }
        } 
        return true;
    }
}
