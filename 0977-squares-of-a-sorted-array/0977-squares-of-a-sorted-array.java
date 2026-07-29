class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] sorted = new int[nums.length];
    int lsquare = 0;
	int rsquare=0;
	int left = 0;
	int right = nums.length-1;
	int count = right;
	while (left<=right)	{
		lsquare = nums[left]*nums[left];
		rsquare = nums[right]*nums[right];
		
			if(lsquare<rsquare) {
			sorted[count]=rsquare;
					right--;
					count--;}
		else {
			sorted[count]= lsquare;
			left++;
			count--;
		}
		
	}	
	return sorted;   }
}