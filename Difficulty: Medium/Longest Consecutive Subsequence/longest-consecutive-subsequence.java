class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        int maxLength = 0;
        for(int num : arr){
            if(!set.contains(num - 1)){
                int current = num;
                int count = 1;
                while(set.contains(current + 1)){
                    current++;
                    count++;
                }
                maxLength = Math.max(maxLength, count);
            }
        }
        return maxLength;
    }
}
