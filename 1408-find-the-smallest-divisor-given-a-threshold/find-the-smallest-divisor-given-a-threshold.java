class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = getMax(nums);
        int result = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int sum = getSum(nums, mid);
            if (sum <= threshold) {
                result = mid; 
                right = mid - 1;
            } else {
                left = mid + 1; 
            }
        }
        return result;
    }
    private static int getMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }
    private static int getSum(int[] nums, int divisor) {
        int total = 0;
        for (int num : nums) {
            total += (num + divisor - 1) / divisor;
        }
        return total;
    }
}