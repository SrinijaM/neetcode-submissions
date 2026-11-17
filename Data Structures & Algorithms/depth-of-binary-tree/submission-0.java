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
    public int maxDepth(TreeNode root) {
        int res=0;
        if(root!=null)
        res=helper(root,1);

        return res;
    }

    int helper(TreeNode root,int res){
        if(root==null)return res-1;

res=Math.max(helper(root.right,res+1),helper(root.left,res+1));  
//System.out.println("root"+root.val+" res"+res);
return res;
    }
}
