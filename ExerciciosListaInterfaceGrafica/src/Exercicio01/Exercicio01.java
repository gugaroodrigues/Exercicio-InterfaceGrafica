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



 
 // @author Gus
 
public class Exercicio01 implements BaseInterfaceExercicio{
    
    private JFrame tela;
    private JLabel jLabelNome, jLabelSobrenome;
    private JTextField jTextFieldNome, jTextFieldSobrenome;
    private JButton jButtonConcalternar;

    
    public Exercicio01() {
           gerarTela();         
           instanciarComponentes();
           gerarLocalizacao();
           gerarDimensoes();
           adicionarComponentes();
           acaoBotão();
           tela.setVisible(true);
                  }
       
    @Override
    public void gerarTela() {
        
        
        
        tela = new JFrame("Exercicio 01");
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setLayout(null);
        tela.setSize(300, 200);
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
        jLabelNome.setLocation(20, 10);
        jLabelSobrenome.setLocation(20, 60);
        
        jTextFieldNome.setLocation(20, 30);
        jTextFieldSobrenome.setLocation(20, 80);
        
        jButtonConcalternar.setLocation(20, 120);
        
    }

    public void gerarDimensoes() {
        jLabelNome.setSize(60, 20);
        jLabelSobrenome.setSize(120, 20);
        
        jTextFieldNome.setSize(250, 25);
        jTextFieldSobrenome.setSize(250, 25);
        
        jButtonConcalternar.setSize(250, 25);
    }

    public void acaoBotão(){
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
                JOptionPane.showMessageDialog(null, "Nome Completo: " + nomeCompleto);
                return;
                
            }
        });
    }
    
  
    
}
