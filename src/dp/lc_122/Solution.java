package dp.lc_122;

/**
 * 122. 买卖股票的最佳时机 II
 * @author xiangliang
 * @time 2020/3/9 23:15
 * @url https://www.bilibili.com/video/av93882056
 */
public class Solution {

    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        // buy + prices[i] = sell
        int buy = -prices[0];
        int sell = 0;
        int result = 0;

        for (int i = 1; i < prices.length; i++) {
            buy = Math.max(buy, sell - prices[i]);
            sell = Math.max(sell, buy + prices[i]);
            result = Math.max(result, sell);
        }
        return result;
    }

    public static void main(String[] args) {

    }


}
