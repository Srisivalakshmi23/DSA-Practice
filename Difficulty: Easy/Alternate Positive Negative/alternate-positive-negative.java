// User function Template for Java

// class Solution {
//     void rearrange(ArrayList<Integer> arr) {
//         // code here
//         int n = arr.length;
//         int[] result = new int[n];
//         int posIndex = 0;
//         int negIndex = 1;

//         for (int num : arr) {
//             if (num >= 0) {
//                 result[posIndex] = num;
//                 posIndex += 2;
//             } else {
//                 result[negIndex] = num;
//                 negIndex += 2;
//             }
//         }

//         return result;
//     }
// }

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        int n = arr.size();
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Separate positive and negative numbers
        for (int num : arr) {
            if (num >= 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        // Merge them into original list with alternating signs
        int i = 0, p = 0, ne = 0;

        while (p < pos.size() && ne < neg.size()) {
            arr.set(i++, pos.get(p++)); // positive first
            arr.set(i++, neg.get(ne++));
        }

        // If any remaining positive or negative numbers
        while (p < pos.size()) {
            arr.set(i++, pos.get(p++));
        }

        while (ne < neg.size()) {
            arr.set(i++, neg.get(ne++));
        }
    }
}


// class Solution {
//     public int[] rearrange (ArrayList<Integer> arr) {
//         int n = arr.size();
//         int[] result = new int[n];
//         List<Integer> pos = new ArrayList<>();
//         List<Integer> neg = new ArrayList<>();
//         for(int num : arr){
//             if(num > 0){
//                 pos.add(num);
//             } else {
//                 neg.add(num);
//             }
//         }
//         int posIndex = 0;
//         int negIndex = 0;
//         for(int i = 0; i < n; i++){
//             if(i % 2 == 0){
//                 result[i] = pos.get(posIndex++);
//             } else {
//                 result[i] = neg.get(negIndex++);
//             }
//         }
//         return result;
//     }
// }
