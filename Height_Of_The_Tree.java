public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int d) {
        data = d;
        left = null;
        right = null;
    }
}

public class Tree {
    TreeNode root;

    int height(TreeNode node) {
        if (node == null) {
            return -1;
        } else {
            return 1 + Math.max(height(node.left), height(node.right));
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        int height = tree.height(tree.root);
        System.out.println("Height of the tree: " + height);
    }
}