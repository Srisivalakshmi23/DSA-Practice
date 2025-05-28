// User function Template for Java

// arr[] : int input array of integers
// target : the quadruple sum required

class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        // code here
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        if (n < 4) 
        return result;
        Arrays.sort(arr);
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) 
            continue;
            long min = (long) arr[i] + arr[i + 1] + arr[i + 2] + arr[i + 3];
            if (min > target) 
            break;
            long max = (long) arr[i] + arr[n - 1] + arr[n - 2] + arr[n - 3];
            if (max < target) 
            continue;
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) 
                continue;
                long jMin = (long) arr[i] + arr[j] + arr[j + 1] + arr[j + 2];
                if (jMin > target) 
                break;
                long jMax = (long) arr[i] + arr[j] + arr[n - 1] + arr[n - 2];
                if (jMax < target) 
                continue;
                int left = j + 1, right = n - 1;
                while (left < right) {
                    long sum = (long) arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum == target) {
                        result.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));
                        while (left < right && arr[left] == arr[left + 1]) left++;
                        while (left < right && arr[right] == arr[right - 1]) right--;
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
