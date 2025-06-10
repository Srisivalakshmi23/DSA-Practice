class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long totalFlowersNeeded = (long) m * k;
        if (totalFlowersNeeded > bloomDay.length) return -1;
        int low = 1;
        int high = getMax(bloomDay);
        while (low < high) {
            int mid = (low + high) / 2;
            if (canMakeBouquets(bloomDay, m, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    private static int getMax(int[] bloomDay) {
        int max = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            max = Math.max(max, day);
        }
        return max;
    }
    private static boolean canMakeBouquets(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0;
        int flowers = 0;
        for (int bloom : bloomDay) {
            if (bloom <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }
        return bouquets >= m;
    }
}