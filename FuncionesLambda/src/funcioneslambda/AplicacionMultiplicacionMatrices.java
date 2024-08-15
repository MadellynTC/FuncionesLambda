package funcioneslambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.BiFunction;

public class AplicacionMultiplicacionMatrices extends JFrame {

    private JPanel contentPanel;
    private JTextArea matrizAInput;
    private JTextArea matrizBInput;
    private JTextArea resultadoOutput;
    private JButton calcularButton;

    public AplicacionMultiplicacionMatrices() {
        setTitle("Multiplicación de Matrices");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLocationRelativeTo(null);

        contentPanel = new JPanel();
        contentPanel.setLayout(new GridBagLayout());
        add(contentPanel);

        matrizAInput = new JTextArea(5, 20);
        matrizBInput = new JTextArea(5, 20);
        resultadoOutput = new JTextArea(5, 40);
        resultadoOutput.setEditable(false);

        calcularButton = new JButton("Multiplicar Matrices");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Espaciado interno

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        contentPanel.add(new JLabel("Matriz A (use espacios para separar elementos y salto de línea para filas):"), gbc);

        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        contentPanel.add(new JScrollPane(matrizAInput), gbc);

        gbc.gridx = 1;
        contentPanel.add(new JLabel("Matriz B (use espacios para separar elementos y salto de línea para filas):"), gbc);

        gbc.gridy = 2;
        gbc.gridx = 1;
        contentPanel.add(new JScrollPane(matrizBInput), gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        contentPanel.add(calcularButton, gbc);

        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weighty = 1;
        contentPanel.add(new JScrollPane(resultadoOutput), gbc);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int[][] matrizA = parsearMatriz(matrizAInput.getText());
                    int[][] matrizB = parsearMatriz(matrizBInput.getText());

                    if (matrizA[0].length != matrizB.length) {
                        resultadoOutput.setText("El número de columnas de la Matriz A debe ser igual al número de filas de la Matriz B.");
                        return;
                    }

                    // Función lambda para multiplicar matrices
                    BiFunction<int[][], int[][], int[][]> multiplicarMatrices = (a, b) -> {
                        int filasA = a.length;
                        int columnasA = a[0].length;
                        int filasB = b.length;
                        int columnasB = b[0].length;
                        int[][] resultado = new int[filasA][columnasB];
                        for (int i = 0; i < filasA; i++) {
                            for (int j = 0; j < columnasB; j++) {
                                resultado[i][j] = 0;
                                for (int k = 0; k < columnasA; k++) {
                                    resultado[i][j] += a[i][k] * b[k][j];
                                }
                            }
                        }
                        return resultado;
                    };

                    int[][] producto = multiplicarMatrices.apply(matrizA, matrizB);
                    mostrarMatriz(producto);
                } catch (Exception ex) {
                    resultadoOutput.setText("Error: " + ex.getMessage());
                }
            }
        });
    }

    private int[][] parsearMatriz(String texto) {
        String[] filas = texto.trim().split("\n");
        int[][] matriz = new int[filas.length][];
        for (int i = 0; i < filas.length; i++) {
            String[] valores = filas[i].trim().split("\\s+");
            matriz[i] = new int[valores.length];
            for (int j = 0; j < valores.length; j++) {
                matriz[i][j] = Integer.parseInt(valores[j]);
            }
        }
        return matriz;
    }

    private void mostrarMatriz(int[][] matriz) {
        StringBuilder sb = new StringBuilder();
        for (int[] fila : matriz) {
            for (int valor : fila) {
                sb.append(valor).append(" ");
            }
            sb.append("\n");
        }
        resultadoOutput.setText(sb.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AplicacionMultiplicacionMatrices gui = new AplicacionMultiplicacionMatrices();
            gui.setVisible(true);
        });
    }
}
