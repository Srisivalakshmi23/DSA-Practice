// User function Template for Java

class Solution {
    // Function to find the days of buying and selling stock for max profit.
    int stockBuySell(int arr[]) {
        // code here
        int profit = 0;
        for(int i = 1; i < arr.length; i++){
            int diff = arr[i] - arr[i - 1];
            if(diff > 0){
                profit += diff;
            }
        } return profit;
    }
}

