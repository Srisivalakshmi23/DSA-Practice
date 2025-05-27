class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int row = 0; row < numRows; row++){
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
        return triangle;
    }
}

