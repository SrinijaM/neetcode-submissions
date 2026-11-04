class Solution {
    public int hammingWeight(int n) {
        /*
        - Subtraction creates a pattern that allows AND to remove the rightmost 1.
        - AND removes one 1.
        - res++ counts that removal.
        - Repeat until no 1s remain.
        */

        int counter=0;
        while(n!=0){
            n=n&(n-1);
            counter++;      
        }
        return counter;
    }
}
