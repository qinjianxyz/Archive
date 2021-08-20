public class Successor {
    static TreeNode findNext(TreeNode n) {
        if (n == null)
            return null;
        if (n.right != null) {
            return leftMostChild(n.right);
        } else {
            TreeNode q = n;
            TreeNode x = q.parent;
            while (x != null && x.left != q) {
                q = x;
                x = q.parent;
            }
            return x;
        }
    }

    static TreeNode leftMostChild(TreeNode n) {
        if (n == null)
            return null;
        while (n.left != null) {
            n = n.left;
        }
        return n;
    }
}
