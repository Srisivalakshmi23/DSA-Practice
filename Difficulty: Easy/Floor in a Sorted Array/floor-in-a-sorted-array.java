class Solution {
    static int findFloor(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= x) {
                result = mid;
                low = mid + 1;    
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}



// class Solution {

//     static int findFloor(int[] arr, int x) {
//         // write code here
//         int low = 0;
//         int high = arr.length - 1;
//         int result = -1;
//         while(low <= high){
//             int mid = low + (high - low) / 2;
//             if(arr[mid] <= x){
//                 result = mid;
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return result;
//     }
// }