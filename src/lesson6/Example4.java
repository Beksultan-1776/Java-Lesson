package lesson6;

public class Example4 {

    public static void main(String[] args) {
        // Создание единичной матрицы

        final int N = 4;
        int[][] matrix = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) matrix[i][j] = 1; else matrix[i][j] = 0;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
