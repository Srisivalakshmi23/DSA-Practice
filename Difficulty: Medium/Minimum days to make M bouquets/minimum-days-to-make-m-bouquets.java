// User function Template for Java

class Solution {
    public static int minDaysBloom(int m, int k, int[] arr) {
        // code here
        long totalFlowersNeeded = (long) m * k;
        if (totalFlowersNeeded > arr.length) return -1;

        int low = 1;
        int high = getMax(arr);

        while (low < high) {
            int mid = (low + high) / 2;
            if (canMakeBouquets(arr, m, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int day : arr) {
            max = Math.max(max, day); 
        }
        return max;
    }

    private static boolean canMakeBouquets(int[] arr, int m, int k, int targetDay) {
        int bouquets = 0;
        int flowers = 0;

        for (int bloom : arr) {
            if (bloom <= targetDay) {
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
