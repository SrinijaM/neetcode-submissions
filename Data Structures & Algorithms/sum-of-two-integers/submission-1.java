class Solution {
    public int getSum(int a, int b) {
        int sum=0, carry=0;
        if(b==0)return a;
        if(a==0)return b;
        while(b!=0){
            sum=a^b;
            carry=(a&b)<<1;

            a=sum;
            b=carry;
        }
        return sum;
    }
}
