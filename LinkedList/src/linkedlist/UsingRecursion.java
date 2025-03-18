package linkedlist;

public class UsingRecursion {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a= new Node(200);
        Node b= new Node(300);
        Node c= new Node(400);
        Node d= new Node(500);
        Node e= new Node(600);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println("displaying using recursion: ");
        displayNode(a);
        System.out.println();
        displayNodeReverse(a);
    }
    private static void displayNodeReverse(Node head) {
        if(head == null)
            return;
        displayNodeReverse(head.next);
        System.out.print(head.data+" ");
    }


    private static void displayNode(Node head) {
            if(head == null)
                return;
            System.out.print(head.data+" ");
            displayNode(head.next);

        }

    }






