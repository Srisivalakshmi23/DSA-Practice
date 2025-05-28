class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        if (n < 4) 
        return result;
        Arrays.sort(nums);
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) 
            continue;
            long min = (long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3];
            if (min > target) 
            break;
            long max = (long) nums[i] + nums[n - 1] + nums[n - 2] + nums[n - 3];
            if (max < target) 
            continue;
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) 
                continue;
                long jMin = (long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2];
                if (jMin > target) 
                break;
                long jMax = (long) nums[i] + nums[j] + nums[n - 1] + nums[n - 2];
                if (jMax < target) 
                continue;
                int left = j + 1, right = n - 1;
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
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
