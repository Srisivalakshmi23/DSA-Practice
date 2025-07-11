class Solution {
    public boolean searchMatrix(int[][] matrix, int target) { 
        int m = matrix.length;
        int n = matrix[0].length; 
        int left = 0, right = m * n - 1; 
        while (left <= right) {
            int mid = (left + right) / 2;
            int midVal = matrix[mid / n][mid % n];  
            if (midVal == target) {
                return true;
            } else if (midVal < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        } 
        return false;
    }
}
