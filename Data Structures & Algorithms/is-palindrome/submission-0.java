
class Solution {
    public boolean isPalindrome(String s1) {
        
        String s = "";
        char[] ch = s1.toCharArray();
        
        for (int a : ch) { 
            if ((a >= 48 && a <= 57) ||
                (a >= 65 && a <= 90) ||
                (a >= 97 && a <= 122)) {
                s = s + (char) a;
            }
        }

        s = s.toLowerCase();

        int f = 0, l = s.length() - 1;

        while (f < l) {
            if (s.charAt(f) != s.charAt(l)) {
                return false;
            }

            f++;
            l--;
        }

        return true;
    }
}
