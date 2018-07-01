
/**
 *
 * @author Gus
 */
import Exercicio01.BaseInterfaceExercicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TodosExercicios implements BaseInterfaceExercicio {

    private JFrame jFrame;
    private JButton jButton01;
    private JButton jButton02;
    private JButton jButton03;
    private JButton jButton04;
    private JButton jButton05;
    private JButton jButton06;
    private JButton jButton07;
    private JButton jButton08;
    private JButton jButton09;
    private JLabel imagem;

    public TodosExercicios() {
        gerarTela();
        instanciarComponentes();
        ConfigurandoLookAndFeel();
        adicionarComponentes();
        gerarLocalizacao();
        gerarDimensoes();
        acaoJButton01();
        acaoJButton02();
        acaoJButton03();
        acaoJButton04();
        acaoJButton05();
        acaoJButton06();
        acaoJButton07();
        acaoJButton08();
        acaoJButton09();

        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame("Todos Exercicios");
        //jFrame.setIconImage( new ImageIcon("Icons/entra21.jpg").getImage());

        jFrame.setIconImage(new ImageIcon(TodosExercicios.class
                .getResource("Icons/aplicacao.png")).getImage());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setSize(360, 395);
        jFrame.setLocationRelativeTo(null);

    }

    @Override
    public void adicionarComponentes() {

        jFrame.add(jButton01);
        jFrame.add(jButton02);
        jFrame.add(jButton03);
        jFrame.add(jButton04);
        jFrame.add(jButton05);
        jFrame.add(jButton06);
        jFrame.add(jButton07);
        jFrame.add(jButton08);
        jFrame.add(jButton09);
        jFrame.add(imagem);

    }

    @Override
    public void instanciarComponentes() {

        jButton01 = new JButton("Exemplo 01");
        jButton02 = new JButton("Exemplo 02");
        jButton03 = new JButton("Exemplo 03");
        jButton04 = new JButton("Exemplo 04");
        jButton05 = new JButton("Exemplo 05");
        jButton06 = new JButton("Exemplo 06");
        jButton07 = new JButton("Exemplo 07");
        jButton08 = new JButton("Exemplo 08");
        jButton09 = new JButton("Exemplo 09");
        imagem = new JLabel();
        imagem.setIcon(new ImageIcon(getClass().getResource(
                "Icons/Dark.jpg")));

    }

    @Override
    public void gerarLocalizacao() {

        jButton01.setLocation(10, 10);
        jButton02.setLocation(120, 10);
        jButton03.setLocation(230, 10);
        jButton04.setLocation(10, 120);
        jButton05.setLocation(120, 120);
        jButton06.setLocation(230, 120);
        jButton07.setLocation(10, 230);
        jButton08.setLocation(120, 230);
        jButton09.setLocation(230, 230);
        imagem.setLocation(0, 0);
    }

    @Override
    public void gerarDimensoes() {

        jButton01.setSize(100, 100);
        jButton02.setSize(100, 100);
        jButton03.setSize(100, 100);
        jButton04.setSize(100, 100);
        jButton05.setSize(100, 100);
        jButton06.setSize(100, 100);
        jButton07.setSize(100, 100);
        jButton08.setSize(100, 100);
        jButton09.setSize(100, 100);
        imagem.setSize(360, 400);

    }

    public void acaoJButton01() {
        jButton01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio01.Exercicio01();

            }
        });
    }

    public void acaoJButton02() {
        jButton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio02.Exercicio02();
            }
        });
    }

    public void acaoJButton03() {
        jButton03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio03.Exercicio03();
            }
        });
    }

    public void acaoJButton04() {
        jButton04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio04.Exercicio04();
            }
        });
    }

    public void acaoJButton05() {
        jButton05.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio05.Exercicio05();

            }
        });
    }

    public void acaoJButton06() {
        jButton06.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio06.Exercicio06();
            }
        });
    }

    public void acaoJButton07() {
        jButton07.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton08() {
        jButton08.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton09() {
        jButton09.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void ConfigurandoLookAndFeel() {
        try {
            javax.swing.UIManager.setLookAndFeel(
                    "aero.AerolLookAndFeel");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    

    /*public static void ConfigurandoLookAndFeel() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager
                    .getInstalledLookAndFeels()) {
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
    } */
}
