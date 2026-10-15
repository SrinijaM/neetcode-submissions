
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                str.append(Character.toLowerCase(c));
            }
        }

        int f = 0;
        int l = str.length() - 1;

        while (f < l) {
            if (str.charAt(f) != str.charAt(l)) {
                return false;
            }

            f++;
            l--;
        }

        return true;
    }
}
