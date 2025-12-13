public class ReverseStringUsingStreams {
    public static void main(String[] args) {
        String str = "Shrishail Madari";
        System.out.println("SubStrings : "+str.substring(0, str.length()));
        System.out.println("********************");
        System.out.println("Sub string is: "+str.substring(1));
        System.out.println("********************");
        System.out.println(str.substring(2,7));
        System.out.println("********************");
        System.out.println("Sub Sequence is: "+str.subSequence(2,str.length()));
        System.out.println("Sub Sequence is: "+str.subSequence(2,10));
        System.out.println("********************");
        String reversed = "";
        System.out.println("Reversed String Is: " + methodOne(str, reversed));
        System.out.println("********************");
        methodTwo(str, reversed);
        System.out.println("********************");
        methodThree(str,reversed);
        System.out.println("********************");
        System.out.println(methodFour(str,reversed));
    }

    private static String methodFour(String str, String reversed) {
        if (str.isEmpty()){
            return reversed;
        }
        return methodFour(str.substring(1),reversed+str.charAt(0));
    }

    private static void methodThree(String str, String reversed) {
        char[] charArray = str.toCharArray();
        for (int i=charArray.length-1;i>=0;i--){
            if (charArray[i]!=' '){
                reversed = reversed+charArray[i];
            }
            else{
                reversed = reversed+" ";
            }
        }
        System.out.println(reversed);
    }

    private static void methodTwo(String str, String reversed) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Reversed String Is: " + sb.toString());
    }

    private static String methodOne(String str, String reversed) {
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                reversed = reversed + str.charAt(i);
            } else {
                reversed = reversed + " ";
            }

        }
        return reversed;
    }
}

