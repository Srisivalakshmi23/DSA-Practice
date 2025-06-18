class Solution {
    public int[] findPeakGrid(int[][] mat) { 
        int m = mat.length;
        int n = mat[0].length;
        int left = 0, right = n - 1; 
        while (left <= right) {
            int midCol = (left + right) / 2; 
            int maxRow = 0;
            for (int i = 0; i < m; i++) {
                if (mat[i][midCol] > mat[maxRow][midCol]) {
                    maxRow = i;
                }
            } 
            int midVal = mat[maxRow][midCol];
            int leftVal = (midCol > 0) ? mat[maxRow][midCol - 1] : -1;
            int rightVal = (midCol < n - 1) ? mat[maxRow][midCol + 1] : -1; 
            if (midVal > leftVal && midVal > rightVal) {
                return new int[]{maxRow, midCol};  
            } else if (leftVal > midVal) {
                right = midCol - 1;
            } else {
                left = midCol + 1;
            }
        } 
        return new int[]{-1, -1}; 
    }
}
