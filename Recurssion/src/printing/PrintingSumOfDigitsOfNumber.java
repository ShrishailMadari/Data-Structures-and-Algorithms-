package printing;

public class PrintingSumOfDigitsOfNumber {
    public static void main(String[] args) {
        int num = 0;
        int sumOfDigits = sumOfDigits(num);
        System.out.println(sumOfDigits);
        System.out.println();
        int sum = sumOfDigitsWithRecursion(num);
        System.out.println("Sum is: "+sum);
    }

    private static int sumOfDigitsWithRecursion(int num) {
        if(num<=0 || num<9){
            return num;
        }
        int x = sumOfDigitsWithRecursion(num/10);
        return x + num%10;
    }


    private static int sumOfDigits(int num) {
        //o/p: 15
        int sum = 0;
        if(num<0 || num<9){
            return num;
        }
        while (num>0){
            int digit = num %10;
            sum = sum+digit;
            num = num/10;
        }
        return sum;

    }
}
