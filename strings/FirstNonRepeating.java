public class FirstNonRepeating {

    public static void main(String[] args) {

        String s = "aabbcdde";

        int[] freq = new int[26];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {

            freq[s.charAt(i) - 'a']++;
        }

        // Find first non-repeating character
        for (int i = 0; i < s.length(); i++) {

            if (freq[s.charAt(i) - 'a'] == 1) {

                System.out.println("First Non-Repeating Character = " + s.charAt(i));
                return;
            }
        }

        System.out.println("No Unique Character");
    }
}