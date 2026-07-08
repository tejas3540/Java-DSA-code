class Solution {
    public int[] findErrorNums(int[] nums) {

        int duplicate = 0;
        int missing = 0;

        // Find duplicate
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    duplicate = nums[i];
                }
            }
        }

        // Find missing
        for (int i = 1; i <= nums.length; i++) {

            boolean found = false;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                missing = i;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }
}