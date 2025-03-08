package stacks;
public class StackImplementation {
    static class Stack{
        int[] arr = new int[10];
        int index = 0;

        void push(int x){
            arr[index]= x;
            index++;
        }

        int peek(){
            if(index == 0) {
                System.out.println("empty stack");
                return 0xffffffff;
            }
            return arr[index - 1];
        }

        int pop(){
            if (index == 0){
                System.out.println("Empty stack:" );
                return -1;
            }
            int top = arr[index-1];
            arr[index-1] = 0; //when u pop you do update with 0
            index--;
            return top;
        }
        void display(){
            for (int i=0; i<=index-1; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        int size(){
            return index;
        }

        int capacity(){
            return arr.length;
        }



    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(100);
        stack.display();
        stack.push(200);
        stack.display();
        stack.push(300);
        stack.display();
        stack.push(400);
        stack.push(500);
        stack.display();
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.display();
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.capacity());
    }
}
