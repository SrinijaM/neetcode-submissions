class Solution {
    public int numDecodings(String s) {
        int ans=0;
        int[] dp=new int[s.length()];

        //filling dp array with -1 causes issues in calculations when dp[a]+= is calculated.
        //Arrays.fill(dp,0);
           
        return ans=f(s,0,dp);
    }
    int f(String s, int a,int[] dp){

        //check length - otherwise array would go OutOfBounds.
        if(a==s.length()) return 1;

        if(s.charAt(a)=='0') return 0;

        if(dp[a]!=0) return dp[a];

        //Pick only one digit of index a.
        dp[a]+=f(s,a+1,dp);

        //Pick two digits of index a,a+1.
        if(a+1<s.length())
        { int nums=Integer.parseInt(s.substring(a,a+2));
            if((nums>=10)&& (nums<=26))
                dp[a]+=f(s,a+2,dp);
        }

        return dp[a];
       
    }
}
