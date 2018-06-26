/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


 
 // @author Gus
 
public class Exercicio01 implements BaseInterfaceExercicio{
    
    private JFrame tela;
    private JLabel jLabelNome, jLabelSobrenome;
    private JTextField jTextFieldNome, jTextFieldSobrenome;
    private JButton jButtonConcalternar;

    
       public Exercicio01() {
           ConfigurandoLookAndFeel();
           gerarTela();
           instanciarComponentes();
           gerarLocalizacao();
           gerarDimensoes();
           adicionarComponentes();
           acaoBotão();
           tela.setVisible(true);
                  }
       
     
       
    

    public static void ConfigurandoLookAndFeel() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
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
    @Override
    public void gerarTela() {
        
        
        
        tela = new JFrame("Exercio 01");
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setLayout(null);
        tela.setSize(300, 300);
        tela.setLocationRelativeTo(null);
        
    }

    @Override
    public void instanciarComponentes() {
        jLabelNome = new JLabel("Nome");
        jLabelSobrenome = new JLabel("Sobrenome");
        jTextFieldNome = new JTextField();
        jTextFieldSobrenome = new JTextField();
        jButtonConcalternar = new JButton("Calcaternar");
        
    }

    @Override
    public void adicionarComponentes() {
        tela.add(jLabelNome);
        tela.add(jLabelSobrenome);
        tela.add(jTextFieldNome);
        tela.add(jTextFieldSobrenome);
        tela.add(jButtonConcalternar);
        
        
        
    }

    @Override
    public void gerarLocalizacao() {
        jLabelNome.setLocation(5, 10);
        jLabelSobrenome.setLocation(5, 60);
        
        jTextFieldNome.setLocation(5, 30);
        jTextFieldSobrenome.setLocation(5, 80);
        
        jButtonConcalternar.setLocation(5, 120);
        
    }

    public void gerarDimensoes() {
        jLabelNome.setSize(60, 20);
        jLabelSobrenome.setSize(120, 20);
        
        jTextFieldNome.setSize(180, 20);
        jTextFieldSobrenome.setSize(180, 20);
        
        jButtonConcalternar.setSize(180, 20);
    }

    private void acaoBotão(){
        jButtonConcalternar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                String nome = jTextFieldNome.getText().trim().replace(".", "")
                        .replace("-", "").replace(",", "");
                String sobrenome = jTextFieldSobrenome.getText().trim().replace(".", "")
                        .replace("-", "").replace(",", "");
   
                if(jTextFieldNome.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, 
                            "O nome deve ser preenchido");
                    jTextFieldNome.requestFocus();
                    return;
                }
                
                if(jTextFieldSobrenome.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, 
                            "Sobrenome dever ser preenchido");
                    jTextFieldSobrenome.requestFocus();
                    return;
                }
                String nomeCompleto = " ";
                nomeCompleto = nome +" " + sobrenome;
                JOptionPane.showMessageDialog(null, "Nome Completo " + nomeCompleto);
                return;
                
            }
        });
    }
    
}
