package chapter1.task18;

public class Main {
    public static void maxMatrixElements(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] > max) max = matrix[i][j];
            }
            System.out.println(max);
        }
    }
}
