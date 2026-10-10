class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            if(!set.contains(i))
                set.add(i);

            else
                return true;
        }
        return false;

        /*
        Remember:
        if contains duplicate - return true.
        no duplicates - return false.
        */
    }
}