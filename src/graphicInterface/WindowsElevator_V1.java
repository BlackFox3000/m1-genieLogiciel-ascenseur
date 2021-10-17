package graphicInterface;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class WindowsElevator_V1 extends JFrame {

    private static final long serialVersionUID = -4939544011287453046L;

    public WindowsElevator_V1(int nb_etage) throws UnsupportedLookAndFeelException {
        super("Gestion ascenseur");

        UIManager.setLookAndFeel(new NimbusLookAndFeel());

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600,400);
        this.setLocationRelativeTo(null);

        JPanel contentPanel = (JPanel) this.getContentPane();
        //Stratégi de positionnement
        //contentPanel.setLayout(new FlowLayout());

        /**
         * Parti suivit ascenseur ( ou affichage )
         */
        contentPanel.add(createLayoutSuivit(),BorderLayout.NORTH);

        /**
         * Parti simulation étages
         */
        contentPanel.add(createLayoutLevelsOutElevator(nb_etage),BorderLayout.WEST);

        /**
         * Partie Stop
         */
        contentPanel.add(createLayoutStop(),BorderLayout.CENTER);
        /**
         * Partie interrieur ascenseur
         */

        contentPanel.add(createLayoutLevelsIntoElevator(nb_etage),BorderLayout.EAST);
    }

    private JPanel createLayoutStop() {
        JPanel jPanel = new JPanel();
        jPanel.add(new JButton("STOP"),BorderLayout.CENTER);
        return jPanel;
    }

    private JPanel createLayoutLevelsIntoElevator(int nb_etage) {
        JPanel toolBar = new JPanel();
        toolBar.setLayout(new GridLayout( (int) Math.ceil((double) nb_etage/3), 3, 10, 10));
        for (int i=0; i<nb_etage ; i++)
            toolBar.add(new JButton(" "+i+" "));

        return toolBar;

    }

    private JToolBar createLayoutSuivit() {
        JToolBar toolBar = new JToolBar();

        JLabel txtSuivit = new JLabel("Suivit ascenseur: ");
        JLabel txtEspaceSuivit = new JLabel("   ");

        JLabel txtInfoPosition = new JLabel("Position: ");
        JLabel txtValuePosition = new JLabel("0:");
        JLabel txtEspacePosition = new JLabel("   ");

        JLabel txtInfoEtat = new JLabel("Etat: ");
        JLabel txtValueEtat = new JLabel("Wait");
        JLabel txtEspaceEtat = new JLabel("   ");

        JLabel txtInfoDirection = new JLabel("Direction: ");
        JLabel txtValueDirection = new JLabel(" x ");
        JLabel txtEspaceDirection = new JLabel("   ");

        toolBar.add(txtSuivit);
        toolBar.add(txtEspaceSuivit);

        toolBar.add(txtInfoPosition);
        toolBar.add(txtValuePosition);
        toolBar.add(txtEspacePosition);

        toolBar.add(txtInfoEtat);
        toolBar.add(txtValueEtat);
        toolBar.add(txtEspaceEtat);

        toolBar.add(txtInfoDirection);
        toolBar.add(txtValueDirection);
        toolBar.add(txtEspaceDirection);

        return toolBar;
    }

    private JPanel createLayoutLevelsOutElevator(int nb_etage) {
        JPanel toolBar = new JPanel();
        toolBar.setLayout(new GridLayout( nb_etage, 1, 10, 10));

        for (int i=0; i<nb_etage ; i++){
            JPanel toolBarLevel = new JPanel
                    ();

            JLabel txtNumberLevel = new JLabel("n°"+i+": ");
            toolBarLevel.add(txtNumberLevel);

            JLabel txtCall = new JLabel("appeler: ");
            toolBarLevel.add(txtCall);

            JPanel btns = new JPanel();
            JButton up   = new JButton(" ↑ ");
            JButton down = new JButton(" ↓ ");
            btns.add(up,BorderLayout.NORTH);
            btns.add(down, BorderLayout.SOUTH);

            JCheckBox checkCall = new JCheckBox();
            checkCall.setEnabled(false);

            toolBarLevel.add(btns);
            toolBarLevel.add(checkCall);
            toolBar.add(toolBarLevel);

        }

        return toolBar;
    }

    public static void main (String[] args) throws UnsupportedLookAndFeelException {
        //style
        UIManager.setLookAndFeel(new NimbusLookAndFeel());

        WindowsElevator_V1 windowsElevatorV1 = new WindowsElevator_V1(6);
        windowsElevatorV1.setVisible(true);
    }

    public void run() throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());

        WindowsElevator_V1 windowsElevatorV1 = new WindowsElevator_V1(6);
        windowsElevatorV1.setVisible(true);
    }
}
