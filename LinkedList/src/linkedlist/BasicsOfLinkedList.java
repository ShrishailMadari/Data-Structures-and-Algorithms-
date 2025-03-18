package linkedlist;

public class BasicsOfLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    //Creating Nodes and Linking them in between
    public static void main(String[] args) {
        //Creating Nodes
        Node node1 = new Node(100);
        Node node2 = new Node(200);
        Node node3 = new Node(300);
        Node node4 = new Node(400);
        Node node5 = new Node(500);

//      Linking them in between
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println(node1.next);
        System.out.println(node2);

        //printing using for loop, suitable only for nodes are known
        Node temp = node1;
        for (int i=1;i<=5;i++){
            System.out.print(temp.data+" ");
            temp = temp.next;

        }

    }
}
