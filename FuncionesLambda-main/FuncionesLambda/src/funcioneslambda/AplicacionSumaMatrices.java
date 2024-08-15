package funcioneslambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AplicacionSumaMatrices extends JFrame {

    private JPanel contentPanel;
    private JTextArea matrizAInput;
    private JTextArea matrizBInput;
    private JTextArea resultadoOutput;
    private JButton calcularButton;

    public AplicacionSumaMatrices() {
        setTitle("Suma de Matrices");
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

        calcularButton = new JButton("Sumar Matrices");

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

                    if (matrizA.length != matrizB.length || matrizA[0].length != matrizB[0].length) {
                        resultadoOutput.setText("Las matrices deben ser del mismo tamaño.");
                        return;
                    }

                    int[][] suma = sumarMatrices(matrizA, matrizB);
                    mostrarMatriz(suma);
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

    private int[][] sumarMatrices(int[][] matrizA, int[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int[][] resultado = new int[filas][columnas];

        // Función lambda para sumar las matrices
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return resultado;
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
            AplicacionSumaMatrices gui = new AplicacionSumaMatrices();
            gui.setVisible(true);
        });
    }
}
