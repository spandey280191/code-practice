package leetCode.TopInterviewQuestion.Medium.TreesAndGraphs.BinaryTreeZigzagLevelOrderTraversal;

import leetCode.TopInterviewQuestion.Medium.TreesAndGraphs.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        zigZagTraverse(root,result,0);
        return result;
    }

    public void zigZagTraverse(TreeNode root , List<List<Integer>> result , int level){

        if(root==null){
            return;
        }

        if(result.size()==level){

            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            result.add(list);
        }else{
            if(level%2==0){
                result.get(level).add(root.val);
            }else{
                result.get(level).add(0,root.val);
            }

        }


        zigZagTraverse(root.left,result,level+1);
        zigZagTraverse(root.right,result,level+1);

    }

    public static void main(String[] args) {
//[3,9,20,null,null,15,7]
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n3.right =n5;

        Solution s = new Solution();
        s.zigzagLevelOrder(n1);

    }
}
