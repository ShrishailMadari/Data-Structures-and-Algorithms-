package printing;

public class Printing1ToN {
    public static void main(String[] args) {
        int n = 100;
        printMethod(n);
    }

    private static void printMethod(int n) {
        if(n==1){
            System.out.println(1);
            return;
        }
        printMethod(n-1);
        System.out.println(n);
    }
}
