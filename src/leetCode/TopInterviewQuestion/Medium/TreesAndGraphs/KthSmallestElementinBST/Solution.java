package leetCode.TopInterviewQuestion.Medium.TreesAndGraphs.KthSmallestElementinBST;

import leetCode.TopInterviewQuestion.Medium.TreesAndGraphs.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int kthSmallest(TreeNode root, int k) {

        List<Integer> list = new ArrayList<>();
        inOrderTraversal(root,list);
        return list.get(k);

    }

    public void inOrderTraversal(TreeNode node,List<Integer> list){

        //base condition
        if(node==null){
            return;
        }

        inOrderTraversal(node.left,list);
        list.add(node.val);
        inOrderTraversal(node.right,list);

    }
}
