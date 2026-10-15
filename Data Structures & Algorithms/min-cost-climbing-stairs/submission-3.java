class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int [] dp =new int[cost.length];
        Arrays.fill(dp,-1);

        return Math.min(f(cost,dp,0),f(cost,dp,1));
    }
    int f(int[]cost, int[] dp, int i){

        if(i>=cost.length) return 0;
       

        if(dp[i]!=-1) return dp[i];

        dp[i]= cost[i]+Math.min(f(cost,dp,i+1),f(cost,dp,i+2));

        return dp[i];
    }
}
