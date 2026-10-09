class Solution {
    public int countSubstrings(String s) {
        int [][] dp=new int[s.length()][s.length()];
        int counter =0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<=i;j++){
                
                if((s.charAt(i)==s.charAt(j))&&((i-j<=2)||(dp[j+1][i-1]==1))){
                    dp[j][i]=1;
                    counter++;
                }
            }
        }
        return counter;
    }
}
