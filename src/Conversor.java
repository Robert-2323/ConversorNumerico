import javax.swing.*;

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

    public static void main(String[] args) {
        JFrame frame = new JFrame("Conversor");
        frame.setContentPane(new Conversor().ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
