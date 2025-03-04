package printing;

public class PrintingSumOfNaturalNumbers {
    public static void main(String[] args) {
        printNNumbers(5,1,0);
    }

    private static void printNNumbers(int i,int n,int sum) {
        if (i==n){
            sum = sum+i;
            System.out.println(sum);
            return;
        }
        sum = sum+i;
        printNNumbers(i+1,n,sum);
    }
}
