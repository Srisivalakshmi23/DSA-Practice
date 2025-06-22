class Solution {
    public String frequencySort(String s) {
         int n = s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i =0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int max=Integer.MIN_VALUE;
        char maxChar='\u0000';
        Set<Character> set =map.keySet(); 
        StringBuilder sb=new StringBuilder();
        while(sb.toString().length()!=n){
        for(char ch:set){
            if(map.get(ch)>max){
                max=map.get(ch);
                maxChar=ch;
            }
        }
        map.remove(maxChar);
        int i=max;
        while(i-->0){
            sb.append(maxChar);
        }
        max=Integer.MIN_VALUE;
    }
    return sb.toString();
    }
}