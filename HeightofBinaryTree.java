//https://leetcode.com/problems/maximum-depth-of-binary-tree/
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int lh = maxDepth(root.left)+1;
        int rh = maxDepth(root.right)+1;
        return Math.max(lh,rh); 
        
    }
}
