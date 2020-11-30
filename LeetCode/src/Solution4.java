import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Arrays;

/**
 * @author Huang Chengqian
 * @date 2020/11/25 10:13
 */
public class Solution4 {
    /**
     * 上升下降字符串
     * @param s
     * @return
     */
    public String sortString(String s) {
        int[] bucket = new int[26];
        // 建桶
        for (int i = 0; i < s.length(); ++i) {
            bucket[s.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        int cache;
        while (sb.length() < s.length()) {
            cache = 26;
            // 从前往后遍历桶
            for (int i = 0; i < 26; ++i) {
                if (bucket[i] > 0 && i != cache) {
                    bucket[i]--;
                    sb.append((char)(i + 'a'));
                    cache = i;
                }
            }
            cache = 26;
            // 从后往前遍历桶
            for (int i = 25; i >= 0; --i) {
                if (bucket[i] > 0 && i != cache) {
                    bucket[i]--;
                    sb.append((char)(i + 'a'));
                    cache = i;
                }
            }

        }
        return sb.toString();
    }
}
