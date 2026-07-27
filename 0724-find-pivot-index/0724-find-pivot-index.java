class Solution {
    public int pivotIndex(int[] nums) {
     int total = 0 ;
	int rightsum =0;
    int pivot=0;
	for (int i = 0; i < nums.length; i++) {
		total += nums[i];
	}
	int leftsum=0;
	for (pivot = 0; pivot < nums.length; pivot++) {
		rightsum = total - leftsum - nums[pivot];
     if(pivot<=nums.length-1){
		if(leftsum == rightsum) {
			break;
		}
		else leftsum += nums[pivot];}
        else return -1;
	}
    if(pivot == nums.length) {
			return -1;
		}
	return pivot;
    }
}