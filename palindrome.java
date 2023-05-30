class Solution {
    public boolean isPalindrome(int x) {
        int number = x, reverse=0, reminder;

        if(x < 0) {
            return false;
        } else {
            while(x !=0) {
                reminder = x % 10;
                reverse = reverse * 10 + reminder;
                x /= 10;
            }

            if(reverse == number) {
                return true;
            }
        }
        return false;
    }
}
