package linkedlist.length;

public class FindingLength {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        int len = lengthOfLinkedList(a);
        System.out.println("length is: "+len);
        System.out.println();

        System.out.println(lengthOfLLRecursion(a));
    }

    private static int lengthOfLinkedList(Node head) {
        int count = 0;
        while (head != null){
            count++;
            head = head.next;
        }
        return count;
    }

    private static int lengthOfLLRecursion(Node head) {
        int count =0;
        if (head == null)
            return 0;
        count++;
        return count + lengthOfLLRecursion(head.next);
    }
}
