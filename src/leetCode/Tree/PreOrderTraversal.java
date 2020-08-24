package leetCode.Tree;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
	
	public List<Integer> preorderTraversal(TreeNode root) {

		List<Integer> result = new ArrayList<Integer>();
		traverse(root, result);
		return result;

	}

	public void traverse(TreeNode root, List<Integer> result) {

		if (root == null) {
			return;
		}
		result.add(root.val);
		traverse(root.left, result);
		traverse(root.right, result);

	}
}
