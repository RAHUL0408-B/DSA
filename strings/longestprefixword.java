// public class longestprefixword {

//     public static void main(String[] args) {

//         String[] arr = {"flower", "flow", "flight"};

//         String prefix = arr[0];

//         for (int i = 1; i < arr.length; i++) {

//             while (!arr[i].startsWith(prefix)) {

//                 prefix = prefix.substring(0, prefix.length() - 1);

//                 if (prefix.isEmpty()) {
//                     break;
//                 }
//             }
//         }

//         System.out.println("Longest Common Prefix = " + prefix);
//     }
// }


import java.util.HashSet;

public class longestprefixword {

    public static void main(String[] args) {

        String s = "abcabcbb";

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {

                set.remove(s.charAt(left));
                left++;

            }

            set.add(s.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);

        }

        System.out.println("Longest Length = " + maxLength);

    }

}