class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        int low = 1;
        int high = getMax(arr);
        int result = high;
        while(low <= high){
            int mid = (low + high) / 2;
            if(canEatAll(arr, mid, k)){
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
    private boolean canEatAll(int[] arr, int s, int k){
        long totalHrs = 0;
        for(int pile : arr){
            totalHrs = totalHrs + (pile + (long)s - 1)/s;
        }
        return totalHrs <= k;
    }
    private int getMax(int[] arr){
        int max = 0;
        for(int pile : arr){
            max = Math.max(max,pile);
        }
        return max;
    }
}
