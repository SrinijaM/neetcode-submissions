class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0],i=1,result=0;
        
        while(i<prices.length){
            //no need to store min index
            min=prices[i]<min ? prices[i]:min;

            result=Math.max(result,prices[i]-min);
            i++;
        }

        //System.out.println("min:"+min+" max:"+max);
        return result;

    }
}
