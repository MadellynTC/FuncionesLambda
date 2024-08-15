package funcioneslambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

public class MatrizExponente extends JFrame {
    private JPanel MenuPrin;
    private JTable tablematriz;
    private JButton elevarButton;
    private JTextField textField1;
    private JTable table2;
    private JComboBox comboBox1;
    private JButton generarMatrizButton;
    MatrizPotencia matrizPotencia = new MatrizPotencia();

    public MatrizExponente() {
        setContentPane(MenuPrin);

        generarMatrizButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tablematriz.setModel(matrizPotencia.getModel(matrizPotencia.generateRandomMatrix(Integer.parseInt(comboBox1.getSelectedItem().toString()),
                        Integer.parseInt(comboBox1.getSelectedItem().toString()),
                        1,20)));
            }
        });
        elevarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                table2.setModel(matrizPotencia.getModel(matrizPotencia.elevateMatrix(Integer.parseInt(textField1.getText()))));
            }
        });
    }
    public static void main(String[] args) {
        MatrizExponente m = new MatrizExponente();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.pack();
    }
}
