package printing;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = scanner.nextInt();
        int factorialOfNumber = factorialOfNumber(num);
        System.out.println("Factorial Of Number is: "+factorialOfNumber);
    }

    private static int factorialOfNumber(int num) {
        if (num < 0){
            System.out.println("Wrong Number");
            return -1;
        }
        if(num == 0 || num == 1){
            return 1;
        }
        return num * factorialOfNumber(num-1);

    }
}
