import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Conversor {
    private JPanel ventana;
    private JLabel lblConversor;
    private JRadioButton rdoBtnBin;
    private JRadioButton rdoBtnOct;
    private JRadioButton rdoBtnDec;
    private JRadioButton rdoBtnHex;
    private JButton btnA;
    private JButton btnB;
    private JButton btnC;
    private JButton btnD;
    private JButton btnE;
    private JButton btnF;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn2;
    private JButton btn3;
    private JButton btn0;
    private JButton btn1;
    private JButton btnReset;
    private JLabel lblResultado;

    public Conversor() {
        rdoBtnBin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rdoBtnBin.isSelected()){
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    btn5.setEnabled(false);
                    btn6.setEnabled(false);
                    btn7.setEnabled(false);
                    btn8.setEnabled(false);
                    btn9.setEnabled(false);
                    btnA.setEnabled(false);
                    btnB.setEnabled(false);
                    btnC.setEnabled(false);
                    btnD.setEnabled(false);
                    btnE.setEnabled(false);
                    btnF.setEnabled(false);



                }
            }
        });
    }

    public void gestionBotonesEnabled(JRadioButton rdoBtn, int tipo){
        if(rdoBtn.isSelected()){

        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Conversor");
        frame.setContentPane(new Conversor().ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
