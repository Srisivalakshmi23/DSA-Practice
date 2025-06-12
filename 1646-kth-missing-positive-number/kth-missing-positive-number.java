class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missCount = 0;
        int current = 1;
        int index = 0;
        while (missCount < k){
            if(index < arr.length && arr[index] == current){
                index++;
            } else {
                missCount++;
            }
            if(missCount == k)
            return current;
            current++;
        }
        return -1;
    }
}
 