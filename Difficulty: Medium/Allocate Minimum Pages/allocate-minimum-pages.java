
//Back-end complete function Template for Java

class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        int n = arr.length;
        if(k > n) 
        return -1;
        int low = getMax(arr);
        int high = getSum(arr);
        int result = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(isFeasible(arr, k, mid)){
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
    private static boolean isFeasible(int[] arr, int k, int maxPages){
        int students = 1;
        int currPages = 0;
        for(int pages : arr){
            if(currPages + pages > maxPages){
                students++;
                currPages = pages;
                if(students > k)
                    return false;
                } else {
                    currPages += pages;
                }
            }
        return true;
    }
    private static int getSum(int[] arr){
        int total = 0;
        for(int i : arr){
            total += i;
        }
        return total;
    }
    private static int getMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            max = Math.max(max, i);
        }
        return max;
    }
}
