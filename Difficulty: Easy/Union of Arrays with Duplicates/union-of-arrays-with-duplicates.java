// User function Template for Java

class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        HashSet<Integer> hash = new HashSet<>();
        for(int i = 0; i < a.length; i++){
            hash.add(a[i]);
        }
        for(int i = 0; i < b.length; i++){
            hash.add(b[i]);
        }
        return hash.size();
    }
}

