package leetCode.TopInterviewQuestion.Medium.TreesAndGraphs.ConstructBinaryTreefromPreorderandInorderTraversal;

import leetCode.TopInterviewQuestion.Medium.TreesAndGraphs.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {


        return build(0,0,inorder.length-1,preorder,inorder);

    }

    public TreeNode build(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {

        if(preStart>=preorder.length || inStart>inEnd){
            return  null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);
        int inIndex=0;
        for(int i=inStart; i<= inEnd ; i++){

            if(preorder[preStart]==inorder[i]){
                inIndex = i;
            }

        }

        root.left = build(preStart+1, inStart , inIndex-1,preorder,inorder);
        root.right=build(preStart + 1 + inIndex - inStart,inIndex+1, inEnd,preorder,inorder);

        return  root;
    }


    // HashMap Optimization

    public TreeNode buildTreeOptimized(int[] preorder, int[] inorder) {

            Map<Integer, Integer> inMap = new HashMap<Integer, Integer>();

            for(int i = 0; i < inorder.length; i++) {
                inMap.put(inorder[i], i);
            }

            return buildOptimized(0,0,inorder.length-1,preorder,inMap);

    }

    public TreeNode buildOptimized(int preStart, int inStart, int inEnd, int[] preorder, Map<Integer, Integer> inMap) {

        if(preStart>=preorder.length || inStart>inEnd){
            return  null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);
        int inIndex=inMap.get(preorder[preStart]);

        root.left = buildOptimized(preStart+1, inStart , inIndex-1,preorder,inMap);
        root.right=buildOptimized(preStart + 1 + inIndex - inStart,inIndex+1, inEnd,preorder,inMap);

        return  root;
    }







    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        Solution s = new Solution();
        s.buildTree(preorder, inorder);
    }
}