class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int maxnum =0;
        while(left<right){
            int width = right-left;
            int minnum=Math.min(height[left],height[right]);
            int area = width* minnum;

            maxnum=Math.max(maxnum,area);

            if(height[left]<height[right])   {
                left++;
            }
            else right--;
        }
        return maxnum;
    }
}