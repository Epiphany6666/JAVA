package title.LCP_67_装饰树;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {this.val = val;};
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class test {
}

/*
class Solution {
    public TreeNode expandBinaryTree(TreeNode root) {
        dfs(root);
        return root;
    }

    private void dfs(TreeNode root) {
        if (root.left != null) {
            TreeNode t = new TreeNode(-1);
            t.left = root.left;
            root.left = t;
            expandBinaryTree(t.left);
        }
        if (root.right != null) {
            TreeNode t = new TreeNode(-1);
            t.right = root.right;
            root.right = t;
            expandBinaryTree(t.right);
        }
    }
}*/

//学一学灵神简介的代码！
class Solution {
    public TreeNode expandBinaryTree(TreeNode root) {
        if (root.left != null)
            root.left = new TreeNode(-1, expandBinaryTree(root.left), null);

        if (root.right != null)
            root.right = new TreeNode(-1, null, expandBinaryTree(root.right));

        return root;
    }
}