class Solution {
    public int mySqrt(int x) {
        // if (x == 0 || x == 1) 
        //     return x;
        // int low = 1;
        // int high = x;
        // int ans = 1;
        // while(low <= high){
        //     int mid = (low + high) / 2;
        //     int val = mid * mid;
        //     if(val <= x){
        //         ans = mid;
        //         low = mid + 1;
        //     } else {
        //         high = mid - 1;
        //     }
        // }
        // return ans;
        
        int low = 1;
        int high = x;
        int result = 0;
        while(low <= high){
            int mid = (low + high)/2;
            if(mid <= x/mid){
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if(x == 0 || x == 1){
            return x;
        }
        return result;
    }
}