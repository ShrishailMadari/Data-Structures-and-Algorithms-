package binarytressimplementation;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}
public class MaxMinSumHeightNodeOfTree {
    public static void main(String[] args) {
        Node root = new Node(100);
        Node a = new Node(200);
        Node b = new Node(300);
        root.left = a;
        root.right = b;
        Node c = new Node(400);
        Node d = new Node(500);
        a.left = c;
        b.right = d;
        System.out.println(maxNode(root));
        System.out.println(sumOfNodes(root));
        System.out.println(heigth(root));
    }

    private static int heigth(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 0;
        return 1+ Math.max(heigth(root.left),heigth(root.right));
    }

    private static int sumOfNodes(Node root) {

        if (root == null){
            return 0;
        }
        return root.data + sumOfNodes(root.left)+sumOfNodes(root.right);
    }

    private static int maxNode(Node root) {
        if(root == null)
            return 0;
        int a = maxNode(root.left);
        int b = maxNode(root.right);
        return Math.max(root.data ,Math.max(a,b));
    }
}
