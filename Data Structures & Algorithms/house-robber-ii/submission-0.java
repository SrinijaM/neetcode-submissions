class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(robLinear(nums, 0, nums.length - 2), robLinear(nums, 1, nums.length - 1));
    }
    int robLinear(int[] nums, int start, int end) {
        int[] dp = new int[end - start + 1];
        Arrays.fill(dp, -1);
        return f(end, start, nums, dp);
    }
    int f(int ind, int start, int[] nums, int[] dp){
        if(ind == start) return nums[ind];
        if(ind < start) return 0;

        if(dp[ind - start] != -1) return dp[ind - start];

        int take = nums[ind] + f(ind - 2, start, nums, dp);
        int nottake = 0 + f(ind - 1, start, nums, dp);
        return dp[ind - start] = Math.max(take, nottake);
    }
}