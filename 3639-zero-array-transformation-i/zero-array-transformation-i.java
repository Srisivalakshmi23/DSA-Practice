class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n + 1];
        for(int[] query : queries){
            int l = query[0], r = query[1];
            diff[l]++;
            if(r + 1 < n)
            diff[r + 1]--;
        }
        int[] cover = new int[n];
        cover[0] = diff[0];
        for(int i = 1; i < n; i++){
            cover[i] = cover[i - 1] + diff[i];
        }
        for(int i = 0; i < n; i++){
            if(nums[i] > cover[i])
            return false;
        }
        return true;
    }
}
