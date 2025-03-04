package printing;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = scanner.nextInt();
        int factorialOfNumber = factorialOfNumber(num);
        System.out.println(factorialOfNumber);
    }

    private static int factorialOfNumber(int num) {
        if(num == 0 || num == 1){
            return 1;
        }
        return num * factorialOfNumber(num-1);

    }
}
