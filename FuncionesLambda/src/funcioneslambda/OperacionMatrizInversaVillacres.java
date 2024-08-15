/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.matrizinversalambda;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIGUEL VILLACRES
 */
public interface OperacionMatrizInversaVillacres {

    // Método abstracto para calcular la inversa de una matriz
    double[][] calcularInversa(double[][] matriz);

    // Implementación estática de la interfaz para calcular la inversa
    public static final OperacionMatrizInversaVillacres calculadora = matriz -> {
        double det = determinante(matriz);
        if (det == 0) {
            return null; // La matriz no tiene inversa si su determinante es 0
        }

        double[][] adjunta = adjunta(matriz);
        double[][] inversa = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inversa[i][j] = adjunta[i][j] / det;
            }
        }

        return inversa;
    };

    // Método para calcular el determinante de una matriz 3x3
    private static double determinante(double[][] matriz) {
        return matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1])
                - matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0])
                + matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]);
    }

    // Método para calcular la matriz adjunta de una matriz 3x3
    private static double[][] adjunta(double[][] matriz) {
        double[][] adj = new double[3][3];

        adj[0][0] = matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1];
        adj[0][1] = -(matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0]);
        adj[0][2] = matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0];

        adj[1][0] = -(matriz[0][1] * matriz[2][2] - matriz[0][2] * matriz[2][1]);
        adj[1][1] = matriz[0][0] * matriz[2][2] - matriz[0][2] * matriz[2][0];
        adj[1][2] = -(matriz[0][0] * matriz[2][1] - matriz[0][1] * matriz[2][0]);

        adj[2][0] = matriz[0][1] * matriz[1][2] - matriz[0][2] * matriz[1][1];
        adj[2][1] = -(matriz[0][0] * matriz[1][2] - matriz[0][2] * matriz[1][0]);
        adj[2][2] = matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];

        return adj;
    }

    // Conversión de la matriz en el modelo de tabla
    public static double[][] convertirAMatriz(DefaultTableModel modelo) {
        int filas = modelo.getRowCount();
        int columnas = modelo.getColumnCount();
        double[][] matriz = new double[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                Object value = modelo.getValueAt(i, j);
                if (value != null) {
                    matriz[i][j] = Double.parseDouble(value.toString());
                } else {
                    matriz[i][j] = 0; // Valor por defecto
                }
            }
        }
        return matriz;
    }
}
