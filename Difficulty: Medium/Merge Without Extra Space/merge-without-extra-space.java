// User function Template for Java

class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n = a.length;
        int m = b.length;
        int gap = nextGap(n + m);
        while (gap > 0) {
            int i = 0;
            int j = gap;
            while (j < n + m) {
                int val1 = get(a, b, i, n);
                int val2 = get(a, b, j, n);
                if (val1 > val2) {
                    set(a, b, i, n, val2);
                    set(a, b, j, n, val1);
                }
                i++;
                j++;
            }
            gap = nextGap(gap);
        }
    }
    private int get(int[] a, int[] b, int index, int n) {
        return index < n ? a[index] : b[index - n];
    }
    private void set(int[] a, int[] b, int index, int n, int value) {
        if (index < n) a[index] = value;
        else b[index - n] = value;
    }
    private int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap / 2) + (gap % 2);
    }
}
