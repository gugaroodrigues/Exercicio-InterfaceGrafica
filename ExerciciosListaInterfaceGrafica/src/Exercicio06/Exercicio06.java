/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio06;

import Exercicio01.BaseInterfaceExercicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gus
 */
public class Exercicio06 implements BaseInterfaceExercicio {

    private JFrame tela;
    private JLabel jLabelNome, jLabelIdade,
            jLabelPeso, jLabelAltura, jLabelResultadoIMC;
    private JTextField jTextFieldNome, jTextFieldIdade,
            jTextFieldPeso, jTextFieldAltura;
    private JButton jButtonIMC;
    private JTable jTableIMC;
    private DefaultTableModel dtm;
    private JScrollPane jScrollPaneTabelaIMC;

    public Exercicio06() {
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarDimensoes();
        gerarLocalizacao();
        configurarTable();
        AcaoGerar();

        tela.setVisible(true);
    }

    @Override
    public void gerarTela() {
        tela = new JFrame("Exercicio 06");
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setLayout(null);
        tela.setLocationRelativeTo(null);
        tela.setSize(510, 280);

    }

    @Override
    public void instanciarComponentes() {
        jLabelNome = new JLabel("Nome");
        jLabelIdade = new JLabel("Idade");
        jLabelAltura = new JLabel("Altura");
        jLabelPeso = new JLabel("Peso");
        jLabelResultadoIMC = new JLabel("Resultado IMC");

        jTextFieldNome = new JTextField();
        jTextFieldIdade = new JTextField();
        jTextFieldAltura = new JTextField();
        jTextFieldPeso = new JTextField();

        jButtonIMC = new JButton("Calcular");

        jTableIMC = new JTable();
        jScrollPaneTabelaIMC = new JScrollPane(jTableIMC);

    }

    @Override
    public void adicionarComponentes() {
        tela.add(jLabelNome);
        tela.add(jLabelIdade);
        tela.add(jLabelAltura);
        tela.add(jLabelPeso);

        tela.add(jTextFieldNome);
        tela.add(jTextFieldIdade);
        tela.add(jTextFieldAltura);
        tela.add(jTextFieldPeso);

        tela.add(jButtonIMC);
        tela.add(jScrollPaneTabelaIMC);
    }

    @Override
    public void gerarLocalizacao() {
        jLabelNome.setLocation(10, 5);
        jLabelIdade.setLocation(10, 50);
        jLabelAltura.setLocation(10, 95);
        jLabelPeso.setLocation(10, 140);

        jTextFieldNome.setLocation(10, 25);
        jTextFieldIdade.setLocation(10, 70);
        jTextFieldAltura.setLocation(10, 115);
        jTextFieldPeso.setLocation(10, 160);

        jButtonIMC.setLocation(10, 190);
        jScrollPaneTabelaIMC.setLocation(225, 10);

    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(150, 20);
        jLabelIdade.setSize(150, 20);
        jLabelAltura.setSize(150, 20);
        jLabelPeso.setSize(150, 20);

        jTextFieldNome.setSize(200, 25);
        jTextFieldIdade.setSize(200, 25);
        jTextFieldAltura.setSize(200, 25);
        jTextFieldPeso.setSize(200, 25);

        jButtonIMC.setSize(200, 50);
        jScrollPaneTabelaIMC.setSize(255, 224);
    }

