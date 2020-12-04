import datastructure.TreeNode;

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
