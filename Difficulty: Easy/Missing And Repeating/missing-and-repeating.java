// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        long s = 0;
        long s2 = 0;
        for(int i = 0; i < n; i++){
            s += arr[i];
            s2 += (long) arr[i] * arr[i];
        }
        long sn = (long) n * (n + 1) / 2;
        long s2n = (long) n * (n + 1) * (2 * n + 1) / 6;
        long value1 = s - sn;
        long value2 = s2 - s2n;
        long value3 = value2 / value1;
        long x = (value1 + value3) / 2;
        long y = x - value1;
        ArrayList<Integer> result = new ArrayList<>();
        result.add((int) x);
        result.add((int) y);
        return result;
    }
}

