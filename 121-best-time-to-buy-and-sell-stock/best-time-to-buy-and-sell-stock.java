class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int mPrice = Integer.MAX_VALUE;
        for(int price : prices){
            if(price < mPrice){
            mPrice = price;
        } else if (price - mPrice > profit){
            profit = price - mPrice;
        }
        }
        return profit;
    }
}
