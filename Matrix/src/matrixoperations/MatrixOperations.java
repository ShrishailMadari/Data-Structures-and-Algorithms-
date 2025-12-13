package matrixoperations;

public class MatrixOperations {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        }; //3x3
//        printing the Matrix Elements
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix.length - 1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
//        Printing the sum of Matrix Elements:
        int sumOfElements = 0;
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix.length - 1; j++) {
                sumOfElements = sumOfElements + matrix[i][j];
            }
        }
        System.out.println("Sum Of Matrix Elements: " + sumOfElements);
        System.out.println("***********************************");
//        find the Diagonal Elements
        for (int i = 0; i <= matrix.length - 1; i++) {
            System.out.print(matrix[i][i] + " ");

        }
        System.out.println();
        System.out.println("***************************************");
//        sum of diagonal elements
        int sum = 0;
        for (int i = 0; i <= matrix.length - 1; i++) {
            sum = sum + matrix[i][i];
        }
        System.out.println("Sum of diagonal Elements: " + sum);
        System.out.println("****************************************");
        System.out.println();
//        To find the non-diagonal Elements
        int len = matrix.length - 1;
        for (int j = len; j >= 0; j--) {
            System.out.print(matrix[j][len] + " ");
            len--;
        }
        System.out.println();
        System.out.println("*********************************");
        int length = matrix.length - 1;
        int nonDiagonalSum = 0;
        for (int j = length; j >= 0; j--) {
            nonDiagonalSum = nonDiagonalSum + matrix[j][j];
            len--;
        }
        System.out.println("Sum Of NonDiagonal Elements: " + nonDiagonalSum);
    }
}