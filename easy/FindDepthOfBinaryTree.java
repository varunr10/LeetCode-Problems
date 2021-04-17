package data.structures.course.recursion;

public class FindDepthOfBinaryTree {

	public static int findDepth(TreeNode root) {

		if(root == null) return 0;

		int left = findDepth(root.left);
		int right = findDepth(root.right);

		return Math.max(left,right) + 1;
	}
	
	public static void main(String[] args) {
		
		TreeNode nine = new TreeNode(9,null,null);
		TreeNode fifteen = new TreeNode(15,null,null);
		TreeNode seven = new TreeNode(7,null,null);
		TreeNode twenty = new TreeNode(20,fifteen,seven);
		TreeNode three = new TreeNode(3,nine,twenty);
		
		System.out.println(findDepth(three));
	}
}

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
