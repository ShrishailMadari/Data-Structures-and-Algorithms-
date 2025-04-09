package binarytressimplementation;

public class Traversal {
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        b.right = e;
        preOrderTree(root);
        sizeOfTree(root);
    }

    private static int sizeOfTree(Node root) {
        if (root == null) return 0;
        return 1+sizeOfTree(root.left)+sizeOfTree(root.right);
    }

    private static void preOrderTree(Node root) {
        if(root ==  null) return;
        System.out.print(root.val+" ");
//        System.out.print(root.left+" "); no need in just printing the order
//        System.out.print(root.right+" ");
        preOrderTree(root.left);
        preOrderTree(root.right);

    }
}
