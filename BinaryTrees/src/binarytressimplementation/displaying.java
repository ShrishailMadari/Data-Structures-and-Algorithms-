package binarytressimplementation;

public class displaying {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val =val;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(2); // giving the value inside the Node from constructor
        //root.left: initially null
        //root.right: initially null
        Node a = new Node(4); //creating new nodes just nodes are created
        Node b = new Node(10);

        root.left = a; // now nodes are interconnected from root node
        root.right = b;
        Node c = new Node(6); // again creating nodes for Left right node
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(11);
        b.right = e;
        displayTree(root);

    }

    private static void displayTree(Node root) {
        if(root == null) return;
        System.out.print(root.val+" -> ");
        if (root.left != null) {
            System.out.print(root.left.val + " ");
        }else System.out.print(" n ");
        if(root.right != null) {
            System.out.print(root.right.val + " "); //ln is for next line
        }else System.out.print(" n ");
        System.out.println();
        displayTree(root.left); // left node will be acting as root : possible is null
        displayTree(root.right); // right node will be acting as root : possible is null

    }
}
