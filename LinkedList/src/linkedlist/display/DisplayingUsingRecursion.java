package linkedlist.display;

public class DisplayingUsingRecursion {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(9);
        Node node2 = new Node(19);
        Node node3 = new Node(92);
        Node node4 = new Node(93);
        Node node5 = new Node(90);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        displayLLR(node1);

    }

    private static void displayLLR(Node head) {
        if(head == null){
            return;
        }
        displayLLR(head.next);
        System.out.print(head.data+" ");

    }
}
