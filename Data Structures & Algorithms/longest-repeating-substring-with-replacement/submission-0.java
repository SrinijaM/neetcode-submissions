class Solution {
    public int characterReplacement(String s, int k) {
        int same=0,result=0,f=0;
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),(map.getOrDefault(s.charAt(i),0)+1));

        same=Math.max(same,map.get(s.charAt(i)));
                    while((i-f+1)-same>k){
                        map.put(s.charAt(f),map.get(s.charAt(f))-1);
                        f++;
                    }
                


             result=Math.max(result,i-f+1);
            
        }
        return result;
        
    }
}
