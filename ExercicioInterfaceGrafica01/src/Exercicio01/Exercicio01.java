package Exercicio01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Gustavo
 */
public class Exercicio01 implements BaseExercicio01 {

    private JFrame jFrame;
    private JTextField jTextFieldNome, jTextFieldIdade,
            jTextFieldApelido, jTextFieldPreco;
    
    private JComboBox jComboBoxRaca;
    
    private JRadioButton jRadioButtonVivo, jRadioButtonRacao, jRadioButtonMorto,
            jRadioButtonCome;
    
    private ButtonGroup buttonGroupVivoMorto, buttonGroupCome;
    
    private JCheckBox jCheckBoxAdestrado, jCheckBoxCastrado, jCheckBoxVacinado,
            jCheckBoxTemPedigri;
    
    private JLabel jLabelNome, jLabelIdade, jLabelApelido, jLabelPreco,
            jLabelRaca, jLabelDescricao, jLabelObrigatorio;
    
    private JTextArea jTextAreaDescricao;

    private JButton jButtonSalvar, jButtonCancelar, jButtonSobre;
    
    private JScrollPane jScrollPaneDiscricao;
    
    

    public Exercicio01() {
        ConfigurandoLookAndFeel();
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarDimensoes();
        gerarLocalizacao();
        configurarJCombox();
        acaoJButtonSalvar();
        acaoJButtonCancelar();
        estilizarBordasComponentes();
        estilizarComponentes();
        configurarJScrollPane();
        definirButtonGroup();
        jFrame.setVisible(true);

    }

    @Override
    public void gerarTela() {

        jFrame = new JFrame();
        jFrame.setSize(645, 446);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.getContentPane().setBackground(
                Color.decode("#c9cfdb"));

    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldIdade);
        jFrame.add(jTextFieldPreco);
        jFrame.add(jTextFieldApelido);

