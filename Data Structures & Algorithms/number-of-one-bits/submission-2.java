class Solution {
    public int hammingWeight(int n) {
        int counter=0;
        if(n==0) return counter;
       // if(n==1) return counter=1;
        while(n!=1){
            if(n%2==1)counter++;
            n=n/2;
        }
        return counter+1;
    }
}
