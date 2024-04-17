//Concatenation of Array

//Brute Force:
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int i=0, j=0;
        while(i<=nums.length*2-1) {
            if(j==nums.length)
                j=0;
            ans[i] = nums[j];
            i++;j++;
        }
        return ans;
    }
}

//Optimized Solution:
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i=0;i<nums.length;i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }

}
