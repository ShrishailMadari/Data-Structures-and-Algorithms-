package printing;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PrintingNumbers5to1 {

    public static void main(String[] args) {
        int num=5;
        printNumbers(num);
    }

    private static void printNumbers(int num) {
        if (num>0) {
            System.out.println(num);
            printNumbers(num-1);
        }
    }
}