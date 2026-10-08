class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sorted = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int write = nums.length - 1; write >= 0; write--) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                sorted[write] = leftSquare;
                left++;
            } else {
                sorted[write] = rightSquare;
                right--;
            }
        }

        return sorted;
    }
}