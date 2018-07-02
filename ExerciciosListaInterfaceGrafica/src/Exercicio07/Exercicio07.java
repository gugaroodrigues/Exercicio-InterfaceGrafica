/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio07;

import Exercicio01.BaseInterfaceExercicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
public class Exercicio07 implements BaseInterfaceExercicio {

    private JFrame tela;
    private JLabel jLabelNome, jLabelQuantidadeHoras, jLabelValorINSS,
            jLabelContribuicaoSindical, jLabelAlmoco,
            jLabelPasse, jLabelEducacao, jLabelSaude, jLabelResultado,
            jLabelCargo;

    private JTextField jTextFieldNome, jTextFieldQuantidadeHoras,
            jTextFieldValorINSS, jTextFieldContribuicaoSindical,
            jTextFieldValorPasse, jTextFieldAuxilioAlmoco,
            jTextFieldAuxilioEducacao, jTextFieldAuxilioSaude;

    private JTextArea jTextAreaResultado;
    private JComboBox jComboBoxCargo;

    private JButton jButtonProcessar;
    private JScrollPane jScrollPaneResultado;

    private DefaultComboBoxModel defaultComboBoxModelCargo;

    public Exercicio07() {
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarLocalizacao();
        gerarDimensoes();
        configurarJScrollPane();
        ConfigurarComboBox();
        AcaojButtonProcessar();
        tela.setVisible(true);
    }

    @Override
    public void gerarTela() {
        tela = new JFrame("Exercicio");
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);

