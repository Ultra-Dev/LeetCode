package array.双指针.lc_48;

import java.util.HashSet;
import java.util.Set;

/**
 * 48. 最长不含重复字符的子字符串
 * @author xiangliang
 * @time 2020/3/11 20:59
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {

        if (s.length() == 0 || s == null) {
            return 0;
        }

        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }

    public static void main(String[] args) {



    }

}
