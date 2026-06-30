class Solution {
    public String reverseWords(String s) {
        String ans ="";
        String strs[]=s.split("\\s+");
          for(int i = strs.length-1;i>=0;i--)  {
					ans =ans+(strs[i]+" ");
			}
            return ans.trim();
    }
}