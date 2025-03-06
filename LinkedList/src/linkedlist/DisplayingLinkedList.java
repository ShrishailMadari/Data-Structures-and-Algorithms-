package linkedlist;

public class DisplayingLinkedList {
    public static void main(String[] args) {
        NodeOne a = new NodeOne(400);
        NodeOne b = new NodeOne(500);
        NodeOne c = new NodeOne(600);
        NodeOne d = new NodeOne(700);
        NodeOne e = new NodeOne(800);
        a.nextAddress = b;
        b.nextAddress = c;
        c.nextAddress = d;
        d.nextAddress = e;

        NodeOne temp = a;
        System.out.println(temp.data);
        System.out.println(temp.nextAddress = b);
        printingUsingForLoop(temp);
        System.out.println();
        printingUsingWhileLoop(temp);

    }

    private static void printingUsingWhileLoop(NodeOne temp) {
        System.out.println("using while loop");
        while (temp != null){
            System.out.println(temp.data+" ");
            temp = temp.nextAddress;
        }
    }

    private static void printingUsingForLoop(NodeOne temp) {
        System.out.println("Using For Loop: ");
        for (int i = 1; i<=5; i++){
            System.out.println(temp.data);
            temp = temp.nextAddress;
        }
    }
}
