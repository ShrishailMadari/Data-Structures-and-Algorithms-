package datastructure;

public class LinkedListImpl {
    public static class Node{
        int data;
        Node nextNodeAddress;

        public Node(int data) {
            this.data = data;
        }

    }

    public static void main(String[] args) {
//        Node Creations
        Node node1 = new Node(100);
        Node node2 = new Node(200);
        Node node3 = new Node(300);
        Node node4 = new Node(400);
        Node node5 = new Node(500);
//        System.out.println(node1);
        // Nodes Has to be Connected in the following way
//        100->200->300->400->500

        node1.nextNodeAddress = node2; // 100->200
        node2.nextNodeAddress = node3; //100->200->300
        node3.nextNodeAddress = node4;  //100->200->300->400
        node4.nextNodeAddress = node5; // //100->200->300->400->500

//        Verifying the addresses
        System.out.println(node1);
        System.out.println(node1.nextNodeAddress);
        System.out.println(node2);

//        Verifying the data
        System.out.println(node1.data);
        System.out.println(node2.data);
        System.out.println(node1.nextNodeAddress.data);

    }
}
