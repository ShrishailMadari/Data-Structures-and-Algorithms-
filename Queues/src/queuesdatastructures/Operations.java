package queuesdatastructures;

import java.util.LinkedList;
import java.util.Queue;

public class Operations {
    public static void main(String[] args) {
        Queue<String > stringQueue = new LinkedList<>();
        //Exception Methods:
//        System.out.println(stringQueue.element());

        stringQueue.offer("ShriGuru");
        stringQueue.offer("ShriHari");
        stringQueue.offer("ShriMannarayana");
        stringQueue.offer("ShriVishnu");
        stringQueue.offer("OmNamoNarayana");
        stringQueue.offer("OmAchutaya");
        System.out.println(stringQueue);
        stringQueue.poll();
        System.out.println(stringQueue);
        System.out.println(stringQueue.peek());
        System.out.println(stringQueue.size());

    }
}
