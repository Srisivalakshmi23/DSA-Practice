// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int place = 0;
        for(int num : arr){
            if(num != 0){
                arr[place++] = num;
            }
        }
        while(place < arr.length){
            arr[place++] = 0;
        }
    }
}