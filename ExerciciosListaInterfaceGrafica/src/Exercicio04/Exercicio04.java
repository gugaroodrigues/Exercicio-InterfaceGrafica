/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio04;

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
public class Exercicio04 implements BaseInterfaceExercicio {

    private JFrame janela;
    private JLabel jLabelNumero, imagem;
    private JTextField jTextFieldNumero;
    private JButton jButtonVerificar;

    public Exercicio04() {
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarLocalizacao();
        gerarDimensoes();
        gerarAcao();
        janela.setVisible(true);
    }

    @Override
    public void gerarTela() {
        janela = new JFrame("Exercicio05");
        janela.setIconImage( new ImageIcon(Exercicio04.class.getResource
                ("/Icons/matematica.png")).getImage());
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setLayout(null);
        janela.setSize(300, 200);
        janela.setLocationRelativeTo(null);

    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero = new JLabel("Numero");
        //imagem = new JLabel();
        
        jTextFieldNumero = new JTextField();
        jButtonVerificar = new JButton("Verificar");
    }

    @Override
    public void adicionarComponentes() {
        janela.add(jLabelNumero);
        //janela.add(imagem).setVisible(false);;
        janela.add(jTextFieldNumero);
        janela.add(jButtonVerificar);
    }

    @Override
    public void gerarLocalizacao() {
        jLabelNumero.setLocation(10, 10);
        //imagem.setLocation(0, 0);
        jTextFieldNumero.setLocation(10, 35);
        jButtonVerificar.setLocation(10, 100);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero.setSize(100, 20);
        //imagem.setSize(300, 200);
        jTextFieldNumero.setSize(265, 30);
        jButtonVerificar.setSize(265, 40);

    }
    
    public void gerarAcao(){
        jButtonVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int numero = 0;
                
                if(jTextFieldNumero.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(
                            null, "DIGITE ALGUM NUMERO");
                    return;
                }
                
                
                try{
                    numero =  Integer.parseInt(jTextFieldNumero.getText().trim());
                }catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, 
                            "Cê é burro cara?\n DIGITE APENAS NUMEROS");
                    return;
                }
                
                if ( numero >= 9001){
                    JOptionPane.showMessageDialog(null,null, null, 
                            JOptionPane.PLAIN_MESSAGE, new ImageIcon(
                Exercicio04.class.getResource("/Icons/9000.gif"))
        );
                }
                
                
                if(numero %2 == 0 && numero > 0){
                    JOptionPane.showMessageDialog(null,
                            "O numero " + numero + " é\n Par e Positivo");   
                }
                if (numero %2 != 0&& numero > 0){
                    JOptionPane.showMessageDialog(null,
                            "O numero " + numero + " é\n Ímpar e Positivo");   
                }
                if (numero %2 == 0 && numero < 0){
                    JOptionPane.showMessageDialog(null,
                            "O numero " + numero + " é\n Par e Negativo");   
                }
                if (numero %2 != 0 && numero < 0){
                    JOptionPane.showMessageDialog(null,
                            "O numero " + numero + " é\n Ímpar e Negativo");   
                }
                if ( numero == 0){
                    JOptionPane.showMessageDialog(null,
                            "O numero " + numero + " é Neutro");  
                }
                
                
 
            }
        });
    }

}
