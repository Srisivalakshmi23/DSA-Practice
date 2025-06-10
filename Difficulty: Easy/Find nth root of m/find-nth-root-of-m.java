// User function Template for Java

class Solution{
    public int nthRoot(int n, int m){
        int low = 1;
        int high = m;
        while(low <= high) {
            int mid = (low + high) / 2;
            long power = pow(mid, n);
            if(power == m){
                return mid;
            } else if (power < m){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    private long pow(int base, int exp){
        long result = 1;
        for(int i = 0; i < exp; i++){
            result = result * base;
            if(result > Integer.MAX_VALUE)
            return Long.MAX_VALUE;
        }
        return result;
    }
}
