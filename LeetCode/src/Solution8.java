/**
 * @author Huang Chengqian
 * @date 2020/12/4 9:59
 */
public class Solution8 {
    class Solution {
        /**
         * 分割数组为连续子序列
         * @param nums
         * @return
         */
        public boolean isPossible(int[] nums) {
            boolean repeat = false;
            int count = 0, lastNum = -Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; ++i) {
                int num = nums[i];
                if (num == lastNum) {
                    repeat = true;
                }

                lastNum = num;
            }
            return true;
        }
    }
}
