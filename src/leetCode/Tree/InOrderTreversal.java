package leetCode.Tree;

import java.util.ArrayList;
import java.util.List;



  class TreeNode {
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
  }

class InOrderTreversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<Integer>();
        traverse(root,result);
        return result;
        
    }
    
    public void traverse(TreeNode root, List<Integer> result){
        
        if(root==null){
            return;
        }
        traverse(root.left,result);
        result.add(root.val);
        traverse(root.right,result);    
        
    }
}

