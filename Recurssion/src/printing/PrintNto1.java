package printing;

public class PrintNto1 {
    public static void main(String[] args) {
        int n = 10;
        printFromNto1(n);
    }

    private static void printFromNto1(int n) {
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printFromNto1(n-1);

    }
}
