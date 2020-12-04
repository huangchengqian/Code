package algorithm;

/**
 * @author Huang Chengqian
 * @date 2020/11/24 21:17
 */
public class Max {
    public static int max(int... list) {
        int temp = Integer.MIN_VALUE;
        for (int num : list) {
            temp = Math.max(temp, num);
        }
        return temp;
    }
}
