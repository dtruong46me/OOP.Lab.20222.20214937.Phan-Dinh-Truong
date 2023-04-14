package lab1;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter the size of 2 matrices
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] resultMatrix = new int [rows][cols];

        // Enter the elements of 2 matrices
        System.out.println("\nEnter the elements of the first matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix1["+i+"]["+j+"] = ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEnter the elements of the second matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix2["+i+"]["+j+"] = ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Sum of two matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Show the result
        System.out.println("\nThe sum of two matrices: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(resultMatrix[i][j]+" ");
            }
            System.out.println("");
        }

        sc.close();
    }
}
