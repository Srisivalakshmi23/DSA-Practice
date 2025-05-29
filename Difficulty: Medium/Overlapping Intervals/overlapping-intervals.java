class Solution {
    public List<int[]> mergeOverlap(int[][] arr){
        if(arr.length == 0){
            return new ArrayList<>();
        }
        
        // Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b){
            return Integer.compare(a[0], b[0]);
            }
        });
        
        List<int[]> merge = new ArrayList<>();
        for(int[] interval : arr){
            if(merge.isEmpty() || merge.get(merge.size() - 1)[1] < interval[0]){
                merge.add(interval);
            } else {
                merge.get(merge.size() - 1)[1] = Math.max(merge.get(merge.size() - 1)[1], interval[1]);
            }
        }
        return merge;
    }
}



// class Solution {
//     public List<int[]> mergeOverlap(int[][] arr) {
//         // Code here // Code here
//         if(arr.length == 0)
//         return new int[0][0];
//         Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

//     //     Arrays.sort(intervals, new Comparator<int[]>() {
//     //     @Override
//     //     public int compare(int[] a, int[] b) {
//     //         return Integer.compare(a[0], b[0]);
//     //     }
//     // });

//         List<int[]> merge = new ArrayList<>();
//         for(int[] interval : arr){
//             if(merge.isEmpty() || merge.get(merge.size() - 1) [1] < interval[0]){
//                 merge.add(interval);
//             }else {
//                 merge.get(merge.size() - 1)[1] = Math.max(merge.get(merge.size() - 1) [1], interval[1]);
//             }
//         }
//         return merge.toArray(new int[merge.size()][]);
//     }
// }


