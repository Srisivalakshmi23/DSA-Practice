public class Solution {
    public String largestNumber(int[] nums) { 
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        } 
        int n = strNums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                String a = strNums[j];
                String b = strNums[j + 1]; 
                if ((a + b).compareTo(b + a) < 0) { 
                    String temp = strNums[j];
                    strNums[j] = strNums[j + 1];
                    strNums[j + 1] = temp;
                }
            }
        }
        if (strNums[0].equals("0")) return "0";
        String result = "";
        for (String s : strNums) {
            result += s;
        }

        return result;
    }
}
