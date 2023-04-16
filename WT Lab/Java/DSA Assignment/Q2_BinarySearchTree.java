// 2. Implement a binary search tree and perform searching for an element in Java.

class BinarySearchTree {
    Node root;

    private class Node {
        private int data;
        private Node left;
        private Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    void insert(Node node, int data) {
        if (node == null)
            node = new Node(data);
        else {
            if (data <= node.data)
                insert(node.left, data);
            else
                insert(node.right, data);
        }
        root = node;
    }

    boolean search(Node node, int data) {
        if (node == null)
            return false;
        if (data == node.data)
            return true;
        else if (data < node.data)
            return search(node.left, data);
        else
            return search(node.right, data);
    }
}

public class Q2_BinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(tree.root, 12);
        tree.insert(tree.root, 4);
        tree.insert(tree.root, 6);
        tree.insert(tree.root, 10);
        tree.insert(tree.root, 0);

        if (tree.search(tree.root, 1))
            System.out.println("Found 1 in tree");
        else
            System.out.println("1 not found in tree");
    }
}
