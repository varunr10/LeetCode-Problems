/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        double level_sum = 0;
        while(!queue.isEmpty()) {
            level_sum = 0;
            int size = queue.size();
            
            for(int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                level_sum += curr.val;
                
                if(curr.left != null) 
                    queue.offer(curr.left);
                if(curr.right != null) 
                    queue.offer(curr.right);
            }
            double level_average = level_sum / size;
            result.add(level_average);            
        }
        return result;
    }
}
