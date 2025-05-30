class Solution {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0)
        return 0;
        int maxP = nums[0];
        int cMax = nums[0];
        int cMin = nums[0];
        for(int i = 1; i < nums.length; i++){
            int num = nums[i];
            if(num < 0){
                int temp = cMax;
                cMax = cMin;
                cMin = temp;
            }
            cMax = Math.max(num, cMax * num);
            cMin = Math.min(num, cMin * num);
            maxP = Math.max(maxP, cMax);
        }
        return maxP;
    }
}
