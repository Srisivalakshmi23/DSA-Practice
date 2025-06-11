class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = getMaxPile(piles);
        int result = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canFinish(piles, h, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
    private boolean canFinish(int[] piles, int h, int k) {
        long hoursNeeded = 0;
        for (int pile : piles) {
            hoursNeeded += (pile + (long)k - 1) / (long)k;
        }
        return hoursNeeded <= h;
    }
    private int getMaxPile(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }
}