package leetCode.MonthlyChallenge.ConvertBSTtoGreaterTree;

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

public class Solution {
    public TreeNode convertBST(TreeNode root) {

        List<Integer> list = new ArrayList<Integer>();
        updateTreeNode(root,list);
        return root;
    }

    public void updateTreeNode(TreeNode root, List<Integer> list){

        if(null==root){
            return;
        }

        updateTreeNode(root.right,list);
        if(list.isEmpty()){
            list.add(root.val);
        }else{
            root.val=root.val + list.get(list.size()-1);
            list.add(root.val);
        }
        updateTreeNode(root.left,list);
    }

    public  static void main(String args[]){
        Solution s = new Solution();
        TreeNode root = new TreeNode(3);
        TreeNode one = new TreeNode(2);
        TreeNode two = new TreeNode(4);
        TreeNode three = new TreeNode(1);
        root.left=one;
        root.right=two;
        one.left=three;
        s.convertBST(root);
    }
}
