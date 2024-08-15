package funcioneslambda;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
import java.util.function.Function;

public class MatrizPotencia extends JFrame {
    DefaultTableModel model = new DefaultTableModel(0,0);
    private static final Random RANDOM = new Random();
    static int[][] matrizG;

    // Método para multiplicar dos matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;

        if (colsA != rowsB) {
            throw new IllegalArgumentException("Number of columns of A must be equal to number of rows of B");
        }

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                result[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    public static int[][] elevateMatrix(int exponent) {
        // Asegurarse de que la matriz sea cuadrada
        if (matrizG.length != matrizG[0].length) {
            throw new IllegalArgumentException("Matrix must be square to be elevated to a power.");
        }

        int[][] result = matrizG;

        for (int i = 1; i < exponent; i++) {
            result = multiplyMatrices(result, matrizG);
        }

        return result;
    }

    // Método para generar una matriz aleatoria de tamaño rows x cols
    public static int[][] generateRandomMatrix(int rows, int cols, int minValue, int maxValue) {
        int[][] matrix = new int[rows][cols];

        // Función lambda recursiva para llenar la matriz
        fillMatrix(matrix, 0, 0, minValue, maxValue);
        matrizG = matrix;
        return matrix;
    }

    private static void fillMatrix(int[][] matrix, int row, int col, int minValue, int maxValue) {
        // Base case: If row is out of bounds, stop recursion
        if (row >= matrix.length) return;

        // Base case: If col is out of bounds, move to the next row
        if (col >= matrix[row].length) {
            fillMatrix(matrix, row + 1, 0, minValue, maxValue);
            return;
        }

        // Fill current cell with random value
        matrix[row][col] = RANDOM.nextInt(maxValue - minValue + 1) + minValue;

        // Move to the next column
        fillMatrix(matrix, row, col + 1, minValue, maxValue);
    }


    public DefaultTableModel getModel(int[][] matriz) {
        // Crear un DefaultTableModel con el número de filas y columnas de la matriz
        DefaultTableModel model = new DefaultTableModel(matriz.length, matriz[0].length);

        // Llenar el DefaultTableModel con los valores de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Nota: DefaultTableModel usa (fila, columna) en lugar de (fila, columna) para matrices
                model.setValueAt(matriz[i][j], i, j);
            }
        }

        return model;
    }

}
