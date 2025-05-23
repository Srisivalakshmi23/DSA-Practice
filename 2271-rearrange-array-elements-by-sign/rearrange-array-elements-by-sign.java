class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int num : nums){
            if(num > 0){
                pos.add(num);
            } else {
                neg.add(num);
            }
        }
        int posIndex = 0;
        int negIndex = 0;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                result[i] = pos.get(posIndex++);
            } else {
                result[i] = neg.get(negIndex++);
            }
        }
        return result;
    }
}

