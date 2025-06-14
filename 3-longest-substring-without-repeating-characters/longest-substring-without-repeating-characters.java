class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> ch = new HashSet<>();
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (!ch.contains(s.charAt(right))) {
                ch.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (ch.contains(s.charAt(right))) {
                    ch.remove(s.charAt(left));
                    left++;
                }
                ch.add(s.charAt(right));
            }
        }
        return maxLength;
    }
}