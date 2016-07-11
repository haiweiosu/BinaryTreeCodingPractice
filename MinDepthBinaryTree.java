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
    public int minDepth(TreeNode root) {
        int min = 0; 
        if (root == null){
            return 0; 
        }
        else if (root.right == null && root.left != null){
            return minDepth(root.left)+1;
        }
        else if (root.left == null && root.right != null){
            return minDepth(root.right)+1;
        }
        else if (root.left == null && root.right == null){
            return 1;
        }
        else{
            int temp1 = minDepth(root.left);
            int temp2 = minDepth(root.right);
            if (temp1<=temp2){
                return temp1+1;
            }
            else{
                return temp2+1;
            }
        }
        
    }
}