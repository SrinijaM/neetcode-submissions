class Solution {
    public int lengthOfLongestSubstring(String s) {
        int counter=0, i=0;
        HashSet<Character> set=new HashSet<>();

        char[] c =s.toCharArray();

        for(int j=0;j<c.length;j++){

            while(set.contains(c[j])){
                set.remove(c[i]);
            i++;
            }

            set.add(c[j]);
            counter=Math.max(counter,j-i+1);


        }
        return counter;

    }
}
