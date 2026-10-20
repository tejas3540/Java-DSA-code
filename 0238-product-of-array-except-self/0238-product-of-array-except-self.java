class Solution {
    public int[] productExceptSelf(int[] nums) {
       
        int n = nums.length;

        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];

        int ls = 1;
        int rs = 1;

        // Left products
        for (int i = 0; i < left.length; i++) {

            if (i > 0)
                ls *= nums[i - 1];
            else
                left[i] = 1;

            left[i] = ls;
        }

        // Right products
        for (int i = nums.length - 1; i >= 0; i--) {

            if (i != nums.length - 1)
                rs *= nums[i + 1];
            else
                right[i] = 1;

            right[i] = rs;
        }

        // Final answer
        for (int i = 0; i < n; i++) {
            ans[i] = left[i] * right[i];
        }

        return ans;
        }

}