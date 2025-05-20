class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long totalSum = (long) n * (n + 1) / 2;
        long actualSum = 0;
        for(int num : nums){
            actualSum += num;
        }
        return (int)(totalSum - actualSum);


        //  int xor = 0;
        // int n = nums.length;
        // for (int i = 0; i < n; i++) {
        //     xor ^= i ^ nums[i];
        // }
        // xor ^= n; 
        // return xor;

    }
}