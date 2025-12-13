package matrixoperations;

public class MatrixTraversal {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        // Traversing the Matrix
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        //Get Dimensions (Length) of Matrix
        int rows = matrix.length;               // Number of rows (4)
        int cols = matrix[0].length;           // Number of columns (5)
        int totalElements = rows * cols;

        System.out.println("Rows: " + rows);
        System.out.println("Columns: " + cols);
        System.out.println("Total Elements: " + totalElements);

    }
}
