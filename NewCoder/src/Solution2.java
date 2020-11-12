import sun.misc.Queue;

import java.sql.SQLOutput;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution2 {
    /**
     * 合法的括号序列
     * @param s
     * @return
     */
    public boolean isValid (String s) {
        // write code here
        int cur = 0;
        Deque<Character> stack = new LinkedList<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(']', '[');
        map.put(')', '(');
        map.put('}', '{');
        while (cur < s.length()) {
            char ch = s.charAt(cur);

            if (ch == '[' || ch == '(' || ch == '{') {
                stack.push(ch);
            }
            else {
                if (stack.isEmpty() || stack.pop() != map.get(ch)) {
                    return false;
                }
            }
            cur++;
        }
        return stack.isEmpty();
    }


}
