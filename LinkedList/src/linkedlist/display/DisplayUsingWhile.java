package linkedlist.display;

public class DisplayUsingWhile {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(12);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(7);
        Node f = new Node(9);
        Node g = new Node(89);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;


//        Node temp = a;
//        while (temp != null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
        display(a);
    }
}
