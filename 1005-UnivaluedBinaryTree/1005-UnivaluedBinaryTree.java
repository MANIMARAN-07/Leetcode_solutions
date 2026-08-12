// Last updated: 12/08/2026, 11:12:13
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private boolean isuni(TreeNode root, int val){
        if(root == null) return true;
        if(root.val != val) return false;
        boolean l = isuni(root.left, val);
        boolean r = isuni(root.right, val);
        return (l && r);
    }

    public boolean isUnivalTree(TreeNode root) {
        int val = root.val;
        return isuni(root,val);
    }
}