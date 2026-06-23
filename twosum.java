// //public class twosum {
//     public static void main(String[] args){
//         int[] arr = {2, 7, 11, 15};
//         int target = 9;
//         for (int i =0;i<arr.length;i++){
//             for (int j=i+1;j<arr.length;j++){
//                 if (arr[i] + arr[j] == target) {
//                     System.out.println("Indices: " + i + ", " + j);
//                 }            }}
//         }
//     }

import java.util.HashMap;

    public class twosum {
    public static void main(String[] args){
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i =0;i<arr.length;i++){
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + ", " + i);
            } else {
                map.put(arr[i], i);
            }
        }

        {
    }
}
    }