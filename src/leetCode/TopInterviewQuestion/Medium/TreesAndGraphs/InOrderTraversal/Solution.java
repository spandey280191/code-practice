package leetCode.TopInterviewQuestion.Medium.TreesAndGraphs.InOrderTraversal;

import leetCode.TopInterviewQuestion.Medium.TreesAndGraphs.TreeNode;

import java.util.ArrayList;
import java.util.List;


public class Solution {
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