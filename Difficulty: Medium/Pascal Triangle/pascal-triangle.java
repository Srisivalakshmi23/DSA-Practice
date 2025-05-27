// User function Template for Java

class Solution {

    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        List<List<Integer>> triangle = new ArrayList<>();
        for(int row = 0; row <= n; row++){
            List<Integer> currRow = new ArrayList<>();
            for(int col = 0; col <= row; col++){
                if(col == 0 || col == row){
                    currRow.add(1);
                } else {
                    int left = triangle.get(row - 1).get(col - 1);
                    int right = triangle.get(row - 1).get(col);
                    currRow.add(left + right);
                }
            }
            triangle.add(currRow);
        }
        return new ArrayList<>(triangle.get(n - 1));
    }
}


