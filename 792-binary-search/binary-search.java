public class Solution {
    public static int search(int[] nums, int low, int high, int target) {
        if (low > high) 
        return -1;
        int mid = (low + high) / 2;
        if (nums[mid] == target) 
        return mid;
        else if (target > nums[mid])
            return search(nums, mid + 1, high, target);
        return search(nums, low, mid - 1, target);
    }
    public static int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }
}

// class Solution {
//     public int search(int[] nums, int target) {
//         int n = nums.length;
//         int low = 0;
//         int high = n - 1;
//         while(low <= high){
//             int mid = (low + high) / 2;
//             if(nums[mid] == target){
//                 return mid;
//             } else if (target > nums[mid]){
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return -1;
//     }
// }
