// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        result.add(findBound(arr, x, true));   
        result.add(findBound(arr, x, false)); 
        return result;
    }
    private int findBound(int[] arr, int x, boolean isFirst) {
        int low = 0;
        int high = arr.length - 1;
        int bound = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                bound = mid;
                if (isFirst) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return bound;
    }
}

