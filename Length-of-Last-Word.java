//with the help of string functions
class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int lastIndexOfSpace = str.lastIndexOf(" ");

        return str.substring(lastIndexOfSpace+1).length();
    }
}
