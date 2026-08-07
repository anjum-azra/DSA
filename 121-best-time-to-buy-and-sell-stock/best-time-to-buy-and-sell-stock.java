class Solution {
    public int maxProfit(int[] prices) {
       int n=prices.length;
        int buy=prices[0];
        int curr_profit=0;
        int max_profit=0;
        for(int i=1;i<n;i++)
        {
            if(prices[i]<buy)
            buy=prices[i];
            else
            {   int sell=prices[i];
                curr_profit=sell-buy;
                max_profit=Math.max(curr_profit,max_profit);
            }
        }
 return max_profit;
          }
        }