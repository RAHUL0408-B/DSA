public class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        // Convert both to long to avoid overflow
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        int result = 0;

        while (dvd >= dvs) {
            long temp = dvs;
            int multiple = 1;

            // Find the biggest double of divisor that fits
            while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            dvd -= temp;
            result += multiple;
        }

        // Apply sign
        return ((dividend > 0) == (divisor > 0)) ? result : -result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.divide(10, 3));  // Output: 3
        System.out.println(sol.divide(7, -3));  // Output: -2
        System.out.println(sol.divide(-2147483648, -1));  // Output: 2147483647
    }
}
