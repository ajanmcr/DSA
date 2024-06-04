//https://leetcode.com/problems/find-peak-element/
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0, end = nums.length - 1, mid;
        while(start < end) {
            mid = start + (end - start) / 2;
            //can also reverse the condition like nums[min] < nums[mid+1] and update the value of start
            //and return start since it'll hold the index of peak element 
            if(nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
