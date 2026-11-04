class Solution {
    public int[] countBits(int n) {
        
        int[] res =new int[n+1];
        
       return f(0,0,res,n);

    }
    int[] f(int j,int counter,int[]res, int n){
        int i=j;
        while(i!=0){
            i=i&(i-1);
            counter++;
        }
        res[j]=counter;
        j++;
        if(j<=n)f(j,0,res,n);
        return res;
    }
}
