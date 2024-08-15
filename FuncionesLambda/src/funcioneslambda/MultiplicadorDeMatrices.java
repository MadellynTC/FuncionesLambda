package funcioneslambda;

public class MultiplicadorDeMatrices {
    @FunctionalInterface
    interface OperacionMatriz {
        int aplicar(int a, int b);
    }

    public int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int filasA = matriz1.length;
        int columnasA = matriz1[0].length;
        int filasB = matriz2.length;
        int columnasB = matriz2[0].length;

        if (columnasA != filasB) {
            throw new IllegalArgumentException("El número de columnas de la Matriz A debe ser igual al número de filas de la Matriz B.");
        }

        int[][] resultado = new int[filasA][columnasB];

        OperacionMatriz multiplicar = (a, b) -> a * b;

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += multiplicar.aplicar(matriz1[i][k], matriz2[k][j]);
                }
            }
        }
        return resultado;
    }
}
