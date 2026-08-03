package treestraversal;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class PreOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(3);
        Node b = new Node(4);
        root.left = a;
        root.right = b;
        Node c = new Node(5);
        Node d = new Node(6);
        a.left = c;
        b.right = d;
        preOrderTraversal(root);
        System.out.println("+++++++++++++++++++++++++++++++++++");
        inOrderTraversal(root);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        postOrderTraversal(root);
    }

    private static void inOrderTraversal(Node root) {
        if (root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.val);
        inOrderTraversal(root.right);
    }

    private static void preOrderTraversal(Node root) {

        if (root == null){
            return;
        }
        System.out.println(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    private static void postOrderTraversal(Node root) {
        if (root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.val);

    }
}
