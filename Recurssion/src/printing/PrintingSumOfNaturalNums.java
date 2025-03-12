package printing;

public class PrintingSumOfNaturalNums {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(function(n));
    }

    private static int function(int num) {
        if (num == 1){
         return num;
        }
        int function = function(num - 1);
        return  num+function;
    }
}
