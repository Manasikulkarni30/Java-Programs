//Java Program to Multiply two Matrices by Passing Matrix to Function
package Assignment2;

public class Program46 {
	public static void main(String[] args) {
		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] matrix2 = { { 1, 1 }, { 2, 2 }, { 3, 3 } };

		int rows1 = matrix1.length;
		int columns1 = matrix1[0].length;

		int rows2 = matrix2.length;
		int columns2 = matrix2[1].length;

		int[][] result = new int[rows1][columns2];
		MatrixMultiplication(matrix1, matrix2, rows1, columns1, columns2, result);
		MatrixMultiplication(result);

	}
	private static void MatrixMultiplication(int[][] matrix1, int[][] matrix2, int rows1, int columns1, int columns2,
			int[][] result) {
		System.out.println("The multiplication of two matrices is : ");
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < columns2; j++) {
				for (int k = 0; k < columns1; k++) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

	}

	private static void MatrixMultiplication(int[][] result) {
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[1].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
