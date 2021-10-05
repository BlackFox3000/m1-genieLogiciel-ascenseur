package graphicInterface;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class MyWindow extends JFrame {

    private static final long serialVersionUID = -4939544011287453046L;

    public MyWindow(int nb_etage){
        super("Gestion ascenseur");

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600,400);
        this.setLocationRelativeTo(null);

        JPanel contentPanel = (JPanel) this.getContentPane();
        contentPanel.setLayout(new FlowLayout());
        contentPanel.add(new JTextField("Bouton interne à l'ascenseur"));
        for(int i=0; i<nb_etage ;i++)
            contentPanel.add(new JButton("Etage n°"+i));
        contentPanel.add(new JButton("Stop"));

        contentPanel.add(new JTextField("Bouton exterieur à l'ascenseur"));
        contentPanel.add(new JButton("Reset"));
        contentPanel.add(new JTextField("Numéro d'étage"));
        contentPanel.add(new JButton("Se placer sur cette étage"));
        contentPanel.add(new JButton("Up"));
        contentPanel.add(new JButton("Down"));

    }

    public static void main (String[] args) throws UnsupportedLookAndFeelException {
        //style
        UIManager.setLookAndFeel(new NimbusLookAndFeel());

        MyWindow myWindow = new MyWindow(6);
        myWindow.setVisible(true);
    }
}
