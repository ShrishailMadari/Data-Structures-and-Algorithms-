package linkedlist.reverse;
class Node100{
    int data;
    Node100 next;

    public Node100(int data) {
        this.data = data;
    }
}
public class ReverseLinkedList {
    public static void main(String[] args) {
        Node100 a = new Node100(3);
        Node100 b = new Node100(5);
        Node100 c = new Node100(2);
        Node100 d = new Node100(1);
        Node100 e = new Node100(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        displayReverse(a);
        Node100 node100 = reversingList(a);
        System.out.println("Reversed Node: "+node100);
    }

    private static Node100 reversingList(Node100 head) {
        if (head.next == null){
            return head;
        }
        return reversingList(head.next);

    }

    private static void displayReverse(Node100 head) {
        if (head ==  null){
            return;
        }
        displayReverse(head.next);
        System.out.print(head.data+" ");

        System.out.println();
    }
}
