class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> res=new HashMap<>();
        for(String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String tmp= Arrays.toString(c);
            res.putIfAbsent(tmp,new ArrayList<>());
            res.get(tmp).add(s);
        }
            return new ArrayList<>(res.values());
    }
}
