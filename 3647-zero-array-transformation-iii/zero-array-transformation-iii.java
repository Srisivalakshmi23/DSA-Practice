public class Solution {

    public int maxRemoval(int[] nums, int[][] queries) {
        Arrays.sort(queries, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> activeQuery = new PriorityQueue<>(Collections.reverseOrder());
        int[] effectTracker = new int[nums.length + 1];
        int currentOpr = 0;
        int queryIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            currentOpr += effectTracker[i];
            while (queryIndex < queries.length && queries[queryIndex][0] == i) {
                activeQuery.offer(queries[queryIndex][1]);
                queryIndex++;
            }
            while (currentOpr < nums[i] && !activeQuery.isEmpty() && activeQuery.peek() >= i) {
                int end = activeQuery.poll();
                currentOpr++;
                effectTracker[end + 1]--;
            }
            if (currentOpr < nums[i]) {
                return -1;
            }
        }
        return activeQuery.size();
    }
}
