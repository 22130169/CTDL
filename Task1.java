package Lab5;

import java.util.Arrays;

public class Task1 {

	// Task 1.1

	public static int[][] add(int[][] a, int[][] b) {
		if (a.length != b.length || a[0].length != b[0].length) {
			System.out.print("Kich thuoc ma tran khong giong nhau");
		}
		int[][] result = new int[a.length][a[0].length];
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				result[row][col] = a[row][col] + b[row][col];
			}
		}
		return result;
	}

	// Task 1.2

	public static int[][] subtract(int[][] a, int[][] b) {
		if (a.length != b.length || a[0].length != b[0].length) {
			System.out.print("Kich thuoc ma tran khong giong nhau");
		}
		int[][] result = new int[a.length][a[0].length];
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				result[row][col] = a[row][col] - b[row][col];
			}
		}
		return result;
	}

	// Task 1.3
	// multiply 2 matrices

	public static int[][] multiply(int[][] a, int[][] b) {
		int[][] result = new int[a.length][a[0].length];
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				for (int k = 0; k < a[0].length; k++) {
					result[row][col] += a[row][k] * b[k][col];
				}
			}
		}
		return result;
	}

	// Task 1.4
	// tranpose a matrix
	
	public static int[][] transpose(int[][] a) {
		int[][] b = new int[a[0].length][a.length];
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				b[col][row] = a[row][col];
			}
		}
		return b;
	}

	// Create a method to print the matrix

	public static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		// Run Task1.1

		int[][] a = { { 1, 4 }, { 2, 9 } };
		int[][] b = { { 4, 4 }, { 4, 5 } };
		System.out.println(" Ket qua cua Task 1.1 la:");
		printMatrix(add(a, b));

		// Run Task1.2

		int[][] c = { { 1, 4 }, { 2, 9 } };
		int[][] d = { { 4, 4 }, { 4, 5 } };
		System.out.println(" Ket qua cua Task 1.2 la:");
		printMatrix(subtract(c, d));

		// Run Task1.3

		int[][] e = { { 1, 4 }, { 2, 9 } };
		int[][] f = { { 4, 4 }, { 4, 5 } };
		System.out.println(" Ket qua cua Task 1.3 la:");
		printMatrix(multiply(e, f));

		// Run Task1.4
		
		int[][] h = { { 1, 4, 5 }, { 2, 9, 6 } };
		System.out.println(" Ket qua cua Task 1.4 la:");
		printMatrix(transpose(a));

	}

}
