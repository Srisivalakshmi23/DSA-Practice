// User function Template for Java

class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        int max = 0, sum = 0;
        for (int length : arr) {
            max = Math.max(max, length);
            sum += length;
        }
        int left = max, right = sum;
        int answer = sum;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canPaint(arr, k, mid)) {
                answer = mid;
                right = mid - 1; 
            } else {
                left = mid + 1;   
            }
        }
        return answer;
    }
    private boolean canPaint(int[] arr, int k, int maxTimeAllowed) {
        int painters = 1;
        int currentSum = 0;
        for (int length : arr) {
            if (currentSum + length > maxTimeAllowed) {
                painters++;
                currentSum = length;
                if (painters > k) return false;
            } else {
                currentSum += length;
            }
        }
        return true;
    }
}
