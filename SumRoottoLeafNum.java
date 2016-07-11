/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int sumNumbers(TreeNode root) {
        return sumHelper(root, 0);
    }
    
    private int sumHelper(TreeNode root, int levelBase){
        if (root == null){
            return 0;
        }
        
        if (root.left == null && root.right == null){
            return levelBase+root.val;
        }
        
        int nextlevelBase = (levelBase+root.val)*10;
        int leftValue = sumHelper(root.left, nextlevelBase);
        int rightValue = sumHelper(root.right, nextlevelBase);
        
        return leftValue + rightValue;
    }
}