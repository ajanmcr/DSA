//https://leetcode.com/problems/left-and-right-sum-differences/
class Solution {
    public int[] leftRightDifference(int[] nums) {
        //brute force
      
        // int[] leftSumArr = new int[nums.length];
        // int[] rightSumArr = new int[nums.length];
        // int[] ans = new int[nums.length];
        // int leftSum = 0, rightSum = 0;
        // if(nums.length==1) return new int[]{0};
        // if(nums.length==1) return new int[]{0};
        // for(int i=0;i<=nums.length-1;i++) {
        //     leftSumArr[i] = leftSum;
        //     leftSum += nums[i]; 
        // }
        // for(int j=nums.length-1; j>-1;j--) {
        //     rightSumArr[j] = rightSum;
        //     rightSum += nums[j];
        // }
        // for(int i=0;i<nums.length;i++) {
        //     ans[i]=Math.abs(leftSumArr[i]-rightSumArr[i]);
        // }
        // return ans;

        //optimized:
        int[] arr = new int[nums.length];
        int rightSum = 0;
        int leftSum = 0;
        for(int i: nums) {
            rightSum+=i;
        }
        for(int i=0;i<=nums.length-1;i++) {
            rightSum -= nums[i];
            arr[i] = Math.abs(leftSum-rightSum);
            leftSum += nums[i];
        }
        return arr;
    }
}
