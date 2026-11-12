class Solution {
    public int reverseBits(int n) {
        int bit=0;
        int result=0;

        for (int i = 0; i < 32; i++) {
            bit=n&1;
            result=(result << 1) | bit;
            n=n>>>1;
        }
        return result;
    }
}
