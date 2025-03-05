package printing;

public class PrintingSumOfNaturalNumbers {
    public static void main(String[] args) {
        int number = 5;
        printNNumbers(number);
    }

    private static void printNNumbers(int n) {
        if (n==1){
            return ;
        }
       printNNumbers(n-1);
    }
}
