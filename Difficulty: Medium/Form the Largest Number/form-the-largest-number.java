// User function Template for Java
 
class Solution {
    String findLargest(int[] arr) {
        // code here
        String[] strNums = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            strNums[i] = String.valueOf(arr[i]);
        } 
        Arrays.sort(strNums, new Comparator<String>() {
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);  
            }
        }); 
        if (strNums[0].equals("0")) return "0";

        StringBuilder result = new StringBuilder();
        for (String s : strNums) {
            result.append(s);
        }
        return result.toString();
    }
}
