//Running Sum of 1d Array

//Brute Force:
class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int[] ans = new int[nums.length];
        
        for (int num: nums) {
            sum+=num;
        }
        ans[nums.length-1] = sum;
        for(int i=nums.length-2;i>=0;i--) {
            ans[i] = ans[i+1]-nums[i+1];
        }
        
        return ans;
    }
}

//Optimized solution
class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
            nums[i]=sum;
        }
        return nums;
    }
}
