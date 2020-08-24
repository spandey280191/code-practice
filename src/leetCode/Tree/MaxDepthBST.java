package leetCode.Tree;

public class MaxDepthBST {

	public int maxDepth(TreeNode root) {

		if (null == root) {
			return 0;
		}

		return findDepth(root, 0);

	}

	public int findDepth(TreeNode root, int length) {

		if (root == null) {
			return length;
		}

		int length_left = findDepth(root.left, length);
		int length_right = findDepth(root.right, length);

		if (length_left > length_right) {
			return length_left + 1;
		} else {
			return length_right + 1;
		}

	}
}
