package Exercicio05;

import Exercicio01.BaseInterfaceExercicio;
import Exercicio04.Exercicio04;
import com.sun.org.apache.xerces.internal.util.DOMUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Alunos
 */
public class Exercicio05 implements BaseInterfaceExercicio {

    private JFrame janela;
    private JLabel jLabelNumero1, jLabelNumero2, jLabelResultado;
    private JTextField jTextFieldNumero1, jTextFieldNumero2;
    private JTextArea jTextAreaResultado;
    private JScrollPane jScrollPaneResultado;
    private JButton jButtonSomar, jButtonSubtrair, jButtonDividir,
            jButtonMultiplicar;
    
    public double numero1;
    public double numero2;
    
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    
    public double getNumero1() {
        return this.numero1;
    }

    
    public void setNumero2(double Numero2) {
        this.numero2 = Numero2;
    }
    
    public double getNumero2() {
        return this.numero2;
    }

    public Exercicio05() {
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarDimensoes();
        gerarLocalizacao();
        configurarJScrollPane();
        AcaoButton();
        janela.setVisible(true);
    }

    @Override
    public void gerarTela() {
        janela = new JFrame("Exercicio05");
        janela.setIconImage(new ImageIcon(Exercicio04.class.getResource("/Icons/matematica.png")).getImage());
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setLayout(null);
        janela.setSize(500, 350);
        janela.setLocationRelativeTo(null);

    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero1 = new JLabel("Numero 1 ");
        jLabelNumero2 = new JLabel("Numero 2 ");
        jLabelResultado = new JLabel("Resultado");
        jTextFieldNumero1 = new JTextField();
        jTextFieldNumero2 = new JTextField();
        jScrollPaneResultado = new JScrollPane();
        jButtonSomar = new JButton("+");
        jButtonSubtrair = new JButton("-");
        jButtonMultiplicar = new JButton("*");
        jButtonDividir = new JButton("/");
        jTextAreaResultado = new JTextArea();
    }

    @Override
    public void adicionarComponentes() {
        janela.add(jLabelNumero1);
        janela.add(jLabelNumero2);
        janela.add(jLabelResultado);
        janela.add(jTextFieldNumero1);
        janela.add(jTextFieldNumero2);
        janela.add(jScrollPaneResultado);
        janela.add(jButtonSomar);
        janela.add(jButtonSubtrair);
        janela.add(jButtonMultiplicar);
        janela.add(jButtonDividir);
    }

    @Override
    public void gerarLocalizacao() {
        jLabelNumero1.setLocation(10, 10);
        jLabelNumero2.setLocation(10, 80);
        jLabelResultado.setLocation(225, 10);
        jTextFieldNumero1.setLocation(10, 35);
        jTextFieldNumero2.setLocation(10, 105);
        jScrollPaneResultado.setLocation(225, 35);
        jButtonSomar.setLocation(10, 150);
        jButtonSubtrair.setLocation(120, 150);
        jButtonMultiplicar.setLocation(10, 215);
        jButtonDividir.setLocation(120, 215);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero1.setSize(200, 20);
        jLabelNumero2.setSize(200, 20);
        jLabelResultado.setSize(200, 20);
        jTextFieldNumero1.setSize(200, 35);
        jTextFieldNumero2.setSize(200, 35);
        jScrollPaneResultado.setSize(250, 240);
        jButtonSomar.setSize(90, 60);
        jButtonSubtrair.setSize(90, 60);
        jButtonMultiplicar.setSize(90, 60);
        jButtonDividir.setSize(90, 60);
    }

    public void configurarJScrollPane() {
        jScrollPaneResultado.setViewportView(jTextAreaResultado);
        jScrollPaneResultado.setHorizontalScrollBarPolicy(
                jScrollPaneResultado.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneResultado.setVerticalScrollBarPolicy(
                jScrollPaneResultado.VERTICAL_SCROLLBAR_ALWAYS);

    }

    public void verificacaoTry() {
        if (jTextFieldNumero1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                    null, "DIGITE O NUMERO NA POSIÇÃO 1");
            return;
        }
        if (jTextFieldNumero2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                    null, "DIGITE O NUMERO NA POSIÇÃO 2");
            return;
        }

        try {
            this.numero1 = Double.parseDouble(jTextFieldNumero1.getText().trim());
            this.numero2 = Double.parseDouble(jTextFieldNumero2.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,
                    "Cê é burro cara?\n DIGITE APENAS NUMEROS");
            return;
        }
    }

    public void AcaoButton() {
        
        jButtonSomar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificacaoTry();
                double resultado = 0;
                jButtonSomar.setToolTipText("Somar");
                resultado = numero1 + numero2;
                String resultadoEmTexto = Double.toString(resultado);
                jTextAreaResultado.setText(resultadoEmTexto);
                jScrollPaneResultado.setToolTipText(resultadoEmTexto);
             
                   
    
            }
        });
        jButtonSubtrair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificacaoTry();
                double resultado = 0;
                jButtonSubtrair.setToolTipText("Subtrair");
                resultado = numero1 - numero2;
                String resultadoEmTexto = Double.toString(resultado);
                jTextAreaResultado.setText(resultadoEmTexto);
                jScrollPaneResultado.setToolTipText(resultadoEmTexto);
             
                   
    
            }
        });
        jButtonMultiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificacaoTry();
                double resultado = 0;
                jButtonMultiplicar.setToolTipText("Multiplicar");
                resultado = numero1 * numero2;
                String resultadoEmTexto = Double.toString(resultado);
                jTextAreaResultado.setText(resultadoEmTexto);
                jScrollPaneResultado.setToolTipText(resultadoEmTexto);
             
                   
    
            }
        });
        jButtonDividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificacaoTry();
                double resultado = 0;
                jButtonDividir.setToolTipText("Dividir");
                resultado = numero1 / numero2;
                String resultadoEmTexto = Double.toString(resultado);
                jTextAreaResultado.setText(resultadoEmTexto);
                jScrollPaneResultado.setToolTipText(resultadoEmTexto);
             
                   
    
            }
        });
        
        
    }
}
