package queuesdatastructures;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class PrintingElementsWithoutPreDefinedMethods {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(100);
        queue.offer(200);
        queue.offer(300);
        queue.offer(400);
        queue.offer(500);
        queue.offer(600);
        System.out.println(queue);

        Queue<Integer> oneMoreQ = new LinkedList<>();
        while (!queue.isEmpty()){
            System.out.print(queue.peek()+" ");
            oneMoreQ.add(queue.poll());
        }
        while (!oneMoreQ.isEmpty()){
//            System.out.println(queue.peek());
            queue.add(oneMoreQ.poll());
        }



    }
}
