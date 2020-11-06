package leetCode.TopInterviewQuestion.Medium.Design.SerializeandDeserializeBinaryTree;


import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
        int val;
     TreeNode left;
      TreeNode right;
     TreeNode(int x) { val = x; }
  }

 class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        String val=""+root.val;
        while (queue.peek()!=null){
            TreeNode node = queue.poll();

            if(node.left!=null){
                queue.add(node.left);
                val = val + "," +node.left.val;
            }else{
                val = val + "," + null;
            }

            if(node.right!=null){
                queue.add(node.right);
                val = val + "," + node.right.val;
            }else{
                val = val + "," + null;
            }
        }

        System.out.println(val);

        return val;
    }

    //123nullnull45nullnullnullnull


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        TreeNode root = new TreeNode(Integer.valueOf(data.substring(0,1)));
        TreeNode current = root;
        String[] arr = data.split(",");
        buildTree(current,arr,1);
        return root;
    }

    public void buildTree(TreeNode current, String[] arr, int i){

        if(i>=arr.length){
            return;
        }

        String val = arr[i];
        if(val.equals("null")){
            current.left = null;
        }else{
           TreeNode node = new TreeNode(Integer.valueOf(arr[i]));
           current.left = node;
        }

        val = arr[i+1];
        if(val.equals("null")){
            current.right = null;
        }else{
            TreeNode node = new TreeNode(Integer.valueOf(arr[i+1]));
            current.right = node;
        }
        if(null!=current.left){
            i= i +2;
            buildTree(current.left,arr,i);
        }
        if(null!=current.right){
            i= i +2;
            buildTree(current.right,arr,i);
        }



    }

     public static void main(String[] args) {
         Codec c = new Codec();
         String data = "1,2,3,null,null,4,5,null,null,null,null";
         c.deserialize(data);
     }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));