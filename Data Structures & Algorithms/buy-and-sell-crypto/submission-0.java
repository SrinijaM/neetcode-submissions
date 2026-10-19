class Solution {
    public int maxProfit(int[] prices) {
        int min=0,max=0,i=1,result=0;
        
        while(i<prices.length&&min<=max){
            min=prices[i]<prices[min] ? i:min;
            max=prices[i]>prices[max] ? i:max;
            if(max<min)max=min;

            result=Math.max(result,prices[max]-prices[min]);
            i++;
        }

        System.out.println("min:"+min+" max:"+max);
        return result;

    }
}
