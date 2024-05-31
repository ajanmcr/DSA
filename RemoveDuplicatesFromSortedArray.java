//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
class Solution {
    public int removeDuplicates(int[] nums) {
        int i, j=0;
        for(i=1;i<=nums.length-1;i++) {
            if(nums[i]!=nums[j]){
                j+=1;
                nums[j]=nums[i];
            }
        }
        return j+1;
    }
}