        tela.setSize(500, 450);

    }

    @Override
    public void instanciarComponentes() {
        jLabelNome = new JLabel("Nome");
        jLabelQuantidadeHoras = new JLabel("Quantidade de horas");
        jLabelValorINSS = new JLabel("Valor INSS");
        jLabelContribuicaoSindical = new JLabel("Contribuição Sindical");
        jLabelAlmoco = new JLabel("Auxilio Almoço");
        jLabelPasse = new JLabel("Auxilio Passe");
        jLabelEducacao = new JLabel("Auxilio Educação");
        jLabelSaude = new JLabel("Auxilio Saude");
        jLabelResultado = new JLabel("Resultado");
        jLabelCargo = new JLabel("Cargo");

        jTextFieldNome = new JTextField();
        jTextFieldValorINSS = new JTextField();
        jTextFieldContribuicaoSindical = new JTextField();
        jTextFieldQuantidadeHoras = new JTextField();
        jTextFieldValorPasse = new JTextField();
        jTextFieldAuxilioAlmoco = new JTextField();
        jTextFieldAuxilioEducacao = new JTextField();
        jTextFieldAuxilioSaude = new JTextField();

        jComboBoxCargo = new JComboBox();

        jTextAreaResultado = new JTextArea();

        jScrollPaneResultado = new JScrollPane(jTextAreaResultado);

        jButtonProcessar = new JButton("Processar");

    }

    @Override
    public void adicionarComponentes() {

        tela.add(jLabelNome);
        tela.add(jLabelQuantidadeHoras);
        tela.add(jLabelValorINSS);
        tela.add(jLabelContribuicaoSindical);
        tela.add(jLabelSaude);
        tela.add(jLabelAlmoco);
        tela.add(jLabelPasse);
        tela.add(jLabelEducacao);
        tela.add(jLabelCargo);
        tela.add(jLabelResultado);

        tela.add(jTextFieldNome);
        tela.add(jTextFieldQuantidadeHoras);
        tela.add(jTextFieldValorINSS);
        tela.add(jTextFieldContribuicaoSindical);
        tela.add(jTextFieldValorPasse);
        tela.add(jTextFieldAuxilioAlmoco);
        tela.add(jTextFieldAuxilioEducacao);
        tela.add(jTextFieldAuxilioSaude);

        tela.add(jScrollPaneResultado);
        tela.add(jComboBoxCargo);
        tela.add(jButtonProcessar);
    }

    @Override
    public void gerarLocalizacao() {
        jLabelNome.setLocation(10, 5);
        jLabelCargo.setLocation(10, 50);
        jLabelQuantidadeHoras.setLocation(10, 95);
        jLabelValorINSS.setLocation(10, 140);
        jLabelContribuicaoSindical.setLocation(10, 185);
        jLabelPasse.setLocation(10, 230);
        jLabelAlmoco.setLocation(10, 275);
        jLabelEducacao.setLocation(10, 320);
        jLabelSaude.setLocation(10, 365);
        jLabelResultado.setLocation(225, 5);

        jTextFieldNome.setLocation(10, 25);
        jTextFieldQuantidadeHoras.setLocation(10, 115);
        jTextFieldValorINSS.setLocation(10, 160);
        jTextFieldContribuicaoSindical.setLocation(10, 205);
        jTextFieldValorPasse.setLocation(10, 250);
        jTextFieldAuxilioAlmoco.setLocation(10, 295);
        jTextFieldAuxilioEducacao.setLocation(10, 340);
        jTextFieldAuxilioSaude.setLocation(10, 385);

        jComboBoxCargo.setLocation(10, 70);
        jScrollPaneResultado.setLocation(225, 25);

        jButtonProcessar.setLocation(225, 330);
    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(150, 20);
        jLabelQuantidadeHoras.setSize(150, 20);
        jLabelValorINSS.setSize(150, 25);
        jLabelContribuicaoSindical.setSize(150, 20);
        jLabelPasse.setSize(150, 20);
        jLabelAlmoco.setSize(150, 20);
        jLabelEducacao.setSize(150, 20);
        jLabelSaude.setSize(150, 20);
        jLabelResultado.setSize(150, 20);
        jLabelCargo.setSize(150, 20);

        jTextFieldNome.setSize(200, 25);
        jTextFieldQuantidadeHoras.setSize(200, 25);
        jTextFieldValorINSS.setSize(200, 25);
        jTextFieldContribuicaoSindical.setSize(200, 25);
        jTextFieldValorPasse.setSize(200, 25);
        jTextFieldAuxilioAlmoco.setSize(200, 25);
        jTextFieldAuxilioEducacao.setSize(200, 25);
        jTextFieldAuxilioSaude.setSize(200, 25);

        jScrollPaneResultado.setSize(250, 300);
        jComboBoxCargo.setSize(200, 25);

        jButtonProcessar.setSize(251, 81);
    }

    public void configurarJScrollPane() {
        jScrollPaneResultado.setViewportView(jTextAreaResultado);
        jScrollPaneResultado.setHorizontalScrollBarPolicy(
                jScrollPaneResultado.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneResultado.setVerticalScrollBarPolicy(
                jScrollPaneResultado.VERTICAL_SCROLLBAR_ALWAYS);

    }

    public void ConfigurarComboBox() {
        DefaultComboBoxModel<String> Cargo = new DefaultComboBoxModel<>();
        Cargo.addElement("Programador Júnior");

        Cargo.addElement("Programador Pleno");

        Cargo.addElement("Programador Sênior");

        jComboBoxCargo.setModel(Cargo);
        jComboBoxCargo.setSelectedIndex(-1);
    }

    public void AcaojButtonProcessar() {
        jButtonProcessar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (jTextFieldNome.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Nome deve ser preenchido");
                    jTextFieldNome.requestFocus();
                    return;
                }

                if (jTextFieldQuantidadeHoras.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            " Digite a quantidade de Horas extras");
                    jTextFieldQuantidadeHoras.requestFocus();
                    return;
                }
                if (jTextFieldValorINSS.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Digite o valor de desconto do INSS");
                    jTextFieldValorINSS.requestFocus();
                    return;
                }
                if (jTextFieldValorPasse.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Digite o valor do Vale transporte");
                    jTextFieldValorPasse.requestFocus();
                    return;
                }
                if (jTextFieldAuxilioAlmoco.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Auxilio almoço deve ser preenchido");
                    jTextFieldAuxilioAlmoco.requestFocus();
                    return;
                }
                if (jTextFieldAuxilioEducacao.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Digite o auxilio educação");
                    jTextFieldAuxilioEducacao.requestFocus();
                    return;
                }
                if (jTextFieldAuxilioSaude.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Digite o auxilio saúde");
                    jTextFieldAuxilioSaude.requestFocus();
                    return;
                }
                if (jTextFieldContribuicaoSindical.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Digite o valor da contribuição sindical");
                    jTextFieldContribuicaoSindical.requestFocus();
                    return;
                }
                if (jComboBoxCargo.getSelectedIndex() == -1) {
                    JOptionPane.showMessageDialog(null,
                            "Escolha o cargo");
                    jComboBoxCargo.requestFocus();
                    return;
                }

                
                int salario = 0;
                int hora = 0;
                if (jComboBoxCargo.getSelectedIndex() == 0) {
                    hora = 10;
                    salario = 2300;

                }
                if (jComboBoxCargo.getSelectedIndex() == 1) {
                    hora = 12;
                    salario = 2800;

                }
                if (jComboBoxCargo.getSelectedIndex() == 2) {
                    hora = 18;
                    salario = 4000;

                }
                int horas = 0;
                double INSS = 0, ContribuicaoSindical = 0;
                double auxilioPasse = 0, auxilioAlmoco = 0, auxilioEducacao = 0,
                        auxilioSaude = 0;
                
                try {
                    horas = Integer.parseInt(jTextFieldQuantidadeHoras
                            .getText()
                            .trim()
                            .replace(" ", ""));
                    INSS = Double.parseDouble(jTextFieldValorINSS
                            .getText()
                            .trim()
                            .replace(",", ".")
                            .replace(" ", ""));
                    ContribuicaoSindical = Double.parseDouble(
                            jTextFieldContribuicaoSindical
                            .getText()
                             .trim()
                            .replace(",", ".")
                            .replace(" ", ""));
                    auxilioAlmoco = Double.parseDouble(jTextFieldAuxilioAlmoco
                            .getText()
                            .trim()
                            .replace(",", ".")
                            .replace(" ", ""));
                    auxilioEducacao = Double.parseDouble(jTextFieldAuxilioEducacao
                            .getText()
                            .trim()
                            .replace(",", ".")
                            .replace(" ", ""));
                    auxilioPasse = Double.parseDouble(jTextFieldValorPasse
                            .getText()
                            .trim()
                            .replace(",", ".")
                            .replace(" ", ""));
                    auxilioSaude = Double.parseDouble(jTextFieldAuxilioSaude
                            .getText()
                            .trim()
                            .replace(",", ".")
                            .replace(" ", ""));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,
                            "Somente numeros por favor");
                }
                int totalHoras = hora * horas;
                double totalDescontos = INSS + ContribuicaoSindical;
                double totalAuxilios = auxilioAlmoco + auxilioEducacao +
                        auxilioPasse + auxilioSaude;
                double salarioComDesconto = salario - totalDescontos;
  
                String nome = jTextFieldNome.getText().trim();        
                
                String resultadoSalario = Integer.toString(salario);
                String textoHoras = Integer.toString(hora);
                String textoAuxilioPasse = Double.toString(auxilioPasse);
                String textoAuxilioAlmoco = Double.toString(auxilioAlmoco);
                String textoAuxilioEducacao = Double.toString(auxilioEducacao);
                String textoAuxilioSaude = Double.toString(auxilioSaude);
                String textoINSS = Double.toString(INSS);
                String textoContribuicaoSindical = Double.toString(
                        ContribuicaoSindical);
                String textoTotalAuxilios = Double.toString(totalAuxilios);
                String textoTotalDescontos = Double.toString(totalAuxilios);
                String textoSalarioComDescontos = Double.toString(
                        salarioComDesconto);
                
                        
                jTextAreaResultado.setText("Salario: " + resultadoSalario +
                        textoAuxilioSaude);
                jTextAreaResultado.setText("Quantidade de horas: " 
                        + horas);
                jTextAreaResultado.setText("Valor hora : " + 
                        textoHoras);
                jTextAreaResultado.setText("Auxilio Passe: " + 
                        textoAuxilioPasse);
                jTextAreaResultado.setText("Auxilio Almoço: " + 
                        textoAuxilioAlmoco);
                jTextAreaResultado.setText("Auxilio Educação: " + 
                        textoAuxilioEducacao);
                jTextAreaResultado.setText("Auxilio Saúde: " + 
                        textoAuxilioSaude);
                jTextAreaResultado.setText("Desconto INSS: " + 
                        textoINSS);
                jTextAreaResultado.setText("Contribuição sindical: " 
                        + textoContribuicaoSindical);
                jTextAreaResultado.setText("Total Auxilios: " + 
                        textoTotalAuxilios);
                jTextAreaResultado.setText("Total Descontos: " + 
                        textoTotalDescontos);
                jTextAreaResultado.setText("Total salario: " 
                        + textoSalarioComDescontos);

            }
        });
    }

}
