class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> res=new HashMap<>();
        //Converting the 26 size count array to a tuple [immutable String] and use it as the key.
        for(String s:strs){
            int[] count=new int[26];
            for(char c:s.toCharArray()){
                count[c-'a']++;
            }
            String tmp= Arrays.toString(count);
            res.putIfAbsent(tmp,new ArrayList<>());
            res.get(tmp).add(s);
        }
            return new ArrayList<>(res.values());
    }
}
