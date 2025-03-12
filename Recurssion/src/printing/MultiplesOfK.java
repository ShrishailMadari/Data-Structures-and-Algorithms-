package printing;

public class MultiplesOfK {
    public static void main(String[] args) {
        int n = 10;
        int k=10;
        printMultiples(n,k);
    }

    private static void printMultiples(int num, int k) {
        if(k==0) {
            return;
        }
        printMultiples(num,k-1);
        System.out.println( num * k);

    }
}
