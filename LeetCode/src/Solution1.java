import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Huang Chengqian
 * @date 2020/11/22 16:53
 */
public class Solution1 {
    public boolean isAnagram(String s, String t) {
        if (t.length() != s.length()) {
            return false;
        }
        Map<Character, Integer> set = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (set.containsKey(ch)) {
                set.put(ch, set.get(ch) + 1);
            }
            else {
                set.put(ch, 1);
            }
        }
        for (int i = 0; i < t.length(); ++i) {
            char ch = t.charAt(i);
            if (!set.containsKey(ch)) {
                return false;
            }
            int temp = set.get(ch) - 1;
            if (temp <= 0) {
                set.remove(ch);
            }
            else {
                set.put(ch, temp);
            }
        }
        return true;
    }
}
