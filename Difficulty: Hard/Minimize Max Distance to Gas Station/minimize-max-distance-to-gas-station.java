// User function Template for Java

class Solution {
    public static double findSmallestMaxDist(int stations[], int k) {
        // code here
        int n = stations.length;
        double left = 0.0;
        double right = stations[n - 1] - stations[0]; 
        double epsilon = 1e-6; 
        while (right - left > epsilon) {
            double mid = (left + right) / 2;
            if (isPossible(stations, k, mid)) {
                right = mid;
            } else {
                left = mid;
            }
        } 
        return Math.round(right * 100.0) / 100.0;
    } 
    private static boolean isPossible(int[] stations, int k, double maxDist) {
        int needed = 0; 
        for (int i = 1; i < stations.length; i++) {
            double dist = stations[i] - stations[i - 1];
            needed += (int)(dist / maxDist);
        } 
        return needed <= k;
    }
}

