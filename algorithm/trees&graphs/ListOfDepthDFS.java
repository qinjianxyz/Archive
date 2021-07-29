import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.tree.TreeNode;

public class ListOfDepthDFS {
    public static void createLevelLinkedListDFS(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level) {
        if (root == null)
            return; // base case
        LinkedList<TreeNode> list = null;
        if (lists.size() == level) {
            list = new LinkedList<>();
            lists.add(list);
        } else {
            list = lists.get(level);
        }
        list.add(root);
        createLevelLinkedListDFS(root.left, lists, level + 1);
        createLevelLinkedListDFS(root.right, lists, level + 1);
    }

    public static ArrayList<LinkedList<TreeNode>> createLeveLinkedLists(TreeNode root) {
        ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
        createLeveLinkedLists(root, lists, 0);
        return lists;
    }
}
