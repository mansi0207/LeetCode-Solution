class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int mini = prices[0];
        int maxi = 0; 

        for(int i=0;i<n;i++){
            if(prices[i]<mini){
                mini = prices[i];
            }
            maxi = Math.max(maxi, prices[i]-mini);
        }
        return maxi;
        
    }
}