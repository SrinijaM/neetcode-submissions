class Solution {
    public int rob(int[] nums) {
        int[] dp = new int [nums.length];
        Arrays.fill(dp,-1);
       return helper(dp,nums,nums.length-1);
    }
    int helper(int[] dp, int [] nums, int n){
        if(n==0) return nums[0];
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=Math.max((nums[n]+helper(dp,nums,n-2)),(helper(dp,nums,n-1))) ;
    }

}
