package linkedlist.display;

public class DisplayLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(7);
        Node node2 = new Node(73);
        Node node3 = new Node(1);
        Node node4 = new Node(6);
        Node node5 = new Node(70);
        Node node6 = new Node(20);
        Node node7 = new Node(45);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
// Displaying the nodes individually
        System.out.println(node1.data); //7
        System.out.println(node1.next.data); // 73 : node2
        System.out.println(node1.next.next.data); // 1 : node3
        System.out.println(node1.next.next.next.data); // 6 : node4
        System.out.println(node1.next.next.next.next.data); // 70 : node5
        System.out.println(node1.next.next.next.next.next.data); // 20 :node6
        System.out.println(node1.next.next.next.next.next.next.data); // 45: node 7
//        Displaying using for and tempo Node
        Node temp = node1;
//        for (int i = 1; i<=7; i++){
//            System.out.print(temp.data+"->");
//            temp = temp.next;
//
//        }
//        Displaying using while and tempo Node
        while (temp!=null){
            System.out.print(temp.data+"");
            temp = temp.next;
        }

//



    }
}