    private void configurarTable() {
        dtm = new DefaultTableModel(new Object[]{"Classificação", "Valor do IMC"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        dtm.addRow(new Object[]{
            "Até .99", "Desnutrição Grau V"
        });
        dtm.addRow(new Object[]{
            " De 10 até 12,9\n ", "Desnutrição Grau IV \n "
        });
        dtm.addRow(new Object[]{
            "De 13 até 15,9", "Desnutrição Grau III"
        });
        dtm.addRow(new Object[]{
            "De 16 até 16,9", "Desnutrição Grau II"
        });
        dtm.addRow(new Object[]{
            "De 17 até 18,4", "Desnutrição Grau I"
        });
        dtm.addRow(new Object[]{
            "De 18,5 até 24,9", "Normal"
        });
        dtm.addRow(new Object[]{
            "De 25 até 29,9", "Pré-obesidade"
        });
        dtm.addRow(new Object[]{
            "De 30 até 34,5", "Obesidade Grau I"
        });

        dtm.addRow(new Object[]{
            "De 35 até 39,9", "Obesidade Grau II"
        });
        dtm.addRow(new Object[]{
            "Maior que 39,9", "Obesidade Grau III"
        });

        jTableIMC.setModel(dtm);

    }

    private void AcaoGerar() {
        jButtonIMC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (jTextFieldNome.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Nome deve ser preenchido");
                    jTextFieldNome.requestFocus();
                    return;
                }
                if (jTextFieldIdade.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Digite sua idade");
                    jTextFieldIdade.requestFocus();
                    return;
                }
                if (jTextFieldAltura.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            " Digite sua Altura");
                    jTextFieldAltura.requestFocus();
                    return;
                }
                if (jTextFieldPeso.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Digite seu peso");
                    jTextFieldPeso.requestFocus();
                    return;
                }

                String nome = jTextFieldNome.getText().trim();
                byte idade = 0;
                double altura = 0;
                double peso = 0;

                try {
                    idade = Byte.parseByte(jTextFieldIdade.getText().trim());
                    altura = Double.parseDouble(jTextFieldAltura.getText()
                            .trim().replace(",", "."));
                    peso = Double.parseDouble(jTextFieldPeso.getText()
                            .replace(",", "."));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,
                            "Cê é burro cara?\n DIGITE APENAS NUMEROS");
                    return;
                }

                double imc = peso / (altura * altura);

                if (imc <= 0.99) {
                    JOptionPane.showMessageDialog(null,
                            "Nome: " + nome + "\nIdade: " + idade
                            + "\nAltura: " + altura + "\nPeso: " + peso
                            + " \nValor do IMC " + imc + "\nGrau: Desnutrição Grau V");
                }

                if (imc <= 12.99 && imc > 1) {
                    JOptionPane.showMessageDialog(null,
                            "\nNome: " + nome + "\nIdade: " + idade
                            + "\nAltura: " + altura + "\nPeso: " + peso
                            + " \nValor do IMC " + imc + "\nGrau: Desnutrição Grau IV");
                }

                if ( imc > 13 && imc <= 15.9) {
                    JOptionPane.showMessageDialog(null,
                            "\nNome: " + nome + "\nIdade: " + idade
                            + "\nAltura: " + altura + "\nPeso: " + peso
                            + " \nValor do IMC " + imc + "\nGrau: Desnutrição Grau III");
                }

                if ( imc > 16 && imc <= 16.9) {
                    JOptionPane.showMessageDialog(null,
                            "\nNome: " + nome + "\nIdade: " + idade
                            + "\nAltura: " + altura + "\nPeso: " + peso
                            + "\nValor do IMC " + imc + "\nGrau: Desnutrição Grau II");
                }

                if ( imc > 17 && imc <= 18.4) {
                    JOptionPane.showMessageDialog(null,
                            "\nNome: " + nome + "\nIdade: " + idade
                            + "\nAltura: " + altura + "\nPeso: " + peso
                            + " \nValor do IMC " + imc + "\nGrau: Desnutrição Grau I");
                }

                if ( imc > 18.5 && imc <= 24.9) {
                    JOptionPane.showMessageDialog(null,
                            "\nNome: " + nome + "\nIdade: " + idade
                            + "\nAltura: " + altura + "\nPeso: " + peso
                            + " \nValor do IMC " + imc + "\nGrau: Normal");
                }

                if ( imc > 25 && imc <= 29.9) {
                    JOptionPane.showMessageDialog(null,
                            "\nNome: " + nome + "\nIdade: " + idade
                            + "\nAltura: " + altura + "\nPeso: " + peso
                            + " \nValor do IMC " + imc + "\nGrau: Pré -Obesidade");
                }

                if ( imc > 30 && imc <= 34.5) {
                    JOptionPane.showMessageDialog(null,
                            "\nNome: " + nome + "\nIdade: " + idade
                            + "\nAltura: " + altura + "\nPeso: " + peso
                            + " \nValor do IMC " + imc + "\nGrau: Obesidade Grau I");
                }
                if ( imc > 34.5 && imc <= 39.9) {
                    JOptionPane.showMessageDialog(null,
                            "\nNome: " + nome + "\nIdade: " + idade
                            + "\nAltura: " + altura + "\nPeso: " + peso
                            + " \nValor do IMC " + imc + "\nGrau: Obesidade Grau II");
                }

                if (imc > 39.9) {
                    JOptionPane.showMessageDialog(null,
                            "\nNome: " + nome + "\nIdade: " + idade
                            + "\nAltura: " + altura + "\nPeso: " + peso
                            + " \nValor do IMC " + imc + "\nGrau: Obesidade Grau III");
                }

            }
        });
    }

}
