package ec.edu.espe;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Iván Mantilla
 */
public interface OpMatrizMantilla {

    // Lambda para restar matrices
    public static final OperacionMatrices restarMatrices = (matriz1, matriz2) -> {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        return resultado;
    };

    @FunctionalInterface
    public interface OperacionMatrices {

        int[][] ejecutar(int[][] matriz1, int[][] matriz2);
    }

    public static int[][] convertirAMatriz(DefaultTableModel modelo) {
        int filas = modelo.getRowCount();
        int columnas = modelo.getColumnCount();
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                Object value = modelo.getValueAt(i, j);
                if (value != null) {
                    matriz[i][j] = Integer.parseInt(value.toString());
                } else {
                    matriz[i][j] = 0; // Valor por defecto
                }
            }
        }
        return matriz;
    }
}
