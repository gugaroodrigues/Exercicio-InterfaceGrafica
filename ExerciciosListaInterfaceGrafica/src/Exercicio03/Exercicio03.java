
package Exercicio03;

import Exercicio01.BaseInterfaceExercicio;
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
 * @author Gus
 */
public class Exercicio03 implements BaseInterfaceExercicio{
    private JFrame tela;
    private JLabel jLabelNumero, jLabelTabuada;
    private JTextField jTextFieldNumero;
    private JScrollPane jScrollPaneTabuada;
    private JTextArea jTextAreaTabuada;
    private JButton jButtonGerarTabuada;
    
    public Exercicio03(){
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarDimensoes();
        gerarLocalizacao();
        acaoGerarTabuada();
        configurarJScrollPane();
        tela.setVisible(true);
    }

    @Override
    public void gerarTela() {
        tela = new JFrame("Exercicio 03");
        tela.setIconImage( new ImageIcon(Exercicio03.class.getResource
                ("/Icons/matematica.png")).getImage());
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setLayout(null);
        tela.setSize(500, 300);
        tela.setLocationRelativeTo(null);
        
    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero = new JLabel("Numero");
        jLabelTabuada = new JLabel("Tabuada");
        jScrollPaneTabuada = new JScrollPane();
        jTextAreaTabuada = new JTextArea();
        jTextFieldNumero = new JTextField();
        jButtonGerarTabuada = new JButton("TABUADA");
    }

    @Override
    public void adicionarComponentes() {
        tela.add(jLabelNumero);
        tela.add(jLabelTabuada);
        tela.add(jScrollPaneTabuada);
        tela.add(jTextFieldNumero);
        tela.add(jButtonGerarTabuada);

    }
    
    @Override
    public void gerarLocalizacao() {
        jLabelNumero.setLocation(10, 10);
        jLabelTabuada.setLocation(240,10 );
        jScrollPaneTabuada.setLocation(240, 30);
        jTextFieldNumero.setLocation(10, 50);
        jButtonGerarTabuada.setLocation(10, 100);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero.setSize(220, 25);
        jLabelTabuada.setSize(250, 25 );
        jScrollPaneTabuada.setSize(230, 220);
        jTextFieldNumero.setSize(220, 30);
        jButtonGerarTabuada.setSize(220, 65);
    }
    
    private void configurarJScrollPane(){
        jScrollPaneTabuada.setViewportView(jTextAreaTabuada);
        jScrollPaneTabuada.setHorizontalScrollBarPolicy(
            jScrollPaneTabuada.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneTabuada.setVerticalScrollBarPolicy(
            jScrollPaneTabuada.VERTICAL_SCROLLBAR_ALWAYS);
        
    }
    
    private void acaoGerarTabuada(){
        jButtonGerarTabuada.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                if(jTextFieldNumero.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(
                            null, "DIGITE ALGUM NUMERO");
                    return;
                }
                
                
                long numero = 0;
                try{
                    numero =  Long.parseLong(jTextFieldNumero.getText().trim());
                }catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, 
                            "Cê é burro cara?\n DIGITE APENAS NUMEROS");
                    return;
                }
                String resultadoTexto = "";
                for (int i = 1; i <= 20; i++) {
                    resultadoTexto += i +"° - " + i + 
                            " x " + numero + " = " + (numero * i)+ "\n";
                   
                }
                jTextAreaTabuada.setText( resultadoTexto);
            }
        });
    }
    
}
