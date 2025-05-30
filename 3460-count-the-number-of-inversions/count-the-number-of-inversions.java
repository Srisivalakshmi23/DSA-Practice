class Solution {
    public int numberOfPermutations(int n, int[][] requirements) {
        final int MODULO = 1_000_000_007;
        int[] req = new int[n + 1];
        Arrays.fill(req, -1);
        for (int[] r : requirements) {
            req[r[0] + 1] = r[1];
        }
        int maxI = n * (n - 1) / 2;
        int[][] dp = new int[n + 1][maxI + 1];
        dp[0][0] = 1;
        for (int len = 1; len <= n; len++) {
            int maxInv = len * (len - 1) / 2;
            int[] pSum = new int[maxInv + 2];
            for (int j = 0; j <= maxInv; j++) {
                pSum[j + 1] = (pSum[j] + dp[len - 1][j]) % MODULO;
            }
            for (int inv = 0; inv <= maxInv; inv++) {
                int left = Math.max(0, inv - (len - 1));
                int right = inv;
                dp[len][inv] = (pSum[right + 1] - pSum[left] + MODULO) % MODULO;
            }
            if (req[len] != -1) {
                for (int inv = 0; inv <= maxInv; inv++) {
                    if (inv != req[len]) {
                        dp[len][inv] = 0;
                    }
                }
            }
        }
        int result = 0;
        for (int val : dp[n]) {
            result = (result + val) % MODULO;
        }
        return result;
    }
}


// public class Solution {
//     private static int merge(int[] arr, int low, int mid, int high) {
//         ArrayList<Integer> temp = new ArrayList<>();
//         int left = low;   
//         int right = mid + 1; 
//         int cnt = 0;
//         while (left <= mid && right <= high) {
//             if (arr[left] <= arr[right]) {
//                 temp.add(arr[left]);
//                 left++;
//             } else {
//                 temp.add(arr[right]);
//                 cnt += (mid - left + 1);
//                 right++;
//             }
//         }
//         while (left <= mid) {
//             temp.add(arr[left]);
//             left++;
//         }
//         while (right <= high) {
//             temp.add(arr[right]);
//             right++;
//         }
//         for (int i = low; i <= high; i++) {
//             arr[i] = temp.get(i - low);
//         }
//         return cnt; 
//     }
//     public static int mergeSort(int[] arr, int low, int high) {
//         int cnt = 0;
//         if (low >= high) return cnt;
//         int mid = (low + high) / 2 ;
//         cnt += mergeSort(arr, low, mid);   
//         cnt += mergeSort(arr, mid + 1, high);  
//         cnt += merge(arr, low, mid, high);  
//         return cnt;
//     }
//     public static int numberOfPermutations(int[] a, int n) {
//         return mergeSort(a, 0, n - 1);
//     }
// }

