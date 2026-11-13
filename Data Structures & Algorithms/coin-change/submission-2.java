
class Solution {
    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);

        int ans = f(dp, coins, amount, 0);

        return ans == amount + 1 ? -1 : ans;
    }

    int f(int[] dp, int[] coins, int amount, int i) {

        // Successfully reached target
        if (i == amount) return 0;

        // Exceeded target
        if (i > amount) return amount + 1;

        // Already calculated
        if (dp[i] != -1) return dp[i];

        int best = amount + 1;

        for (int j : coins) {
            if (j > amount - i) {
    continue;
}

            int smtg = i + j;

            int sub = f(dp, coins, amount, smtg);

            if (sub != amount + 1) {
                best = Math.min(sub + 1, best);
            }
        }

        return dp[i] = best;
    }
}
