package leetCode.MonthlyChallenge.AverageofLevelsinBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        list.add(Double.valueOf(root.val));
        Double temp=0.0;
        while(!queue.isEmpty()){
            temp=0.0;
            int size = queue.size();
            int count=0;
            for (int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if(node.left!=null){
                    queue.add(node.left);
                    temp = temp+node.left.val;
                    count++;
                }
                if(node.right!=null){
                    queue.add(node.right);
                    temp = temp+node.right.val;
                    count++;
                }
            }
            if(count!=0){
                list.add(temp/(double)count);
            }

        }

        return list;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
      //  s.averageOfLevels()
    }
}
