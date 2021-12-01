import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tela extends JFrame {
    private JButton bt1;
    private JButton bt2;
    private JButton bt3;
    private JButton bt4;
    private JButton bt5;
    private JButton bt6;
    private JButton bt7;
    private JButton bt8;
    private JButton bt9;
    private static Tela frame;
    boolean player;

    public Tela() {
        iniciarComponentes();
        definirEventos();
    }

    private void iniciarComponentes() {
        setTitle("Tic-Tac-Toe (Lucas Cardoso Pereira - 1AI - 2021)");
        setBounds(0, 0, 500, 500);
        setLayout(null);
    }

    private void definirEventos() {

    }

    public static void iniciarTela() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                frame = new Tela();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation((tela.width - frame.getSize().width)/2, (tela.height - frame.getSize().height)/2);
                frame.setVisible(true);
                frame.setResizable(false);
            }
        });
    }
}