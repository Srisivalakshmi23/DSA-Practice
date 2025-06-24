class Solution{
    public int[] sortArray(int[] nums){
        Arrays.sort(nums);
        return nums;
    }
}

// class Solution {
//     public int[] sortArray(int[] nums) {
//         // Arrays.sort(nums);
//         // return nums;
//         for(int i = 1; i < nums.length; i++){
//             int j = i - 1;
//             int key = nums[i];
//             while(j >= 0 && key < nums[j]){
//                 nums[j+1] = nums[j];
//                 j--;
//             }
//             nums[j + 1] = key;
//         }
//         return nums;
//     }
// } 

// public class Solution {
//     public int[] sortArray(int[] nums) {
//         mergeSort(nums, 0, nums.length - 1);
//         return nums;
//     } 
//     private void mergeSort(int[] nums, int left, int right) {
//         if (left >= right) return; 
//         int mid = left + (right - left) / 2; 
//         mergeSort(nums, left, mid);
//         mergeSort(nums, mid + 1, right); 
//         merge(nums, left, mid, right);
//     } 
//     private void merge(int[] nums, int left, int mid, int right) { 
//         int[] leftArray = new int[mid - left + 1];
//         int[] rightArray = new int[right - mid]; 
//         for (int i = 0; i < leftArray.length; i++)
//             leftArray[i] = nums[left + i];
//         for (int i = 0; i < rightArray.length; i++)
//             rightArray[i] = nums[mid + 1 + i]; 
//         int i = 0, j = 0, k = left; 
//         while (i < leftArray.length && j < rightArray.length) {
//             if (leftArray[i] <= rightArray[j]) {
//                 nums[k++] = leftArray[i++];
//             } else {
//                 nums[k++] = rightArray[j++];
//             }
//         } 
//         while (i < leftArray.length) nums[k++] = leftArray[i++];
//         while (j < rightArray.length) nums[k++] = rightArray[j++];
//     }
// }
