package chapter1.task8;

import java.util.Arrays;

public class Main {
    public static void matrixExchanges(int[][] matrix) {
        for(int i = 0; i < 3; i++) {
            int temp = matrix[0][i];
            matrix[0][i] = matrix[matrix.length-1][i];
            matrix[matrix.length-1][i] = temp;
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
