// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int n = nums.length;
//         int low = 0;
//         int high = n - 1;
//         int result = n;
//         while(low <= high){
//             int mid = (low + high) / 2;
//             if(nums[mid] >= target){
//                 result = mid;
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         return result;
//     }
// }

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = findBound(nums, target, true);   
        result[1] = findBound(nums, target, false); 
        return result;
    }
    private int findBound(int[] nums, int target, boolean isFirst) {
        int low = 0;
        int high = nums.length - 1;
        int bound = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                bound = mid;
                if (isFirst) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return bound;
    }
}

