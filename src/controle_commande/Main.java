package controle_commande;


import elevator.Statut;

public class Main implements controlCommande  {

    @Override
    public void go(int etage) {

    }

    @Override
    public int getPosition() {
        return 0;
    }

    @Override
    public Statut getState() {
        return null;
    }

    @Override
    public boolean stop() {
        return false;
    }
}
