class Solution {
    public int removeDuplicates(int[] nums) {
        int duplicate =0;
	int k=1;
	for (int i = 0; i < nums.length; i++) {
		if(nums[i]==nums[duplicate]) {
			int temp = nums[i];
			nums[i]= nums[duplicate];
			nums[duplicate]= temp;
			
		}
		else {
			++duplicate;
			int temp = nums[i];
			nums[i]= nums[duplicate];
			nums[duplicate]= temp;
			k++;
		}
	}
	return k;
    }
}