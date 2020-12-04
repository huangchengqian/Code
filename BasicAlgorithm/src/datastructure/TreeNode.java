package datastructure;

/**
 * @author Huang Chengqian
 * @date 2020/12/2 9:48
 */
public class TreeNode {
    int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
