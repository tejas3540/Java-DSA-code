class Solution {
    public int[] sortedSquares(int[] nums) {
      	int [] sorted = new int[nums.length];
        int square = 0;
	for (int i = 0; i < nums.length; i++) {
		square = nums[i]*nums[i];
		sorted[i] = square;
	}	
	Arrays.sort(sorted);
	return sorted;
    }
}