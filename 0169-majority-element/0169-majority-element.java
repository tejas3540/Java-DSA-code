class Solution {
    public int majorityElement(int[] nums) {
        int f = 0;
int count =0;
int i =0;
int j= 0;
	while(j<nums.length) {
	if(nums[i]==nums[j]) {
		count++;
		j++;
        f=nums[i];
	}
	else {
		count--;
        j++;
	}
	if(count<=0) {
		i = j;
	//	f=nums[i];
		count =0;
		//j++;
	}
}
return f;

        
    }
}