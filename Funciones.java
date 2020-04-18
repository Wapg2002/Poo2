import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Funciones {
    private JTextField valorM;
    private JTextField valorF;
    private JTextField valorFi;
    private JTextField resultado;
    private JButton calcularButton;
    private JButton calcularButton1;
    private JButton calcularButton2;
    private JButton borrarButton;
    private JPanel panel;
    private JTextField valorMH;
    private JTextArea Result2;

    public Funciones() {
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int m = Integer.parseInt(valorM.getText());
                int m1 = Integer.parseInt(valorMH.getText());
                String resultado = "";
                for (int i = 0; i < m1; i++ ) {
                    if (i % m == 0) {
                        resultado = resultado + i + "\n";
                    }
                }
                Result2.append(String.valueOf("Resultado:\n "  + resultado));
            }
        });
        calcularButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int factoriall = 1;
                Integer n = new Integer(valorF.getText());

                for(int i = n; i >= 1; i--){
                    factoriall = factoriall * i;
                }
                resultado.setText(" " + factoriall);
                 }

        });
        calcularButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n;
                n = Integer.parseInt(valorFi.getText());
                int a = 0, b = 1, c = 0, s = 1;
                for (int i = 2; i <= n; i++) {
                    c = a + b;
                    s += c;
                    a = b;
                    b = c;
                }
                resultado.setText(Integer.toString(c));
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valorM.setText("");
                valorF.setText("");
                valorFi.setText("");
                resultado.setText("");
                valorMH.setText("");
                Result2.setText("");
            }
        });

    }

    public static void main(String[]args){
        JFrame frame = new JFrame("Calculando de fibonacci, múltiplos de un número y factorial");
        frame.setContentPane(new Funciones().panel);
        frame.pack();
        frame.setVisible(true);
    }
}
