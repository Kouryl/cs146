import java.util.ArrayList;
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) { //HW9
        TreeNode ancestor = root;
       if (p.val < root.val && q.val > root.val || p.val > root.val && q.val < root.val) {
           return ancestor;
       } else if (p.val < root.val && q.val < root.val) {
           ancestor = lowestCommonAncestor(root.left, p, q);
       } else if (p.val > root.val && q.val > root.val) {
           ancestor =  lowestCommonAncestor(root.right, p, q);
       }
       return ancestor;
    }
}