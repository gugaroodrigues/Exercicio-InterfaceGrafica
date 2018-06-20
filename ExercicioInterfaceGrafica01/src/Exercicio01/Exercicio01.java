package Exercicio01;

import javax.swing.JButton;
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
    
    private JButton jButtonSalvar, jButtonCancelar;

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
        jFrame.setSize(617, 432);
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
        jFrame.add(jLabelDescricao);
        
        jFrame.add(jRadioButtonVivo);
        jFrame.add(jRadioButtonMorto);
        jFrame.add(jRadioButtonRacao);
        jFrame.add(jRadioButtonCome);

        jFrame.add(jComboBoxRaca);
        
        jFrame.add(jCheckBoxAdestrado);
        jFrame.add(jCheckBoxCastrado);
        jFrame.add(jCheckBoxVacinado);
        jFrame.add(jCheckBoxTemPedigri);
        
        jFrame.add(jTextAreaDescricao);
        
        jFrame.add(jButtonSalvar);
        jFrame.add(jButtonCancelar);
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
        jLabelDescricao = new JLabel("Descrição");
        
        jRadioButtonVivo = new JRadioButton("Vivo");
        jRadioButtonMorto = new JRadioButton("Morto");
        jRadioButtonRacao = new JRadioButton("Ração");
        jRadioButtonCome = new JRadioButton("Come almoços, janta");
        
        jCheckBoxAdestrado = new JCheckBox("Adestrado");
        jCheckBoxCastrado = new JCheckBox("Castrado");
        jCheckBoxVacinado = new JCheckBox("Vacinado");
        jCheckBoxTemPedigri = new JCheckBox("Tem pedigree?");
        
        jComboBoxRaca = new JComboBox();
        
        jTextAreaDescricao = new JTextArea();
        
        jButtonSalvar = new JButton("Salvar");
        jButtonCancelar = new JButton("Cancelar");
        
    }

    @Override
    public void gerarLocalizacao() {
        jTextFieldNome.setLocation(8, 30);
        jTextFieldIdade.setLocation(399, 30);
        jTextFielApelido.setLocation(190, 88 );
        jTextFielPreco.setLocation(399, 88);
        
        jLabelNome.setLocation(8, 5);
        jLabelIdade.setLocation(398, 5);
        jLabelRaca.setLocation(8, 60);
        jLabelApelido.setLocation(190, 60);
        jLabelPreco.setLocation(398, 60);
        jLabelDescricao.setLocation(8, 183);
        
        jRadioButtonVivo.setLocation(8 , 125);
        jRadioButtonMorto.setLocation(8, 157);
        jRadioButtonRacao.setLocation(110, 125);
        jRadioButtonCome.setLocation(110, 157);
        
        jCheckBoxAdestrado.setLocation(328, 125 );
        jCheckBoxCastrado.setLocation(425, 125 );
        jCheckBoxVacinado.setLocation(328, 157 );
        jCheckBoxTemPedigri.setLocation(425, 157 );
        
        jComboBoxRaca.setLocation(8, 88);
        
        jTextAreaDescricao.setLocation(8, 211);
        
        jButtonSalvar.setLocation(453, 319 );
        jButtonCancelar.setLocation(305, 319);
    }

    @Override
    public void gerarDimensoes() {
        jTextFieldNome.setSize(342, 23 );
        jTextFieldIdade.setSize(195, 23);
        jTextFielApelido.setSize(162, 23);
        jTextFielPreco.setSize(195, 23);
        
        jLabelNome.setSize(60, 20);
        jLabelIdade.setSize(60, 20);
        jLabelRaca.setSize(60, 20);
        jLabelApelido.setSize(60, 20);
        jLabelPreco.setSize(60, 20);
        jLabelDescricao.setSize(60, 20);
        
        jRadioButtonVivo.setSize(100, 20 );
        jRadioButtonMorto.setSize(100, 20 );
        jRadioButtonRacao.setSize(100, 20 );
        jRadioButtonCome.setSize(150, 20 );
        
        jCheckBoxAdestrado.setSize(100, 20 );
        jCheckBoxCastrado.setSize(100, 20 );
        jCheckBoxVacinado.setSize(100, 20 );
        jCheckBoxTemPedigri.setSize(150, 20 );
   
        jComboBoxRaca.setSize(125, 20);
        
        jTextAreaDescricao.setSize(584, 95);
        
        jButtonSalvar.setSize(140, 70);
        jButtonCancelar.setSize(140, 70);
    }
    
    
    
    public void configurarJCombox(){
        
        
    }

}
