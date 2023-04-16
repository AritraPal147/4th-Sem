// 3. Demonstrate Breadth-First Search (BFS) and Depth-First-Search Tree using Java.

import java.util.LinkedList;
import java.util.Queue;

class BinaryTree {
    Node root;

    private class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node node, int data) {
        if (node == null) 
            node = new Node(data);
        else {
            if (data <= node.data) 
                node.left = insert(node.left, data);
            else 
                node.right = insert(node.right, data);
        
        }
        return node;
    }

    public void breadthFirstSearch() {
        if (root == null) 
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            System.out.print(node.data + " ");
            if (node.left != null) 
                queue.add(node.left);
            if (node.right != null) 
                queue.add(node.right);
        }
        System.out.println();
    }

    public void depthFirstSearch() {
        if (root == null) 
            return;
        
        dfsHelper(root);
        System.out.println();
    }

    private void dfsHelper(Node node) {
        if (node == null) 
            return;
        
        System.out.print(node.data + " ");
        dfsHelper(node.left);
        dfsHelper(node.right);
    }
}

public class Q3_DFS_BFS {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(1);
        tree.insert(9);
        System.out.print("BFS: ");
        tree.breadthFirstSearch();
        System.out.print("DFS: ");
        tree.depthFirstSearch();
    }
}
