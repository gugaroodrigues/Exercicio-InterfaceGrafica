package Exercicio01;
  
import java.awt.LayoutManager;
import javax.swing.DefaultComboBoxModel;
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
        configurarJCombox();
        jFrame.setVisible(true);

    }

    @Override
    public void gerarTela() {

        jFrame = new JFrame();
        jFrame.setSize(645, 446);
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
        jTextFieldNome.setLocation(11, 30);
        jTextFieldIdade.setLocation(419, 30);
        jTextFielApelido.setLocation(195, 88 );
        jTextFielPreco.setLocation(419, 88);
        
        jLabelNome.setLocation(11, 5);
        jLabelIdade.setLocation(419, 5);
        jLabelRaca.setLocation(11, 60);
        jLabelApelido.setLocation(195, 60);
        jLabelPreco.setLocation(419, 60);
        jLabelDescricao.setLocation(11, 183);
        
        jRadioButtonVivo.setLocation(11 , 125);
        jRadioButtonMorto.setLocation(11, 157);
        jRadioButtonRacao.setLocation(110, 125);
        jRadioButtonCome.setLocation(110, 157);
        
        jCheckBoxAdestrado.setLocation(360, 125 );
        jCheckBoxCastrado.setLocation(465, 125 );
        jCheckBoxVacinado.setLocation(360, 157 );
        jCheckBoxTemPedigri.setLocation(465, 157 );
        
        jComboBoxRaca.setLocation(11, 88);
        
        jTextAreaDescricao.setLocation(11, 211);
        
        jButtonSalvar.setLocation(473, 319 );
        jButtonCancelar.setLocation(315, 319);
    }

    @Override
    public void gerarDimensoes() {
        jTextFieldNome.setSize(368, 24 );
        jTextFieldIdade.setSize(204, 24);
        jTextFielApelido.setSize(184, 24);
        jTextFielPreco.setSize(204, 24);
        
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
   
        jComboBoxRaca.setSize(150, 20);
        
        jTextAreaDescricao.setSize(610, 95);
        
        jButtonSalvar.setSize(150, 78);
        jButtonCancelar.setSize(150, 78);
    }
    
    public void configurarJCombox(){
        
        
        DefaultComboBoxModel racas = new DefaultComboBoxModel(
                new Object[]{
                    "Pastor-alemão", "Labrador retriever", "Buldogue", "Poodle",
                    "Beagle", "Golden retriever", "Chihuahua", "Pug",
                    "Rottweiler", "Husky siberiano", "Boxer", "Pit bull"
                }
        );
        jComboBoxRaca.setModel(racas);
        jComboBoxRaca.setSelectedIndex(-1);   
    }
    
    public void AcaoJButton(){
        
        
        
    }
    
    

    
    
    

}
