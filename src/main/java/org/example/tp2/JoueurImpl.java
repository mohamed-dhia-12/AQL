package org.example.tp2;

public class JoueurImpl implements Joueur {
    private int solde;

    public JoueurImpl(int soldeInitial) {
        this.solde = soldeInitial;
    }

    @Override
    public int mise() {
        return solde;
    }

    @Override
    public void debiter(int somme) throws DebitImpossibleException {
        if (solde < somme) {
            throw new DebitImpossibleException("Solde insuffisant");
        }
        solde -= somme;
    }

    @Override
    public void crediter(int somme) {
        solde += somme;
    }
}
