/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.matrizidentidad;

/**
 *
 * @author kevin
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MatrizInvertible_Identidad extends javax.swing.JFrame {

    private double[][] matriz;

    public MatrizInvertible_Identidad() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMatriz = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnRan = new javax.swing.JButton();
        btnVerfInvert = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtInvertible = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMatrizInv = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMatrizId = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Matriz Invertible", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        tblMatriz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "1", "2", "3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMatriz);

        btnAgregar.setText("Obtener Matriz Inversa");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnRan.setText("Generar Numeros Aleatorios");
        btnRan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRanActionPerformed(evt);
            }
        });

        btnVerfInvert.setText("Verificar si es Invertible");
        btnVerfInvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerfInvertActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Matriz x Matriz Inversa = Identidad");

        tblMatrizInv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "1", "2", "3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblMatrizInv);
        tblMatrizInv.getAccessibleContext().setAccessibleName("tblMInv");

        jLabel2.setText("Matriz Ingresada");

        jLabel3.setText("Verificacion Matriz Invertible");

        jLabel4.setText("Matriz Inversa");

        tblMatrizId.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "1", "2", "3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblMatrizId);
        tblMatrizId.getAccessibleContext().setAccessibleName("tblMatrizId");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(95, 95, 95))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVerfInvert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInvertible)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel3)))
                        .addContainerGap(41, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVerfInvert, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtInvertible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here
       try {
            matriz = new double[3][3];
            DefaultTableModel model = (DefaultTableModel) tblMatriz.getModel();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matriz[i][j] = Double.parseDouble(model.getValueAt(i, j).toString());
                }
            }
            double[][] inversa = calcularInversa(matriz);
            if (inversa == null) {
                JOptionPane.showMessageDialog(this, "La matriz no es invertible.");
                txtInvertible.setText("No Invertible");
                return;
            }
            mostrarMatriz(inversa, tblMatrizInv);
            JOptionPane.showMessageDialog(this, "Matriz inversa calculada correctamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: Verifique que todos los campos estén llenos y que no haya caracteres no válidos.");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRanActionPerformed
        // TODO add your handling code here:
         Random random = new Random();
        DefaultTableModel model = (DefaultTableModel) tblMatriz.getModel();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                model.setValueAt(random.nextInt(10), i, j);
            }
        }
    }//GEN-LAST:event_btnRanActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVerfInvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerfInvertActionPerformed
        // TODO add your handling code here:
         try {
            matriz = new double[3][3];
            DefaultTableModel model = (DefaultTableModel) tblMatriz.getModel();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matriz[i][j] = Double.parseDouble(model.getValueAt(i, j).toString());
                }
            }

            double[][] inversa = new double[3][3];
            model = (DefaultTableModel) tblMatrizInv.getModel();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    inversa[i][j] = Double.parseDouble(model.getValueAt(i, j).toString());
                }
            }

            double[][] resultado = multiplicarMatrices(matriz, inversa);
            mostrarMatriz(resultado, tblMatrizId);

            if (esMatrizIdentidad(resultado)) {
                txtInvertible.setText("Invertible");
            } else {
                txtInvertible.setText("No Invertible");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: Verifique que todos los campos estén llenos y que no haya caracteres no válidos.");
        }
    }//GEN-LAST:event_btnVerfInvertActionPerformed
    
    /**
     * @param args the command line arguments
     */
  @FunctionalInterface
   public interface MatrixChecker {
     boolean check(int fila, int columna);
  }  
  private boolean esMatrizIdentidad(double[][] matriz) {
    MatrixChecker esMatrizIdentidadLambda = new MatrixChecker() {
        @Override
        public boolean check(int fila, int columna) {
            if (fila == 3) return true;
            if (columna == 3) return check(fila + 1, 0);
            if (fila == columna && matriz[fila][columna] != 1) return false;
            if (fila != columna && matriz[fila][columna] != 0) return false;
            return check(fila, columna + 1);
        }
    };
    return esMatrizIdentidadLambda.check(0, 0);
}

    private double[][] multiplicarMatrices(double[][] matrizA, double[][] matrizB) {
        double[][] resultado = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        return resultado;
    }

    private double calcularDeterminante(double[][] matriz) {
        return matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1])
             - matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0])
             + matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]);
    }

    private double[][] calcularAdjunta(double[][] matriz) {
        double[][] adjunta = new double[3][3];
        adjunta[0][0] = matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1];
        adjunta[0][1] = matriz[0][2] * matriz[2][1] - matriz[0][1] * matriz[2][2];
        adjunta[0][2] = matriz[0][1] * matriz[1][2] - matriz[0][2] * matriz[1][1];
        adjunta[1][0] = matriz[1][2] * matriz[2][0] - matriz[1][0] * matriz[2][2];
        adjunta[1][1] = matriz[0][0] * matriz[2][2] - matriz[0][2] * matriz[2][0];
        adjunta[1][2] = matriz[0][2] * matriz[1][0] - matriz[0][0] * matriz[1][2];
        adjunta[2][0] = matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0];
        adjunta[2][1] = matriz[0][1] * matriz[2][0] - matriz[0][0] * matriz[2][1];
        adjunta[2][2] = matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        return adjunta;
    }

    private double[][] calcularInversa(double[][] matriz) {
        double det = calcularDeterminante(matriz);
        if (det == 0) {
            return null;
        }
        double[][] adjunta = calcularAdjunta(matriz);
        double[][] inversa = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inversa[i][j] = adjunta[i][j] / det;
            }
        }
        return inversa;
    }

    private void mostrarMatriz(double[][] matriz, JTable tabla) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                model.setValueAt(matriz[i][j], i, j);
            }
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new MatrizInvertible_Identidad().setVisible(true));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnRan;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerfInvert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblMatriz;
    private javax.swing.JTable tblMatrizId;
    private javax.swing.JTable tblMatrizInv;
    private javax.swing.JTextField txtInvertible;
    // End of variables declaration//GEN-END:variables
}

