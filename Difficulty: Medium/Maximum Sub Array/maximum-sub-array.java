// User function Template for Java

class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        // code here
        int maxSum = -1;
        int maxStart = -1;
        int maxEnd = -1;
        int currentSum = 0;
        int currentStart = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                currentSum += arr[i];
                if (currentSum > maxSum || 
                   (currentSum == maxSum && (i - currentStart > maxEnd - maxStart))) {
                    maxSum = currentSum;
                    maxStart = currentStart;
                    maxEnd = i;
                }
            } else {
                currentSum = 0;
                currentStart = i + 1;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        if (maxStart == -1) {
            result.add(-1);
            return result;
        }
        for (int i = maxStart; i <= maxEnd; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}
