class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int n = nums.length;
        Integer man1 = null;
        Integer man2 = null;
        int count1 = 0;
        int count2 = 0;
        for(int num : nums){
            if(man1 != null && num == man1){
                count1++;
            } else if (man2 != null && num == man2){
                count2++;
            } else if (count1 == 0){
                man1 = num;
                count1 = 1;
            } else if (count2 == 0){
                man2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int num : nums){
            if(num == man1 && man1 != null)
            count1++;
            else if (num == man2 && man2 != null)
            count2++;
        }
        List<Integer> result = new ArrayList<>();
        if(count1 > n / 3)
        result.add(man1);
        if(count2 > n / 3 && man2 != null && !man2.equals(man1))
        result.add(man2);
        Collections.sort(result);
        return result;
    }
}

