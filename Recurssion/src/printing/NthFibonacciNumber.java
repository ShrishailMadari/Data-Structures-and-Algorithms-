package printing;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int numb = scanner.nextInt();
        System.out.println("Fibonacci of a number: "+ fibonacciNumber(numb));
    }

    private static int fibonacciNumber(int numb) {
//        base case
        if (numb == 0 || numb == 1)
            return numb;
        if (numb<0)
            return -1;
        int previous = fibonacciNumber(numb-1);
        int prePrevious = fibonacciNumber(numb-2);
        int sum = previous+prePrevious;
        return sum;
    }
}
