package linkedlist;
class Node{
    int data;
    Node nextAddress;

    public static Node display(Node head){
        Node temp = head;
        while (temp!= null){
            System.out.println(temp.data+" ");
            temp = temp.nextAddress;
        }
        return temp;
    }

    public Node(int data) {
        this.data = data;
    }
}
public class CreationOfLinkedList {
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(200);
        Node c = new Node(300);
        Node d = new Node(400);
        Node e = new Node(500);
        Node f = new Node(600);


        a.nextAddress = b;
        b.nextAddress = c;
        c.nextAddress = d;
        d.nextAddress = e;
        e.nextAddress = f;
// printing addresses
        System.out.println(a.nextAddress);
        System.out.println(b);

        System.out.println(c.nextAddress+" "+d);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

//        printing data
        System.out.println(a.nextAddress.data + " " + b.data);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

    }

}
