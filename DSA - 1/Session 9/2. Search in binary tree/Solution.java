// Time  : O(n)
// Space : O(1)

import java.util.*;
import crio.ds.Tree.TreeNode;

/*
// Definition of TreeNode
public class TreeNode {
    public long val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode (long x) {
        val = x;
        left = null;
        right = null;
    }
}

Use new TreeNode(data) to create new Node
*/
public class Solution {
    public boolean binaryTreeSearching(TreeNode root, int k) {
        if(root == null){
            return false;
        }
        if(root.val == k){
            return true;
        }

        if(binaryTreeSearching(root.left, k)) return true;
        
        return binaryTreeSearching(root.right, k);
    }
}
