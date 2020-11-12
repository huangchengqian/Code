import javafx.scene.AmbientLight;

import java.util.Arrays;

public class Solution1 {
    /**
     * 最长公共子序列
     * 动态规划解法
     * @param str1
     * @param str2
     * @return
     */
    public String LCS (String str1, String str2) {
        // write code here
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        int a = 0, max = 0;
        Arrays.fill(dp,0);
        for (int i = 1; i < dp.length; ++i) {
            for (int j = 1; j < dp[0].length; ++j) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = Math.max(1, dp[i - 1][j - 1] + 1);
                }
                else {
                    dp[i][j] = 0;
                }
                if (max <= dp[i][j]) {
                    max = dp[i][j];
                    a = i;
                }
            }
        }
        return str1.substring(a - max, a);
    }
}
