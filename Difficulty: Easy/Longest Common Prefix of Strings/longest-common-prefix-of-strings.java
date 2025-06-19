// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        if (arr == null || arr.length == 0) return "";
        String prefix = arr[0];
        for (String s : arr)
            while (s.indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length() - 1);
        return prefix;
    }
}