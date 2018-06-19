package Exercicio01;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Gustavo
 */
public class Exercicio01 implements BaseExercicio01 {

    private JFrame jFrame;
    private JTextField jTextFieldNome, jTextFieldIdade,
            jTextFielApelido, jTextFielPreco;
    private JComboBox jComboBoxRaca;
    private JRadioButton jRadioButtonVivo, jRadioButtonRacao, jRadioButtonMorto,
            jRadioButtonCome;
    private JCheckBox jCheckBoxAdestrado, jCheckBoxCastrado, jCheckBoxVacinado,
            jCheckBoxTemPedigri;
    private JLabel jLabelNome, jLabelIdade, jLabelApelido, jLabelPreco,
            jLabelRaca, jLabelDescricao;
    private JTextArea jTextAreaDescricao;

    public Exercicio01() {
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarDimensoes();
        gerarLocalizacao();
        jFrame.setVisible(true);

    }

    @Override
    public void gerarTela() {

        jFrame = new JFrame();
        jFrame.setSize(650, 450);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        

    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldIdade);
        jFrame.add(jTextFielPreco);
        jFrame.add(jTextFielApelido);
        jFrame.add(jLabelNome);
        jFrame.add(jLabelIdade);
        jFrame.add(jLabelRaca);
        jFrame.add(jLabelApelido);
        jFrame.add(jLabelPreco);
        jFrame.add(jComboBoxRaca);
        jFrame.add(jRadioButtonVivo);
        jFrame.add(jRadioButtonMorto);
        jFrame.add(jRadioButtonRacao);
        jFrame.add(jRadioButtonCome);
        
    }

    
    @Override
    public void instanciarComponentes() {
        jTextFieldNome = new JTextField();
        jTextFieldIdade = new JTextField();
        jTextFielPreco = new JTextField();
        jTextFielApelido = new JTextField();
        jLabelNome = new JLabel("Nome");
        jLabelIdade = new JLabel("Idade");
        jLabelRaca = new JLabel("Raça");
        jLabelApelido = new JLabel("Apelido");
        jLabelPreco = new JLabel("Preço");
        jComboBoxRaca = new JComboBox();
        jRadioButtonVivo = new JRadioButton("Vivo");
        jRadioButtonMorto = new JRadioButton("Morto");
        jRadioButtonRacao = new JRadioButton("Ração");
        jRadioButtonCome = new JRadioButton("Come");
        
    }

    @Override
    public void gerarLocalizacao() {
        jTextFieldNome.setLocation(11, 35);
        jTextFieldIdade.setLocation(425, 35);
        jTextFielApelido.setLocation(220, 78 );
        jTextFielPreco.setLocation(425, 78);
        jLabelNome.setLocation(11, 15);
        jLabelIdade.setLocation(425, 15);
        jLabelRaca.setLocation(11, 60);
        jLabelApelido.setLocation(220, 60);
        jLabelPreco.setLocation(425, 60);
        jComboBoxRaca.setLocation(11, 78);
        jRadioButtonVivo.setLocation(12, 90);
        jRadioButtonMorto.setLocation(12, 100);
        jRadioButtonRacao.setLocation(EXIT_ON_CLOSE, EXIT_ON_CLOSE);
        jRadioButtonCome.setLocation(EXIT_ON_CLOSE, EXIT_ON_CLOSE);
        
    }

    @Override
    public void gerarDimensoes() {
        jTextFieldNome.setSize(400, 23 );
        jTextFieldIdade.setSize(205, 23);
        jTextFielApelido.setSize(190, 23);
        jTextFielPreco.setSize(204, 23);
        jLabelNome.setSize(60, 20);
        jLabelIdade.setSize(60, 20);
        jLabelRaca.setSize(60, 20);
        jLabelApelido.setSize(60, 20);
        jLabelPreco.setSize(60, 20);
        jComboBoxRaca.setSize(190, 23);
        jRadioButtonVivo.setSize(EXIT_ON_CLOSE, EXIT_ON_CLOSE);
        jRadioButtonMorto.setSize(EXIT_ON_CLOSE, EXIT_ON_CLOSE);
        jRadioButtonRacao.setSize(EXIT_ON_CLOSE, EXIT_ON_CLOSE);
        jRadioButtonCome.setSize(EXIT_ON_CLOSE, EXIT_ON_CLOSE);
    }
    
    
    public void configurarJCombox(){
        
        
    }

}
