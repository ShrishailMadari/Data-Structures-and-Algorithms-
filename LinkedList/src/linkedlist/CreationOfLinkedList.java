package linkedlist;
class NodeOne{
    int data;
    NodeOne nextAddress;

    public static NodeOne display(NodeOne head){
        NodeOne temp = head;
        while (temp!= null){
            System.out.println(temp.data+" ");
            temp = temp.nextAddress;
        }
        return temp;
    }

    public NodeOne(int data) {
        this.data = data;
    }
}
public class CreationOfLinkedList {
    public static void main(String[] args) {
        NodeOne a = new NodeOne(100);
        NodeOne b = new NodeOne(200);
        NodeOne c = new NodeOne(300);
        NodeOne d = new NodeOne(400);
        NodeOne e = new NodeOne(500);
        NodeOne f = new NodeOne(600);


        a.nextAddress = b;
        b.nextAddress = c;
        c.nextAddress = d;
        d.nextAddress = e;
        e.nextAddress = f;
// printing addresses
        System.out.println(a.nextAddress);
        System.out.println(b);

        System.out.println(c.nextAddress+" "+d);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

//        printing data
        System.out.println(a.nextAddress.data + " " + b.data);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

    }

}
