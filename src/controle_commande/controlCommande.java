package controle_commande;

import elevator.Statut;

public interface controlCommande {

    void go(int etage);

    int getPosition();

    Statut getState();

    // void eval(request, level,state);

    boolean stop();

}
