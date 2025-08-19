package NeetCode.trees;

// Definition of TreeNode in Java

class TreeNodeX {
    int val;
    TreeNodeX left;
    TreeNodeX right;

    public TreeNodeX(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}


public class BinarySearchTree {

    public boolean search(TreeNode root, int target) {
        if (root == null) {
            return false;
        }
        if (target > root.val) {
            return search(root.right, target);
        } else if (target < root.val) {
            return search(root.left, target);
        } else {
            return true;
        }
    }
}