        jFrame.add(jLabelNome);
        jFrame.add(jLabelIdade);
        jFrame.add(jLabelRaca);
        jFrame.add(jLabelApelido);
        jFrame.add(jLabelPreco);
        jFrame.add(jLabelDescricao);
        jFrame.add(jLabelObrigatorio);

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
        jFrame.add(jButtonSobre);
        jFrame.add(jScrollPaneDiscricao);
        
    }

    @Override
    public void instanciarComponentes() {
        jTextFieldNome = new JTextField();
        jTextFieldIdade = new JTextField();
        jTextFieldPreco = new JTextField();
        jTextFieldApelido = new JTextField();

        jLabelNome = new JLabel("Nome");
        jLabelIdade = new JLabel("Idade");
        jLabelRaca = new JLabel("Raça");
        jLabelApelido = new JLabel("Apelido");
        jLabelPreco = new JLabel("Preço");
        jLabelDescricao = new JLabel("Descrição");
        jLabelObrigatorio = new JLabel("Preenchimento obrigatorio");
        
        jRadioButtonVivo = new JRadioButton("Vivo");
        jRadioButtonMorto = new JRadioButton("Morto");
        jRadioButtonRacao = new JRadioButton("Ração");
        jRadioButtonCome = new JRadioButton("Come almoços, janta");
        
        buttonGroupVivoMorto = new ButtonGroup();
        buttonGroupCome = new ButtonGroup();

        jCheckBoxAdestrado = new JCheckBox("Adestrado");
        jCheckBoxCastrado = new JCheckBox("Castrado");
        jCheckBoxVacinado = new JCheckBox("Vacinado");
        jCheckBoxTemPedigri = new JCheckBox("Tem pedigree?");

        jComboBoxRaca = new JComboBox();

        jTextAreaDescricao = new JTextArea();

        jButtonSalvar = new JButton("Salvar");
        jButtonCancelar = new JButton("Cancelar");
        jButtonSobre = new JButton("Sobre");
        
        jScrollPaneDiscricao = new JScrollPane();

    }

    @Override
    public void gerarLocalizacao() {
        jTextFieldNome.setLocation(11, 30);
        jTextFieldIdade.setLocation(419, 30);
        jTextFieldApelido.setLocation(195, 88);
        jTextFieldPreco.setLocation(419, 88);

        jLabelNome.setLocation(11, 5);
        jLabelIdade.setLocation(419, 5);
        jLabelRaca.setLocation(11, 60);
        jLabelApelido.setLocation(195, 60);
        jLabelPreco.setLocation(419, 60);
        jLabelDescricao.setLocation(11, 183);
        jLabelObrigatorio.setLocation(11, 300);

        jRadioButtonVivo.setLocation(11, 125);
        jRadioButtonMorto.setLocation(11, 157);
        jRadioButtonRacao.setLocation(110, 125);
        jRadioButtonCome.setLocation(110, 157);

        jCheckBoxAdestrado.setLocation(360, 125);
        jCheckBoxCastrado.setLocation(465, 125);
        jCheckBoxVacinado.setLocation(360, 157);
        jCheckBoxTemPedigri.setLocation(465, 157);

        jComboBoxRaca.setLocation(11, 88);

        //jTextAreaDescricao.setLocation(11, 211);
        jScrollPaneDiscricao.setLocation(11, 211);       

        jButtonSalvar.setLocation(473, 319);
        jButtonCancelar.setLocation(315, 319);
        jButtonSobre.setLocation(-1, 388);
    }

    @Override
    public void gerarDimensoes() {
        jTextFieldNome.setSize(368, 24);
        jTextFieldIdade.setSize(204, 24);
        jTextFieldApelido.setSize(184, 24);
        jTextFieldPreco.setSize(204, 24);

        jLabelNome.setSize(60, 20);
        jLabelIdade.setSize(60, 20);
        jLabelRaca.setSize(60, 20);
        jLabelApelido.setSize(60, 20);
        jLabelPreco.setSize(60, 20);
        jLabelDescricao.setSize(60, 20);
        jLabelObrigatorio.setSize(200, 20);

        jRadioButtonVivo.setSize(100, 20);
        jRadioButtonMorto.setSize(100, 20);
        jRadioButtonRacao.setSize(100, 20);
        jRadioButtonCome.setSize(150, 20);

        jCheckBoxAdestrado.setSize(100, 20);
        jCheckBoxCastrado.setSize(100, 20);
        jCheckBoxVacinado.setSize(100, 20);
        jCheckBoxTemPedigri.setSize(150, 20);

        jComboBoxRaca.setSize(150, 20);

        //jTextAreaDescricao.setSize(610, 95);
        jScrollPaneDiscricao.setSize(610, 95);

        jButtonSalvar.setSize(150, 78);
        jButtonCancelar.setSize(150, 78);
        jButtonSobre.setSize(70, 20);
    }

    public void configurarJCombox() {

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

    public void acaoJButtonSalvar() {
        jButtonSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jCheckBoxAdestrado.isSelected()
                        && !jCheckBoxCastrado.isSelected()
                        && !jCheckBoxVacinado.isSelected()
                        && !jCheckBoxTemPedigri.isSelected()) {
                    JOptionPane.showMessageDialog(null,
                            "Opções não definidas");
                    return;
                }
                if (!jRadioButtonVivo.isSelected()
                        && !jRadioButtonMorto.isSelected()
                        && !jRadioButtonRacao.isSelected()
                        && !jRadioButtonCome.isSelected()){
                    JOptionPane.showMessageDialog(null,
                            "Opções não definidas");
                    return;
                }
               
        if ((jTextFieldNome.getText().length()>0)
                &&(jTextFieldIdade.getText().length()> 0)
                && (jTextFieldPreco.getText().length() > 0)
                && (jTextFieldApelido.getText().length() > 0)
                &&(jTextAreaDescricao.getText().length() > 0)){
                
            jLabelObrigatorio.setVisible(false);
            
        } else {
            jLabelObrigatorio.setVisible(true);
            JOptionPane.showMessageDialog(null,"Verifique todos os campos");
                   
                }
               
            }
        });              
    }

 
    private void acaoJButtonCancelar() {
        
        
    }
      
    private void estilizarBordasComponentes() {
        jRadioButtonVivo.setContentAreaFilled(false);
        jRadioButtonMorto.setContentAreaFilled(false);
        jRadioButtonRacao.setContentAreaFilled(false);
        jRadioButtonCome.setContentAreaFilled(false);
        
        jCheckBoxAdestrado.setContentAreaFilled(false);
        jCheckBoxCastrado.setContentAreaFilled(false);
        jCheckBoxTemPedigri.setContentAreaFilled(false);
        jCheckBoxVacinado.setContentAreaFilled(false);
               
    }
    
    private void estilizarComponentes(){
        
        jTextFieldNome.setForeground(Color.decode("#0f0f0f"));
        jTextFieldNome.setBackground(Color.decode("#eff1f4"));
        jTextFieldIdade.setForeground(Color.decode("#0f0f0f"));
        jTextFieldIdade.setBackground(Color.decode("#eff1f4"));
        jTextFieldPreco.setForeground(Color.decode("#0f0f0f"));
        jTextFieldPreco.setBackground(Color.decode("#eff1f4"));
        jTextFieldApelido.setForeground(Color.decode("#0f0f0f"));
        jTextFieldApelido.setBackground(Color.decode("#eff1f4"));
        
        jLabelObrigatorio.setForeground(Color.decode("#f20602"));
        
        jTextAreaDescricao.setForeground(Color.decode("#0f0f0f"));
        jTextAreaDescricao.setBackground(Color.decode("#eff1f4"));
        
        jComboBoxRaca.setForeground(Color.decode("#0f0f0f"));
        jComboBoxRaca.setBackground(Color.decode("#eff1f4"));
        
        jButtonSobre.setBackground(Color.decode("#c9cfdb"));
        
        //"#031d72"
         
    }
    
    private void configurarJScrollPane() {
        jScrollPaneDiscricao.setViewportView(jTextAreaDescricao);
        jScrollPaneDiscricao.setHorizontalScrollBarPolicy(
          JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneDiscricao.setVerticalScrollBarPolicy(
          JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jTextAreaDescricao.setLineWrap(true);
    }
    
    private void definirButtonGroup(){
        buttonGroupVivoMorto.add(jRadioButtonVivo);
        buttonGroupVivoMorto.add(jRadioButtonMorto);
        buttonGroupCome.add(jRadioButtonRacao);
        buttonGroupCome.add(jRadioButtonCome);
    }

    public static void ConfigurandoLookAndFeel() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (UnsupportedLookAndFeelException e) {

        } catch (ClassNotFoundException e) {

        } catch (InstantiationException e) {
            
        } catch (IllegalAccessException e) {
            
        }
    }
    
}

    
    
    
    
    



