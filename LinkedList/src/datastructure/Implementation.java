package datastructure;


public class Implementation {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class LinkedList {
        Node head = null;
        Node tail = null;



      void insertAtHead(int data){
          Node temp = new Node(data);
          if (head == null){
//              insertAtEnd(data);
              //or
//              head = temp;
              tail = temp;
          }else {
              temp.next = head;
//              head = temp;
          }
          head = temp;
      }

        void display(){
            /* will not provide the Node as param
            * since we got the Node pointed to the null
            * from that create the Temp node and check with
            * */
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        void insertAtEnd(int data) {
            /*
            * create node with give data
            * and make the node as head and tail is also head
            * otherwise we hv to do for every case
            *  */
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail=temp;
        }

        int size(){
            Node temp = head;
            int count = 0;
            while (temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
        void insertAt(int index,int data){
          Node temp1 = head;
          Node temp2 = new Node(data);

          if (index == size()){
              insertAtEnd(data);
          } else if (index == 0) {
              insertAtHead(data);
          }else {
              for (int i = 0; i<index-1; i++){
                  temp1 = temp1.next;
              }
              temp2.next = temp1.next;
              temp1.next = temp2;
          }

        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println(list.size());
        list.insertAtEnd(100);
        list.insertAtEnd(500);
        list.insertAtEnd(400);
        list.insertAtEnd(800);
//        list.display();
        System.out.println(list.size());
        list.insertAtEnd(300);
//        list.display();
        list.insertAtHead(700);
//        list.display();
        System.out.println(list.size());
        list.insertAtEnd(600);
        list.display();
        list.insertAt(3,850);
        list.display();
        list.insertAt(4,820);
        list.display();
        System.out.println(list.size());
        list.insertAt(0,750);
        list.display();
        System.out.println(list.size());
        list.insertAt(10,390);
        list.display();
    }
}
