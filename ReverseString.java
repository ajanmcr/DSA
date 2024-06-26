//https://leetcode.com/problems/reverse-string/description/
class Solution {
    public void reverseString(char[] s) {
        int low = 0, high=s.length -1;
        char temp;
        while(low <= high) {
            temp = s[low];
            s[low] = s[high];
            s[high] = temp;
            low++;
            high--;
        }
    }
}
