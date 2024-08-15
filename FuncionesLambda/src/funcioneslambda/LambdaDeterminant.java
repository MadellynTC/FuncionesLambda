package funcioneslambda;
/**/
import java.util.function.Function;

public class LambdaDeterminant {

    public static int calculateDeterminant(int[][] matrix) {
        Function<int[][], Integer> determinant = new Function<>() {
            @Override
            public Integer apply(int[][] m) {
                if (m.length == 1) {
                    return m[0][0];
                }
                if (m.length == 2) {
                    return m[0][0] * m[1][1] - m[0][1] * m[1][0];
                }

                int det = 0;
                for (int i = 0; i < m[0].length; i++) {
                    int[][] subMatrix = new int[m.length - 1][m[0].length - 1];
                    for (int j = 1; j < m.length; j++) {
                        for (int k = 0; k < m[0].length; k++) {
                            if (k < i) {
                                subMatrix[j - 1][k] = m[j][k];
                            } else if (k > i) {
                                subMatrix[j - 1][k - 1] = m[j][k];
                            }
                        }
                    }
                    det += m[0][i] * apply(subMatrix) * (i % 2 == 0 ? 1 : -1);
                }
                return det;
            }
        };

        return determinant.apply(matrix);
    }
}


