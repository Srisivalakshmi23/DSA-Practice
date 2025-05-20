// User function Template for Java
// class Solution {
//     public int maxConsecutiveCount(int[] arr) {
//         // code here
//         int max = 0;
//         int count = 0; 
//         for(int i = 0;i<arr.length; i++){
//             if(arr[i] == 1){
//                 count++;
//                 max = Math.max(max, count);
//             }
//             else{
//                 count = 0;
//             }
//         }
//         return max;
//     }
// }


class Solution {
    public int maxConsecutiveCount(int[] arr) {
        
        if(arr.length == 0)
        return 0;
        
        int max = 1;
        int count = 1; 
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}

