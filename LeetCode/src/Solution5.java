import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Huang Chengqian
 * @date 2020/11/30 15:55
 */
public class Solution5 {

    public String reorganizeString(String S) {
        int len = S.length(), sup = 0;
        if (len <= 1) {
            return S;
        }
        // 使用计数排序统计字符频次
        int[] counts = new int[26];
        // 统计元素并进行可行性判断
        for (int i = 0; i < len; ++i) {
            sup = Math.max(++counts[S.charAt(i) - 'a'], sup);
        }
        if (sup > (len + 1) / 2) {
            return "";
        }
        // 使用优先队列获取最大元素
        // 自定义比较器
        PriorityQueue<Character> heap = new PriorityQueue<Character>(new Comparator<Character>() {
            public int compare(Character l1, Character l2) {
                return counts[l2 - 'a'] - counts[l1 - 'a'];
            }
        });
        // 建堆
        for (int i = 0; i < counts.length; ++i) {
            if (counts[i] != 0) {
                heap.offer((char)(i + 'a'));
            }
        }
        StringBuilder sb = new StringBuilder();
        // 每次从堆中取出两个字符
        while (heap.size() > 1) {
            char ch1 = heap.poll();
            char ch2 = heap.poll();
            sb.append(ch1);
            sb.append(ch2);
            if (--counts[ch1 - 'a'] > 0) {
                heap.offer(ch1);
            }
            if (--counts[ch2 - 'a'] > 0) {
                heap.offer(ch2);
            }
        }
        // 奇数情况
        if (!heap.isEmpty()) {
            sb.append(heap.peek());
        }
        return sb.toString();
    }
}
