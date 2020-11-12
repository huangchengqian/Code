
/**
 * author: Huang Chengqian
 * 20201112
 */
public class QuickSort {
    /**
     * 快速排序
     * @param arr 待排序数组
     * @param left 左边界（包含）
     * @param right 右边界（不包含）
     */
    static void quickSort(int[] arr, int left, int right) {
        if (left < right - 1) {
            int low = left, high = right - 1, cur = arr[left];
            // 进入条件
            while (low < high) {
                // 从右向左找第一个数
                while (low < high && cur < arr[high]) {
                    --high;
                }
                if (low < high) {
                    arr[low] = arr[high];
                }
                // 从左向右找第一个数
                while (low < high && cur >= arr[low]) {
                    ++low;
                }
                if (low < high) {
                    arr[high] = arr[low];
                }
            }
            arr[low] = cur;
            // 对两边进行排序
            quickSort(arr, left, low);
            quickSort(arr, low + 1, right);
        }
    }

}
