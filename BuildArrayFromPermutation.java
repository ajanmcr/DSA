//Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i=0;i<nums.length;i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
