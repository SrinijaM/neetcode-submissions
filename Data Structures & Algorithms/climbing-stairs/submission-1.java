class Solution {
    public int climbStairs(int n) {
       int[] arr=new int[n+1];
       Arrays.fill(arr,0);
       arr[0]=1;
       arr[1]=1;
        return f(n,arr);


       
    }
    int f(int n, int[] arr){
       if(arr[n]!=0) return arr[n];

        return arr[n]=f(n-1,arr)+f(n-2,arr);
    }
}
