/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio02;

import Exercicio01.BaseInterfaceExercicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Gus
 */
public class Exercicio02 implements BaseInterfaceExercicio {

    private JFrame jFrameTela;
    private JLabel jLabelNumero, jLabelResultado, jLabelResultadoFinal;
    private JTextField jTextFieldNumero;
    private JButton jButtonGerar;

    public Exercicio02() {
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarDimensoes();
        gerarLocalizacao();
        AcaoGerar();
        jFrameTela.setVisible(true);
    }

   


@Override
        public void gerarTela() {
        jFrameTela = new JFrame("Exercicio 02");
        jFrameTela.setIconImage( new ImageIcon(Exercicio02.class.getResource
                ("/Icons/matematica.png")).getImage());
        jFrameTela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrameTela.setLayout(null);
        jFrameTela.setSize(300, 250);
        jFrameTela.setLocationRelativeTo(null);
        
    }

    @Override
        public void instanciarComponentes() {
        jLabelNumero = new JLabel("Numero");
        jLabelResultado = new JLabel("Resultado\n");
        jLabelResultadoFinal = new JLabel();
        jTextFieldNumero = new JTextField();
        jButtonGerar = new JButton("Gerar");
    }

    @Override
        public void adicionarComponentes() {
        jFrameTela.add(jLabelNumero);
        jFrameTela.add(jLabelResultado).setVisible(false);
        jFrameTela.add(jLabelResultadoFinal);
        jFrameTela.add(jTextFieldNumero);
        jFrameTela.add(jButtonGerar);
    }

    @Override
        public void gerarLocalizacao() {
        jLabelNumero.setLocation(20, 10);
        jLabelResultado.setLocation(20, 135);
        jLabelResultadoFinal.setLocation(20, 160);
        
        jTextFieldNumero.setLocation(20, 30);      
        jButtonGerar.setLocation(20, 80);
        
    }

    @Override
        public void gerarDimensoes() {
        jLabelNumero.setSize(250, 20);
        jLabelResultado.setSize(250, 20);
        jLabelResultadoFinal.setSize(250, 20);
        jTextFieldNumero.setSize(250, 25);
        jButtonGerar.setSize(250, 50);
    }
    
    public void AcaoGerar(){
        jButtonGerar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            String numero = jTextFieldNumero.getText().trim().replace(",", "")
                        .replace(" ", "");  
            int resultado = 0;
           
                    
                    if(jTextFieldNumero.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(null,
                        "Campo vazio, Digite um numero");
                    jTextFieldNumero.requestFocus();
                    return;
                    }
                    
                
             try{     
                 resultado = Integer.parseInt(numero);
                 resultado = resultado * 50;
                 
                 jLabelResultado.setVisible(true);
                 jLabelResultadoFinal.setVisible(true);
                 
                 
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, 
                            "Cê é burro cara ?\n Digite apenas numeros");
                    jTextFieldNumero.requestFocus();
                    return;
                    
                }
             String resultadoEmTexto = Integer.toString(resultado);
             jLabelResultadoFinal.setText(resultadoEmTexto);
            
            }
        });
        
        
    }
        
}
