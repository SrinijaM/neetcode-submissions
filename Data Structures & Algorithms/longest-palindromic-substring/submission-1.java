class Solution {
    public String longestPalindrome(String s) {
        int[][] dp =new int[s.length()][s.length()];
            for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int l=0,r=0,maxlength=Integer.MIN_VALUE;

        for(int i=0;i<s.length();i++){
            dp[i][i]=1;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)&&(i-j<=2||dp[j+1][i-1]==1)) 
                {   dp[j][i]=1;
                        if((maxlength<i-j+1)){
                            maxlength=i-j+1;
                            l=j;r=i;
                        }
                        
                    }
                }          
            }
            return s.substring(l,r+1);
        }
        
    }

