class Solution {
    public int removeDuplicates(int[] nums) {
        int  i =0;
	int k=1;
	int j = nums.length-1;
	while(k<=j) {
	if(nums[i]!=nums[k]) {
		nums[i+1] = nums[k];
		i++;
		k++;
	}
	else k++;}
	return i+1;

    }
}