class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int unique = 1;

        for (int current = 1; current < nums.length; current++) {
            if (nums[current] != nums[current - 1]) {
                nums[unique++] = nums[current];
            }
        }

        return unique;
    }
}
