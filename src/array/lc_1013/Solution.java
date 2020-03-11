package array.lc_1013;

/**
 * 1013. 将数组分成和相等的三个部分
 * @author xiangliang
 * @time 2020/3/11 13:54
 */
public class Solution {

    public boolean canThreePartsEqualSum(int[] A) {

        int sum = 0;

        for (int num : A) {
            sum += num;
        }
        if (sum % 3 != 0) {
            return false;
        }

        int cur = 0;
        int flag = 0;

        for (int num : A) {
            cur += num;
            if (cur == sum / 3) {
                flag++;
                cur = 0;
            }
        }
        return flag >= 3;
    }

    public static void main(String[] args) {

        int[] test = {0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1};

    }

}
