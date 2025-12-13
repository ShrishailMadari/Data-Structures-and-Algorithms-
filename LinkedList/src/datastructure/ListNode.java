package datastructure;

public class ListNode {
//    creation of List Node
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(20);
        System.out.println(node);
        System.out.println(node.data);
        System.out.println(node.next);
        System.out.println(node.next.data);

    }
}
