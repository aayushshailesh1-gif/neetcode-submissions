class Solution {
    public boolean isPalindrome(String s) {
        String vals = "";
        String b = s.toLowerCase();
        char [] test = b.toCharArray();
        for (int i = 0; i < test.length; i++) {
            if (Character.isLetterOrDigit(test[i])) {
                vals += test[i]; 
            } else {
                continue;
            }
        }
        for (int i = 0; i < vals.length(); i++) {
            if (vals.charAt(i) != vals.charAt(vals.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
