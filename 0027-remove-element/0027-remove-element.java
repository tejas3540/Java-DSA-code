class Solution {
    public int removeElement(int[] nums, int val) {
        int nonzero = 0;
	int k=0;
    for(int i =0; i<nums.length; i++){
        if(nums[i]!=val){
            int temp = nums[i];
            nums[i] = nums[nonzero];
           nums[ nonzero]=temp;
         nonzero++;}
        else k++;
    }
	
	return nonzero;
    }
}