class Solution {
    public String reverseWords(String s) { 
        String arr[] = s.split("\\s+");
        s="";
        for(int i=arr.length-1;i>-1;i--){
            s+=arr[i]+" ";
        }
        return s.trim();
    }
}