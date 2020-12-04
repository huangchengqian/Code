import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Huang Chengqian
 * @date 2020/12/2 9:44
 */
public class Solution7 {
    /**
     * 移除K个数
     * 单调栈
     * @param num
     * @param k
     * @return
     */
    public String removeKdigits(String num, int k) {
        Deque<Character> stack = new LinkedList<>();
        int len = num.length();
        for (int i = 0; i < len; ++i) {
            char ch = num.charAt(i);
            while (!stack.isEmpty() && k > 0 && stack.peek() > ch) {
                stack.pop();
                k--;
            }
            stack.push(ch);
        }
        while (k > 0) {
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        boolean pre = true;
        while (!stack.isEmpty()) {
            if (pre && stack.peek() == '0') {
                stack.pop();

                continue;
            }
            pre = false;
            sb.insert(0, stack.pop());
        }
        if(sb.length() == 0) {
            return "0";
        }
        return sb.toString();
    }
}
