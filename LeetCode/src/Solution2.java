import javax.swing.tree.TreeNode;
import java.awt.*;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TransferQueue;

/**
 * @author Huang Chengqian
 * @date 2020/11/22 17:07
 */
class Solution2 {
    Integer count = new Integer(0);
    public int countNodes(TreeNode root) {
        travel(root);
        return count;
    }
    private void travel(TreeNode tree) {
        if (tree == null) {
            return;
        }
        count++;
        if (tree.left != null) {
            travel(tree.left);
        }
        if (tree.right != null) {
            travel(tree.right);
        }
    }
}
