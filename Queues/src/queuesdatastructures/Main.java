package queuesdatastructures;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>() ;
        queue.add(100);
        queue.add(200);
        queue.add(300);
        queue.add(400);
        queue.add(500);
        queue.add(600);
        queue.add(700);
        queue.add(450);
        System.out.println(queue);
        System.out.println(queue.size());

        queue.remove();
        System.out.println(queue);
        System.out.println(queue.peek()+" "+queue.element());
        System.out.println(queue.poll()+" "+queue.remove());
        System.out.println(queue);
        System.out.println(queue.offer(null));


    }
}