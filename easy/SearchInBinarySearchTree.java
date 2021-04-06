
/*You are given the root of a binary search tree (BST) and an integer val.

Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null

Input: root = [4,2,7,1,3], val = 2
Output: [2,1,3]

 */

//Definition for a binary tree node.
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

class SearchInBinarySearchTree {
	public TreeNode searchBST(TreeNode root, int value) {

		if(root == null) return null;
		if(root.val == value) return root;

		if(value < root.val)
			return searchBST(root.left,value);
		else
			return searchBST(root.right,value);

	}
}
