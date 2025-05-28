class Solution{
    public int findMaxLength(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int sum = 0;
        map.put(0, -1);
        for(int i = 0; i < nums.length; i++){
            sum += (nums[i] == 0) ? -1 : 1;
            if(map.containsKey(sum)){
                max = Math.max(max, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return max;
    }
}



// class Solution {
//     public int findMaxLength(int[] nums) {
//         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//         int max = 0;
//         int sum = 0;
//         for(int i = 0; i < nums.length; i++){
//             if(sum == 0){
//                 max = i + 1;
//             } else {
//                 if(map.get(sum) != null){
//                     max = Math.max(max, i - map.get(sum));
//                 } else {
//                     map.put(sum, i);
//                 }
//             }
//         }
//         return max;
//     }
// }