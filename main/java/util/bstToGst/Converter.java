package util.bstToGst;

import javax.swing.tree.TreeNode;

/**
 * Converts Binary Search Tree to Greatest Sum Tree
 */
public class Converter {
    /*
        public TreeNode bstToGst(TreeNode root) {
            int sum = 0;
            int n = dfs(root, sum);

            return root;
        }

        public static int dfs(TreeNode node, int sum){
            if(node==null){
                return 0;
            }

            int r = dfs(node.right, sum);
            node.val = node.val + Math.max(r, sum);

            int l = dfs(node.left, node.val);

            return Math.max(l, node.val);
        }

     */
}
