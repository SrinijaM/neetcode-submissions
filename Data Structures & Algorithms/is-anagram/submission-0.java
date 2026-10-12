class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        
        HashMap<Character,Integer> sc=new HashMap<>();
        //HashMap<Character> tc=new HashMap<>();

        for(int i=0;i<s.length();i++){
            sc.put(s.charAt(i),sc.getOrDefault(s.charAt(i),0)+1);
            sc.put(t.charAt(i),sc.getOrDefault(t.charAt(i),0)-1);   
        }
        for (Map.Entry<Character, Integer> entry : sc.entrySet()) {
    int value = entry.getValue();
    if(value!=0)return false;
        }
         return true;

    }
   
}
