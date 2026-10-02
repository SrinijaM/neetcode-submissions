class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int ans= f(coins.length-1,amount,coins);
        if(ans>=1e9)return -1;
        return ans;

    }
    int f(int ind, int t, int [] nums){
        if(ind==0 )
        {
            if(t%nums[ind]==0) return t/nums[0];
            return (int)1e9;
        }
        int notTake = 0 +f(ind-1,t,nums);
        int take =Integer.MAX_VALUE;
        if(nums[ind]<=t)
        take=1+f(ind,t-nums[ind],nums);
        return Math.min(notTake,take);
    }
}
