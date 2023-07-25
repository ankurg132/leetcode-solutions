class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int buy = 0;
        int sell = 1;
        int maxDiff = 0;
        while(sell < prices.size()){
            int currDiff = prices[sell] - prices[buy];
            if(prices[buy] < prices[sell])
                    maxDiff = max(maxDiff,currDiff);
            else{
                buy = sell;
            }
            sell++;
        }
        return maxDiff;
    }
};