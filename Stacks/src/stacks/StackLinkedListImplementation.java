package stacks;

public class StackLinkedListImplementation {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public static class Stack{
        private Node head = null;
        private int size = 0;

        void push(int val){
            Node temp = new Node(val);
            temp.next = head;
            head=temp;
            size++;
        }
        void display(){

        }
        void displayReverse(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int pop(){
            if (head == null){
                System.out.println("empty stack: ");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        int peek(){
            if (head == null){
                System.out.println("empty stack: ");
                return -1;
            }
            return head.data;
        }

        int size(){
            return size;
        }

        boolean isEmpty(){
            if (size == 0)
                return true;
            else
                return false;
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(3);
        stack.push(40);
        stack.push(1);
        System.out.println(stack.size);
        stack.display();
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        stack.display();
    }
}
