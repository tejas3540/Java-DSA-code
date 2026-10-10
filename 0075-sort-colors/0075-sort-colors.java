class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int high = nums.length-1;
        int mid = 0;
        while(mid<=high){
        if(nums[mid] == 0){
            int t = nums[mid];
            nums[mid] = nums[low];
            nums[low] = t;
            mid++;low++;
        }
      else if(nums[mid]==1){
            mid++;
        }
        else{
           int t = nums[high];
            nums[high] = nums[mid];
            nums[mid] = t;
             high--;}
        }

    }
}