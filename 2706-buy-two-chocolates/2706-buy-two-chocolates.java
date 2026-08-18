class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int left = 0;
        int right = prices.length - 1;

        int cost = prices[left] + prices[left + 1];

        if(cost <= money){
            return money - cost;
        }
        return money;
    }
}