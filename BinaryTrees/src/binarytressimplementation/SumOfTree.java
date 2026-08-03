package binarytressimplementation;

public class SumOfTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        Node a = new Node(60);
        Node b = new Node(30);
        root.left = a;
        root.right = b;

        Node c = new Node(50);
        Node d = new Node(40);
        a.left = c;
        a.right = d;
        Node e = new Node(10);
        b.left = e;

        System.out.println(sumOfTree(root));
    }

    private static int sumOfTree(Node root) {
        if (root == null ) return 0;
        int a = sumOfTree(root.left);
        int b = sumOfTree(root.right);
        return root.data + a+b;
    }
}
