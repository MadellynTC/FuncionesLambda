package funcioneslambda;

public class SumadorDeMatrices {
    @FunctionalInterface
    interface OperacionMatriz {
        int aplicar(int a, int b);
    }

    public int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        OperacionMatriz suma = (a, b) -> a + b;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = suma.aplicar(matriz1[i][j], matriz2[i][j]);
            }
        }
        return resultado;
    }
}

