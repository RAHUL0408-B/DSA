public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // last unique element index
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
            }
        }
        return i + 1; // length of unique part
    }

    // Quick demo
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3};
        int k = new Solution().removeDuplicates(nums);
        System.out.println(k);           // 3
        for (int x = 0; x < k; x++) {
            System.out.print(nums[x] + " "); // 1 2 3
        }
    }
}