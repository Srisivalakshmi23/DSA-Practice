// class Solution {
//     public int[] findMissingAndRepeatedValues(int[][] grid) {
//         int n = grid.length;
//         long s = 0;
//         long s2 = 0;
//         for(int i = 0; i < n; i++){
//             s += (long) grid[i][0];
//             s2 += (long) grid[i][0] * grid[i][1];
//         }
//         long sn = (long) n * (n + 1) / 2;
//         long s2n = (long) n * (n + 1) * (2 * n + 1) / 6;
//         long value1 = s - s2;
//         long value2 = s2 = s2n;
//         long value3 = value2 / value1;
//         long x = (value1 + value3) / 2;
//         long y = x - value1;
//         ArrayList<Integer> result = new ArrayList<>();
//         result.add((int) x);
//         result.add((int) y);
//         return result;
//     }
// }
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int total = n * n;
        long sum = 0;
        long squareSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];
                sum += val;
                squareSum += (long) val * val;
            }
        }
        long expectedSum = (long) total * (total + 1) / 2;
        long expectedSquareSum = (long) total * (total + 1) * (2L * total + 1) / 6;
        long diff = sum - expectedSum;             // x - y
        long squareDiff = squareSum - expectedSquareSum; // x^2 - y^2
        long sumXY = squareDiff / diff;            // x + y
        long x = (diff + sumXY) / 2;               // x = (x - y + x + y)/2
        long y = x - diff;
        return new int[]{(int)x, (int)y}; // [repeated, missing]
    }
}

