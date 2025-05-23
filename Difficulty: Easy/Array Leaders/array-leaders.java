class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = n - 1; i >= 0; i--){
            if(arr[i] >= max){
                result.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(result);
        return result;
    }
}

