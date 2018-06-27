
package Exercicio03;

import Exercicio01.BaseInterfaceExercicio;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
        tela.setVisible(true);
    }

    @Override
    public void gerarTela() {
        tela = new JFrame("Exercicio 03");
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setLayout(null);
        tela.setSize(400, 400);
        tela.setLocationRelativeTo(null);
        
    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero = new JLabel("Numero");
        jLabelTabuada = new JLabel("Tabuada");
    }

    @Override
    public void adicionarComponentes() {
    }

    @Override
    public void gerarLocalizacao() {
    }

    @Override
    public void gerarDimensoes() {
    }
    
}
