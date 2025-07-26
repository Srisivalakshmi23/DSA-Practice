// class Solution {
//     public String reverseWords(String s) { 
//         List<String> words = Arrays.asList(s.trim().split("\\s+")); 
//         Collections.reverse(words);
//         return String.join(" ", words);
//     }
// }

class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
}