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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        //Since we need to traverse the tree with left - > right - > root order. 
        //We can use stack data structure to maintain this order. 
        
        /* After checking with Google and some solution, using ArrayList cannot get the order we want, 
           for example, input[1,2] should return [2,1] but ArrayList will give [1,2]. Therefore, according
           to some hints, using LinkedList can help us to reversely store the order.*/
           
        // List<Integer> res = new ArrayList<>();
        LinkedList<Integer> res = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode r = root;
        while (!stack.isEmpty() || r != null){
            if (r != null){
                stack.push(r);
                res.addFirst(r.val);
                r = r.right;
            } else{
                TreeNode temp = stack.pop();
                r = temp.left;
            }
        }
        
        return res;
    }
}