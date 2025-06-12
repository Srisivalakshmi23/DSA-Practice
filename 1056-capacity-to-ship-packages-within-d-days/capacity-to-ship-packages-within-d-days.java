class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int w : weights){
            low = Math.max(low, w);
            high = high + w;
        }
        while(low < high){
            int mid =  (low + high) / 2;
            if(canShip(weights, days, mid)){
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    private static boolean canShip(int[] weights, int days, int capacity){
        int dayCount = 1;
        int currentWeight = 0;
        for(int w : weights){
            if(currentWeight + w > capacity){
                dayCount++;
                currentWeight = 0;
            }
            currentWeight += w;
        }
        return dayCount <= days;
    }
}
