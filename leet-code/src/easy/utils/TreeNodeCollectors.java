package easy.utils;

import domain.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNodeCollectors {

    public static TreeNode fromIntArray(Integer[] ints) {

        if (ints.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(ints[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int idx = 1;

        while (!queue.isEmpty() && idx < ints.length) {
            TreeNode node = queue.poll();

            node.left = new TreeNode(ints[idx]);
            queue.add(node.left);
            idx++;

            if (idx < ints.length) {
                node.right = new TreeNode(ints[idx]);
                queue.add(node.right);
            }
            idx++;
        }
        return root;
    }

    public static TreeNode fromIntArrayWithNullValue(Integer[] ints) {

        if (ints.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(ints[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int idx = 1;

        while (!queue.isEmpty() && idx < ints.length) {
            TreeNode node = queue.poll();

            if(idx<ints.length && ints[idx]!=null) {
                node.left = new TreeNode(ints[idx]);
                queue.add(node.left);

            }
            idx++;

            if (idx < ints.length && ints[idx]!=null) {
                node.right = new TreeNode(ints[idx]);
                queue.add(node.right);
            }
            idx++;
        }
        return root;
    }

    public static Integer[] fromTreeNode(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return new Integer[0];
        }
        List<Integer> list = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return list.toArray(Integer[]::new);
    }

}
