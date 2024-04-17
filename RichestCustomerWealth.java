//Richest Customer Wealth
class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0, max=0;
        for(int[] num: accounts) {
            sum=0;
            for(int i: num) {
                sum+=i;
            }
            if(max<=sum) {
                max=sum;
            }
        }
        return max;
    }
}
