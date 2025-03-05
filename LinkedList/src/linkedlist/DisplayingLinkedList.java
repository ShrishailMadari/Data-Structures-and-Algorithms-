package linkedlist;

public class DisplayingLinkedList {
    public static void main(String[] args) {
        Node a = new Node(400);
        Node b = new Node(500);
        Node c = new Node(600);
        Node d = new Node(700);
        Node e = new Node(800);
        a.nextAddress = b;
        b.nextAddress = c;
        c.nextAddress = d;
        d.nextAddress = e;

        Node temp = a;
        System.out.println(temp.data);
        System.out.println(temp.nextAddress = b);
        printingUsingForLoop(temp);
        System.out.println();
        printingUsingWhileLoop(temp);

    }

    private static void printingUsingWhileLoop(Node temp) {
        System.out.println("using while loop");
        while (temp != null){
            System.out.println(temp.data+" ");
            temp = temp.nextAddress;
        }
    }

    private static void printingUsingForLoop(Node temp) {
        System.out.println("Using For Loop: ");
        for (int i = 1; i<=5; i++){
            System.out.println(temp.data);
            temp = temp.nextAddress;
        }
    }
}
