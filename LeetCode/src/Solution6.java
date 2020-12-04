import com.sun.org.apache.xerces.internal.impl.xpath.regex.REUtil;

/**
 * @author Huang Chengqian
 * @date 2020/12/1 9:31
 */
public class Solution6 {
    public int[] searchRange(int[] nums, int target) {
        int cur = binarySearch(nums, 0, nums.length, target);
        int[] ret = {-1, -1};
        if (cur == -1) {
            return ret;
        }
        int temp = cur, cache = nums[cur];
        while (cur >= 0) {
            if (cache == nums[temp]) {
                ret[0] = temp;
            }
            temp--;
        }
        temp = cur;
        while (cur < nums.length) {
            if (cache == nums[temp]) {
                ret[1] = temp;
            }
            temp++;
        }
        return ret;
    }
    int binarySearch(int[] nums, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (target > nums[mid]) {
            return binarySearch(nums, mid + 1, right, target);
        }
        else if (target < nums[mid]) {
            return binarySearch(nums, left, mid - 1, target);
        }
        return mid;
    }

    public static void main(String[] args) {
        int[] a = {5,7,7,8,8,10};
        int v = new Solution6().binarySearch(a, 0, 5, 7);
        System.out.println(v);
    }
}
