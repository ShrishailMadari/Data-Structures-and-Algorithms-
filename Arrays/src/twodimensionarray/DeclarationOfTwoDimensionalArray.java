package twodimensionarray;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DeclarationOfTwoDimensionalArray {
    public static void main(String[] args) {
//        declaration of 2D matrix:
        int matrix1 [][];
//        instantiation of matrix:
        matrix1 = new int[3][5];
//        initialization of matrix:

        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Length Of Matrix: "+matrix.length);
        long count = Arrays.stream(matrix).count();
        System.out.println(count);
        int sum = Arrays.stream(matrix).mapToInt(x -> x.length).sum();
        System.out.println("Total Number Of Elements of the Matrix : "+sum);

        System.out.println("Printing the Matrix: ");
        for (int i = 0; i<matrix.length;i++){
            for(int j=0; j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Printing the total number of elements of matrix: ");
        int totalElements = 0;
        for (int i=0; i<matrix.length;i++){
            totalElements = totalElements + matrix[i].length;
        }
        System.out.println("Total Elements Using For Loop: "+totalElements);
        
    }
}
