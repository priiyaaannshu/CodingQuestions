class Solution {
    public int maxProfit(int[] prices, int fee) {
        int cash = 0;
        int hold = -prices[0];

        for(int i = 1; i<prices.length;i++){
            int prevhold = hold;
            int prevcash = cash;

            cash = Math.max(prevcash,prevhold+prices[i]-fee);

            hold = Math.max(prevhold,prevcash-prices[i]);
        }
        return cash;
        
    }
}