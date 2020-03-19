package 贪心.lc_409;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * https://leetcode-cn.com/problems/longest-palindrome/solution/javade-2chong-shi-xian-fang-fa-by-sweetiee/
 */
public class Solution {

    public int longestPalindrome(String s) {
        Map<Integer, Integer> count = s.chars().boxed()
                .collect(Collectors.toMap(k -> k, v -> 1, Integer::sum));

        int ans = count.values().stream().mapToInt(i -> i - (i & 1)).sum();
        return ans < s.length() ? ans + 1 : ans;
    }


    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("aaaaccb"));
    }

}
