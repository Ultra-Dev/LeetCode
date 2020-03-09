package dp.lc_121;

/**
 * 121. 卖股票的最佳时机
 * @author xiangliang
 * @time 2020/3/9 13:46
 * @url https://www.bilibili.com/video/av93882056
 */
public class Solution {

    public static int maxProfit(int[] prices) {
        int cur = 0;
        int result = 0;

        for (int i = 1; i < prices.length; i++) {
            cur = Math.max(0, cur + prices[i] - prices[i - 1]);
            result = Math.max(cur, result);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test_1 = {7, 6, 4, 3, 1};
        int[] test_2 = {7, 1, 5, 3, 6, 4};
        Solution.maxProfit(test_2);
    }
}
