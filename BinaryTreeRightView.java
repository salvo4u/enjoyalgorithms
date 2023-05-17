//https://leetcode.com/problems/binary-tree-right-side-view/
class Solution {
     public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans = new ArrayList<>(); //to store the values of right side view

        helper(root, ans, 0); // a helper function to find the right side values

        return ans;
        
    }

    private void helper(TreeNode root, List<Integer> ans, int level){

        if(root == null) return; //if root is null (base condition)

        if(level == ans.size()){ //this line finds the right side values of the tree as the recursive call is given first for the right side and then the left
            ans.add(root.val);
        }

        helper(root.right, ans, level + 1);
        helper(root.left, ans, level + 1);

    }
}
