/*

Leetcode : 897

Given the root of a binary search tree, rearrange the tree in in-order 
so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.

*/
import java.util.ArrayList;

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

class IncreasingOrderSearchTree {
    
    ArrayList<TreeNode> list = new ArrayList<>();
    
    public TreeNode increasingBST(TreeNode root) {
        
        if(root == null) return null;
        
        inOrder(root);
        
        for(int i = 0; i < list.size() - 1; i++){
         
            list.get(i).right = list.get(i+1);
            list.get(i).left = null;
            
        }
        list.get(list.size() - 1).left = null;
        list.get(list.size() - 1).right = null;
        
        return list.get(0);
    }
     public void inOrder(TreeNode node){
            if(node == null) return;
            
            inOrder(node.left);
            list.add(node);
            inOrder(node.right);
            
        }
}
