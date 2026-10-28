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
    private JButton AUTORButton;
    private JButton SALIRButton;
    private int tipoPasado=-1;



    public Conversor() {

        //Boton seleccionado por defecto
        int tipo=10;
        rdoBtnDec.setSelected(true);
        gestionBotonesEnabled(rdoBtnDec,tipo);
        tipoPasado=10;


        //---------Listener Radio Buttons-------

        rdoBtnBin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestionBotonesEnabled(rdoBtnBin,0);
                conversion(rdoBtnDec,lblResultado,0,tipoPasado);
                tipoPasado=0;

            }
        });

        rdoBtnOct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestionBotonesEnabled(rdoBtnOct,8);
                conversion(rdoBtnDec,lblResultado,8,tipoPasado);
                tipoPasado=8;

            }
        });
        rdoBtnDec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestionBotonesEnabled(rdoBtnDec,10);
                conversion(rdoBtnDec,lblResultado,10,tipoPasado);
                tipoPasado=10;

            }
        });
        rdoBtnHex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestionBotonesEnabled(rdoBtnHex,16);
                conversion(rdoBtnDec,lblResultado,16,tipoPasado);
                tipoPasado=16;

            }
        });

        //---------------------Listener Buttons------------------

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestionButtons(btn0,lblResultado);
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestionButtons(btn1,lblResultado);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestionButtons(btn2,lblResultado);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestionButtons(btn3,lblResultado);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestionButtons(btn4,lblResultado);
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestionButtons(btn5,lblResultado);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestionButtons(btn6,lblResultado);
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestionButtons(btn7,lblResultado);
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestionButtons(btn8,lblResultado);
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestionButtons(btn9,lblResultado);
            }
        });
        btnA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestionButtons(btnA,lblResultado);
            }
        });
        btnB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestionButtons(btnB,lblResultado);
            }
        });
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestionButtons(btnC,lblResultado);
            }
        });
        btnD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestionButtons(btnD,lblResultado);
            }
        });
        btnE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestionButtons(btnE,lblResultado);
            }
        });
        btnF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestionButtons(btnF,lblResultado);
            }
        });

        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblResultado.setText("0");
                int tipo=10;
                rdoBtnDec.setSelected(true);
                gestionBotonesEnabled(rdoBtnDec,tipo);
                tipoPasado=10;
            }
        });
        AUTORButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"AUTOR: Roberto Rodriguez Riaza");
            }
        });
        SALIRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int option=JOptionPane.showConfirmDialog(null,"¿Estas seguro de que quieres salir?","SALIR",JOptionPane.YES_NO_OPTION);
                if (option==JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        });
    }


    //---------------------------------METODOS------------------------------------

    //Gestion radio buttons
    public void gestionBotonesEnabled(JRadioButton rdoBtn, int tipo){
        btn0.setEnabled(false);
        btn1.setEnabled(false);
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

        if(rdoBtn.isSelected() && tipo==0){
            btn0.setEnabled(true);
            btn1.setEnabled(true);

        }
        if (rdoBtn.isEnabled() && tipo==8){
            btn0.setEnabled(true);
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);

        }
        if(rdoBtn.isEnabled() && tipo==10){
            btn0.setEnabled(true);
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);

        }
        if (rdoBtn.isEnabled() && tipo==16){
            btn0.setEnabled(true);
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            btnA.setEnabled(true);
            btnB.setEnabled(true);
            btnC.setEnabled(true);
            btnD.setEnabled(true);
            btnE.setEnabled(true);
            btnF.setEnabled(true);

        }

    }

    public void gestionButtons(JButton btn,JLabel lbl){
        String text=lbl.getText();

        if (lbl.getText().equals("0")){
            text="";
            lbl.setText(btn.getText());
        }

        lbl.setText(text+btn.getText());
    }

    public void conversion(JRadioButton rdoBtn,JLabel lbl, int tipoActual,int tipoPasado){
        String texto=lbl.getText();
        try {
            if (rdoBtn.isEnabled() && tipoActual == 0) {
                if (tipoPasado == 8) {
                    int n = Integer.parseInt(texto, 8);
                    lbl.setText(Integer.toBinaryString(n));
                }
                if (tipoPasado == 10) {
                    int n = Integer.parseInt(texto, 10);
                    lbl.setText(Integer.toBinaryString(n));
                }
                if (tipoPasado == 16) {
                    int n = Integer.parseInt(texto, 16);
                    lbl.setText(Integer.toBinaryString(n));
                }
            }
            if (rdoBtn.isEnabled() && tipoActual == 8) {
                if (tipoPasado == 0) {
                    int n = Integer.parseInt(texto, 2);
                    lbl.setText(Integer.toOctalString(n));
                }
                if (tipoPasado == 10) {
                    int n = Integer.parseInt(texto, 10);
                    lbl.setText(Integer.toOctalString(n));
                }
                if (tipoPasado == 16) {
                    int n = Integer.parseInt(texto, 16);
                    lbl.setText(Integer.toOctalString(n));
                }
            }
            if (rdoBtn.isEnabled() && tipoActual == 10) {
                if (tipoPasado == 0) {
                    int n = Integer.parseInt(texto, 2);
                    lbl.setText(Integer.toString(n));
                }
                if (tipoPasado == 8) {
                    int n = Integer.parseInt(texto, 8);
                    lbl.setText(Integer.toString(n));
                }
                if (tipoPasado == 16) {
                    int n = Integer.parseInt(texto, 16);
                    lbl.setText(Integer.toString(n));
                }
            }
            if (rdoBtn.isEnabled() && tipoActual == 16) {
                if (tipoPasado == 0) {
                    int n = Integer.parseInt(texto, 2);
                    lbl.setText(Integer.toHexString(n));
                }
                if (tipoPasado == 8) {
                    int n = Integer.parseInt(texto, 8);
                    lbl.setText(Integer.toHexString(n));
                }
                if (tipoPasado == 10) {
                    int n = Integer.parseInt(texto, 10);
                    lbl.setText(Integer.toHexString(n));
                }
            }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"El numero introducido no es valido");
            btnReset.doClick();
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
